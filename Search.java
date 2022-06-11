import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Search extends JFrame {
    static Search frame;
    private JFrame contentpane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame=new Search();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Search() {
        contentpane = new JFrame();
        contentpane.setBounds(1000, 600, 800, 400);
        contentpane.setVisible(true);
        contentpane.setSize(300,300);
        contentpane.setLayout(null);
        contentpane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel Cauta = new JLabel("Cauta dupa");
        Cauta.setFont(new Font("Tahoma", Font.PLAIN, 22));

        JButton btnAutor = new JButton("Autor");
        btnAutor.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentpane.dispose();
                SearchAutor.main(new String[]{});
            }
        });

        JButton btnTitlu = new JButton("Titlu");
        btnTitlu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentpane.dispose();
                SearchTitlu.main(new String[]{});
            }
        });
        JButton btnback = new JButton("Back");
        btnback.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentpane.dispose();
                LibrarianSuccess.main(new String[]{});
            }
        });
        Cauta.setBounds(100,0,300,30);
        btnTitlu.setBounds(90,50,100,30);
        btnAutor.setBounds(90,100,100,30);
        btnback.setBounds(90,150,100,30);
        contentpane.add(Cauta);
        contentpane.add(btnTitlu);
        contentpane.add(btnAutor);
        contentpane.add(btnback);
    }

}
