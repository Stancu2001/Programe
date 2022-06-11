import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class AdminLogin extends JFrame {
    static AdminLogin frame;
    private JFrame contentPane;
    private JTextField textField;
    private JPasswordField passwordField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame = new AdminLogin();
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
    public AdminLogin() {
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JFrame();
        contentPane.setBounds(1000, 600, 800, 400);
        contentPane.setVisible(true);
        contentPane.setSize(350,300);
        contentPane.setLayout(null);
        contentPane.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lblAdminLoginForm = new JLabel("Login");
        lblAdminLoginForm.setForeground(Color.GRAY);
        lblAdminLoginForm.setFont(new Font("Tahoma", Font.PLAIN, 18));

        JLabel lblEnterName = new JLabel("Enter Name:");

        JLabel lblEnterPassword = new JLabel("Enter Password:");

        textField = new JTextField();
        textField.setColumns(10);

        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name=textField.getText();
                String password=String.valueOf(passwordField.getPassword());
                if(name.equals("a")&&password.equals("a")){
                    contentPane.dispose();
                    LibrarianSuccess.main(new String[]{});
                }else{
                    JOptionPane.showMessageDialog(AdminLogin.this, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
                    textField.setText("");
                    passwordField.setText("");
                }
            }
        });

        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                passwordField.setText("");
            }
        });
        passwordField=new JPasswordField();
        lblAdminLoginForm.setBounds(125,0,100,50);
        btnLogin.setBounds(135,150,100,30);
        lblEnterName.setBounds(10,50,100,30);
        lblEnterPassword.setBounds(10,100,100,30);
        passwordField.setBounds(120,100,150,30);
        textField.setBounds(120,50,150,30);
        contentPane.add(btnLogin);
        contentPane.add(lblAdminLoginForm);
        contentPane.add(lblEnterName);
        contentPane.add(textField);
        contentPane.add(lblEnterPassword);
        contentPane.add(passwordField);
    }
}
