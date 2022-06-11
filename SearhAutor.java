import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout.Alignment;

import java.awt.Font;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class SearchAutor extends JFrame {
    static SearchAutor frame;
    private JFrame contentpane;
    private JTextField textField;
    private JTextField textField_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new SearchAutor();
                    // frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public SearchAutor() {
        contentpane = new JFrame();
        contentpane.setBounds(1000, 600, 400, 400);
        contentpane.setVisible(true);
        contentpane.setSize(350,300);
        contentpane.setLayout(null);
        contentpane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblAutorBook = new JLabel("Cauta dupa autor");
        lblAutorBook.setForeground(Color.GRAY);
        lblAutorBook.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblBookTitle = new JLabel("Autor:");

        textField = new JTextField();
        textField.setColumns(10);



        JButton btnSearchBook = new JButton("Search");
        btnSearchBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                SearchAutorDao a=new SearchAutorDao(name);
                a.setVisible(true);
            }});

        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentpane.dispose();
                Search.main(new String[]{});
            }
        });
        lblAutorBook.setBounds(100,0,500,30);
        lblBookTitle.setBounds(20,50,100,30);
        textField.setBounds(100,50,150,30);
        btnSearchBook.setBounds(50,100,125,30);
        btnBack.setBounds(200,100,70,30);
        contentpane.add(lblAutorBook);
        contentpane.add(lblBookTitle);
        contentpane.add(textField);
        contentpane.add(btnSearchBook);
        contentpane.add(btnBack);

    }

}
