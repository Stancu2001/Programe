import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LibrarianSuccess extends JFrame {
    static LibrarianSuccess frame;
    private JFrame contentpane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new LibrarianSuccess();
                    //frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public LibrarianSuccess() {
        contentpane = new JFrame();
        contentpane.setBounds(1000, 600, 800, 400);
        contentpane.setVisible(true);
        contentpane.setSize(350,450);
        contentpane.setLayout(null);
        contentpane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblLibrarianSection = new JLabel("Meniu");
        lblLibrarianSection.setFont(new Font("Tahoma", Font.PLAIN, 22));

        JButton btnNewButton = new JButton("Add Books");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentpane.dispose();
                AddBook.main(new String[]{});
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JButton btnViewBooks = new JButton("View Books");
        btnViewBooks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                contentpane.dispose();
                ViewBooks.main(new String[]{});
            }
        });
        btnViewBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JButton btnIssueBook = new JButton("Issue Book");
        btnIssueBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentpane.dispose();
                IssueBook.main(new String[]{});
            }
        });
        btnIssueBook.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JButton btnViewIssuedBooks = new JButton("View Issued Books");
        btnViewIssuedBooks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentpane.dispose();
                ViewIssuedBooks.main(new String[]{});
            }
        });
        btnViewIssuedBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JButton btnReturnBook = new JButton("Return Book");
        btnReturnBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentpane.dispose();
                ReturnBook.main(new String[]{});
            }
        });
        btnReturnBook.setFont(new Font("Tahoma", Font.PLAIN, 13));

        JButton btnSearch = new JButton("Search");
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentpane.dispose();
                Search.main(new String[]{});
            }
        });
        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contentpane.dispose();
                System.exit(0);
            }
        });
        lblLibrarianSection.setBounds(130,0,100,50);
        btnNewButton.setBounds(120,50,100,30);
        btnViewBooks.setBounds(120,100,100,30);
        btnIssueBook.setBounds(120,150,100,30);
        btnViewIssuedBooks.setBounds(60,200,200,30);
        btnReturnBook.setBounds(60,250,200,30);
        btnSearch.setBounds(120,300,100,30);
        btnExit.setBounds(120,350,100,30);
        contentpane.add(lblLibrarianSection);
        contentpane.add(btnNewButton);
        contentpane.add(btnIssueBook);
        contentpane.add(btnViewBooks);
        contentpane.add(btnViewIssuedBooks);
        contentpane.add(btnSearch);
        contentpane.add(btnReturnBook);
        contentpane.add(btnExit);

    }

}
