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

public class AddBook extends JFrame {
    static AddBook frame;
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
                    frame=new AddBook();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public AddBook() {
        contentpane = new JFrame();
        contentpane.setBounds(1000, 600, 800, 400);
        contentpane.setVisible(true);
        contentpane.setSize(300,600);
        contentpane.setLayout(null);
        contentpane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblAddBooks = new JLabel("Adauga carte");
        lblAddBooks.setForeground(Color.GRAY);
        lblAddBooks.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblName = new JLabel("Titlu:");

        JLabel lblAuthor = new JLabel("Autor:");

        JLabel lblPublisher = new JLabel("Editura:");

        JLabel lblQuantity = new JLabel("Cantitate:");
        JLabel lblPages = new JLabel("Numar pagini:");
        JLabel lblPrice = new JLabel("Pret:");
        JLabel lblId = new JLabel("Id Carte:");
        JLabel lblAn = new JLabel("Anul aparitiei:");

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

        textField_6 = new JTextField();
        textField_6.setColumns(10);

        textField_7 = new JTextField();
        textField_7.setColumns(10);

        textField_8 = new JTextField();
        textField_8.setColumns(10);

        JButton btnAddBooks = new JButton("Add Books");
        btnAddBooks.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name=textField_1.getText();
                String author=textField_2.getText();
                String publisher=textField_3.getText();
                String squantity=textField_4.getText();
                int quantity=Integer.parseInt(squantity);
                String spage=textField_5.getText();
                int page=Integer.parseInt(spage);
                String sprice=textField_7.getText();
                int price=Integer.parseInt(sprice);
                String Sid=textField_8.getText();
                int Id=Integer.parseInt(Sid);
                String SAn=textField_6.getText();
                int An=Integer.parseInt(SAn);
                int i= AddBookDao.save(Id, name, author, publisher, quantity,page,price,An);
                if(i>0){
                    JOptionPane.showMessageDialog(AddBook.this,"Books added successfully!");
                    contentpane.dispose();
                    AddBook.main(new String[]{});

                }else{
                    JOptionPane.showMessageDialog(AddBook.this,"Sorry, unable to save!");
                }
            }
        });

        JButton btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contentpane.dispose();
                LibrarianSuccess.main(new String[]{});
            }
        });
        lblAddBooks.setBounds(80,0,200,30);
        lblId.setBounds(10,50,100,30);
        textField_8.setBounds(100,50,100,30);
        lblName.setBounds(10,100,100,30);
        textField_1.setBounds(100,100,100,30);
        lblAuthor.setBounds(10,150,100,30);
        textField_2.setBounds(100,150,100,30);
        lblPublisher.setBounds(10,200,100,30);
        textField_3.setBounds(100,200,100,30);
        lblQuantity.setBounds(10,250,100,30);
        textField_4.setBounds(100,250,100,30);
        lblPages.setBounds(10,300,100,30);
        textField_5.setBounds(100,300,100,30);
        lblPrice.setBounds(10,350,100,30);
        textField_7.setBounds(100,350,100,30);
        lblAn.setBounds(10,400,100,30);
        textField_6.setBounds(100,400,100,30);
        btnAddBooks.setBounds(100,450,100,30);
        btnBack.setBounds(100,500,100,30);
        contentpane.add(lblAddBooks);
        contentpane.add(lblName);
        contentpane.add(textField_1);
        contentpane.add(lblAuthor);
        contentpane.add(textField_2);
        contentpane.add(lblPublisher);
        contentpane.add(textField_3);
        contentpane.add(lblQuantity);
        contentpane.add(textField_4);
        contentpane.add(lblPages);
        contentpane.add(textField_5);
        contentpane.add(lblPrice);
        contentpane.add(textField_7);
        contentpane.add(btnAddBooks);
        contentpane.add(btnBack);
        contentpane.add(lblId);
        contentpane.add(textField_8);
        contentpane.add(lblAn);
        contentpane.add(textField_6);

    }

}
