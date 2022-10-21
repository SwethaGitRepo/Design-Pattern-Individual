package ptbs;
import javax.swing.*;

import ptbs.UserInfoItem.UserType;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Buyer extends Person {
	
	private boolean boolSubmit = false;
	Product theProduct;

    JRadioButton meatRadio = new JRadioButton();
    JRadioButton produceRadio = new JRadioButton();
    ButtonGroup buttonGroup1 = new ButtonGroup();

    JButton bSubmit = new JButton();
	JButton bCancel = new JButton();

	JLabel jLabel1 = new JLabel();	

	public Buyer() {
		try {
			jbInit();
			System.out.println("Buyer portal opened");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jbInit() throws Exception {
		setLocation(400,200);
    	setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setTitle("Buyer portal");
		System.out.println("Select the type of product you want to buy");
		jLabel1.setText("Select the type of product you want to buy");
		jLabel1.setBounds(new Rectangle(40, 36, 300, 35));
		this.getContentPane().setLayout(null);
		
		meatRadio.setSelected(true);
		meatRadio.setText("Meat");
		meatRadio.setBounds(new Rectangle(37, 154, 103, 26));
		produceRadio.setText("Produce");
		produceRadio.setBounds(new Rectangle(177, 152, 103, 26));
		
		bSubmit.setText("Submit");
		bSubmit.setBounds(new Rectangle(420, 124, 79, 29));
		bSubmit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bSubmit_actionPerformed(e);
			}
		});
		bCancel.setText("Cancel");
		bCancel.setBounds(new Rectangle(420, 164, 79, 29));
		bCancel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bCancel_actionPerformed(e);
			}
		});
		
		this.getContentPane().add(jLabel1, null);
		this.getContentPane().add(meatRadio, null);
		this.getContentPane().add(produceRadio, null);
		this.getContentPane().add(bSubmit, null);
		this.getContentPane().add(bCancel, null);
		buttonGroup1.add(meatRadio);
        buttonGroup1.add(produceRadio);
	}

	
	public void showMenu() {
		System.out.println("Buyer Menu ");
	
		show();

	}
	
	void bSubmit_actionPerformed(ActionEvent e) {
		try 
		{
			boolSubmit = true;
            if (meatRadio.isSelected() == true)// meat
            {
            	System.out.println("Selected meat");
            	JOptionPane.showMessageDialog(this, "Bridge Pattern Implemented Successfully",
                        "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            	hide();
                ProductMenu meatPMenu = new MeatProductMenu("Meat", 0);
            }
            else// produce
            {
            	System.out.println("Selected produce");
            	JOptionPane.showMessageDialog(this, "Bridge Pattern Implemented Successfully",
                        "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
            	hide();
                ProductMenu producePMenu = new ProduceProductMenu("Produce", 0);
            }
		}
		catch (Exception ee) {
        	System.out.println(ee) ;
        }
  	}

	void bCancel_actionPerformed(ActionEvent e) {
		boolSubmit = false;
	}


	public ProductMenu createProductMenu() {
		return null;
	}

}
