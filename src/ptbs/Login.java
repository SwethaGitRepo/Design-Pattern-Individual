package ptbs;

import javax.swing.*;

import ptbs.UserInfoItem.UserType;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Login extends JDialog {

    boolean m_bExit = true;
    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JButton loginButton = new JButton();
    JButton buttonExit = new JButton();
    JTextField userNameText = new JTextField();
    JPasswordField passwordText = new JPasswordField();
    JRadioButton buyerRadio = new JRadioButton();
    JRadioButton sellerRadio = new JRadioButton();
    ButtonGroup buttonGroup1 = new ButtonGroup();
    ////// Attributes Added By me
    private String userBox = null;
    private UserType userType = UserType.Buyer; // default to buyer

    public Login() {
        try {
            jbInit();
            setSize(300, 300);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
    	setLocation(500,200);
    	setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setTitle("Welcome to PTBS System");
        this.getContentPane().setLayout(null);
        jLabel1.setText("UserName");
        jLabel1.setBounds(new Rectangle(26, 52, 80, 18));
        jLabel2.setText("Password");
        jLabel2.setBounds(new Rectangle(23, 119, 80, 18));
        loginButton.setText("Login");
        loginButton.setBounds(new Rectangle(31, 212, 85, 28));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loginButton_actionPerformed(e);
            }
        });
        buttonExit.setText("Exit");
        buttonExit.setBounds(new Rectangle(180, 211, 97, 28));
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonExit_actionPerformed(e);
            }
        });
        userNameText.setBounds(new Rectangle(119, 52, 144, 22));
        passwordText.setBounds(new Rectangle(118, 119, 147, 22));
        buyerRadio.setSelected(true);
        buyerRadio.setText("Buyer");
        buyerRadio.setBounds(new Rectangle(37, 164, 103, 26));
        sellerRadio.setText("Seller");
        sellerRadio.setBounds(new Rectangle(177, 162, 103, 26));
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(loginButton, null);
        this.getContentPane().add(buttonExit, null);
        this.getContentPane().add(userNameText, null);
        this.getContentPane().add(passwordText, null);
        this.getContentPane().add(buyerRadio, null);
        this.getContentPane().add(sellerRadio, null);
        buttonGroup1.add(buyerRadio);
        buttonGroup1.add(sellerRadio);
    }

    void loginButton_actionPerformed(ActionEvent e) {
        BufferedReader file;
        m_bExit = false;
        System.out.println("User logged into the app");
        try {
            if (buyerRadio.isSelected() == true)// Buyer
            {
                userType = UserType.Buyer; // 0 for Buyer
                file = new BufferedReader(new FileReader("src/ptbs/BuyerInfo.txt"));
            }
            else// Seller
            {
                userType = UserType.Seller; // 1 for Seller
                file = new BufferedReader(new FileReader("src/ptbs/SellerInfo.txt"));
            }
            userBox = userNameText.getText();
            String passwordBox = new String(passwordText.getPassword());
            String loginName = null;
            String aline = null, userName = null, password = null;
            while ((aline = file.readLine()) != null) {
                userName = getUserName(aline);
                password = GetPassword(aline);

                if (userName.compareTo(userBox) == 0 && password.compareTo(passwordBox) == 0)
                {
                    loginName = userName;
                }
            }
            if (loginName != null) {
            	JOptionPane.showMessageDialog(this, "Facade Pattern Implemented Successfully",
                        "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                this.hide();
            }
            else
            {
            	JOptionPane.showMessageDialog(this, "Enter a valid user name or password",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        } catch (Exception ee) {
        	System.out.println(ee) ;
        }

    }

    /*
     * get the user name from aline UserName:Password
     */
    private String getUserName(String aline) {
        int Sep = aline.lastIndexOf(':');
        return aline.substring(0, Sep);
    }

    /*
     * get the password from aline UserName:Password
     */
    private String GetPassword(String aline) {
        int Sep = aline.lastIndexOf(':');
        return aline.substring(Sep + 1, aline.length());
    }

    /* after login get the UserName of the login interface */
    public String getUserName() {
        return userBox;
    }

    /* after login get the userType of the login interface */
    public UserType getUserType() {
        return userType;
    }

    public boolean isExit() {
        return m_bExit;
    }

    void buttonExit_actionPerformed(ActionEvent e) {
        m_bExit = true;
        hide();
    }
}