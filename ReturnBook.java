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

public class ReturnBook extends JFrame {
    static ReturnBook frame;
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
                    frame = new ReturnBook();
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
    public ReturnBook() {
        contentpane = new JFrame();
        contentpane.setBounds(1000, 600, 400, 400);
        contentpane.setVisible(true);
        contentpane.setSize(350,300);
        contentpane.setLayout(null);
        contentpane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblReturnBook = new JLabel("Return Book");
        lblReturnBook.setForeground(Color.GRAY);
        lblReturnBook.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblBookTitle = new JLabel("Titlu:");
        JLabel lblBookId = new JLabel("Volum:");
        JLabel lblStudentId = new JLabel("Student Id:");

        textField = new JTextField();
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setColumns(10);


        JButton btnReturnBook = new JButton("Return Book");
        btnReturnBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name=textField.getText();
                int studentid=Integer.parseInt(textField_1.getText());
                int i=ReturnBookDao.delete(name, studentid);
                if(i>0){
                    JOptionPane.showMessageDialog(ReturnBook.this,"Book returned successfully!");
                    contentpane.dispose();
                    ReturnBook.main(new String[]{});

                }else{
                    JOptionPane.showMessageDialog(ReturnBook.this,"Sorry, unable to return book!");
                }
            }
        });
        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentpane.dispose();
                LibrarianSuccess.main(new String[]{});
            }
        });
        lblReturnBook.setBounds(120,0,100,30);
        lblBookTitle.setBounds(20,50,100,30);
        textField.setBounds(100,50,150,30);
        lblStudentId.setBounds(20,100,100,30);
        textField_1.setBounds(100,100,150,30);
        btnReturnBook.setBounds(50,150,125,30);
        btnBack.setBounds(200,150,70,30);
        contentpane.add(lblReturnBook);
        contentpane.add(lblBookTitle);
        contentpane.add(textField);
        contentpane.add(lblStudentId);
        contentpane.add(textField_1);
        contentpane.add(btnReturnBook);
        contentpane.add(btnBack);

    }

}
