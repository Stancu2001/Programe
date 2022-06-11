import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IssueBook extends JFrame {
    static IssueBook frame;
    private JFrame contentpane;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new IssueBook();
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
    public IssueBook() {
        contentpane = new JFrame();
        contentpane.setBounds(1000, 600, 800, 400);
        contentpane.setVisible(true);
        contentpane.setSize(350,600);
        contentpane.setLayout(null);
        contentpane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblNewLabel = new JLabel("Imprumut carte ");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel.setForeground(Color.GRAY);

        JLabel lblBookName = new JLabel("Nume carte:");
        JLabel lblBookId = new JLabel("Volum:");
        textField_1 = new JTextField();
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setColumns(10);

        textField_4 = new JTextField();
        textField_4.setColumns(10);

        textField_5 = new JTextField();
        textField_5.setColumns(10);

        JLabel lblStudentId = new JLabel("Id student:");

        JLabel lblStudentName = new JLabel("Nume student:");

        JLabel lblStudentContact = new JLabel("Contact student:");

        JButton btnIssueBook = new JButton("Issue Book");
        btnIssueBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String name = textField_1.getText();
                int studentid = Integer.parseInt(textField_2.getText());
                String studentname = textField_3.getText();
                String studentcontact = textField_4.getText();
                if (!IssueBookDao.checkBook(name)) {
                    JOptionPane.showMessageDialog(IssueBook.this, "Numele nu exista!");
                } else {
                        int i = IssueBookDao.save(name, studentid, studentname, studentcontact);
                        if (i > 0) {
                            JOptionPane.showMessageDialog(IssueBook.this, "Book issued successfully!");
                            contentpane.dispose();
                            IssueBook.main(new String[]{});

                        } else {
                            JOptionPane.showMessageDialog(IssueBook.this, "Sorry, unable to issue!");
                        }

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
        lblNewLabel.setBounds(80,0,1000,30);
        lblBookName.setBounds(20,50,200,30);
        textField_1.setBounds(120,50,200,30);
        lblStudentName.setBounds(20,100,100,30);
        textField_3.setBounds(120,100,200,30);
        lblStudentId.setBounds(20,150,100,30);
        textField_2.setBounds(120,150,200,30);
        lblStudentContact.setBounds(20,200,100,30);
        textField_4.setBounds(120,200,200,30);
        btnIssueBook.setBounds(80,250,100,30);
        btnBack.setBounds(200,250,100,30);
        contentpane.add(lblNewLabel);
        contentpane.add(lblBookName);
        contentpane.add(textField_1);
        contentpane.add(lblStudentName);
        contentpane.add(textField_3);
        contentpane.add(lblStudentId);
        contentpane.add(textField_2);
        contentpane.add(lblStudentContact);
        contentpane.add(textField_4);
        contentpane.add(btnIssueBook);
        contentpane.add(btnBack);
    }
}
