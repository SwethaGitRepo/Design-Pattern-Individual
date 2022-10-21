package ptbs;
import javax.swing.*;

import ptbs.Product.ProductName;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProduceProductMenu extends Product implements ProductMenu{
	
    public ProduceProductMenu(String strProduct, int type) {
		super(strProduct, type);
		showMenu();
		// TODO Auto-generated constructor stub
	}


	private ProductName productName = ProductName.Produce; // default to produce

    JLabel jLabel1 = new JLabel();
    JLabel jLabel2 = new JLabel();
    JButton viewButton = new JButton();
    JButton addButton = new JButton();
   
	public void showMenu() {
		showLabels();
		initJFrame();
		showAddButton();
		showViewButton();
		showRadioButton();
		showComboxes();
	}

	public void initJFrame()
	{
		setModal(true);
	    setSize(575,330);
		this.getContentPane().setLayout(null);
	}
	
	public void showAddButton() {
		addButton.setText("Add to cart");
		addButton.setBounds(new Rectangle(50, 211, 150, 28));
		addButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bAdd_actionPerformed(e);
			}
		});
		this.getContentPane().add(addButton, null);
	}

	public void showViewButton() {
	
		List productList = new ArrayList();
		try
		{
			String strProductName;
			int y=75;
			BufferedReader file = new BufferedReader(new FileReader("ptbs/ProductInfo.txt"));
			String aline = null;
            while ((aline = file.readLine()) != null) {
				strProductName = getProductName(aline);
				System.out.println(productName.toString());
				if (strProductName.compareTo(productName.toString()) == 0)
                {
					System.out.println("strprname "+strProductName);
					String produceType = getProductType(aline);
					productList.add(produceType);
                }
            }
			JCheckBox checkBox1 = new JCheckBox(productList.get(0).toString());
			JCheckBox checkBox2 = new JCheckBox(productList.get(1).toString());

			checkBox1.setBounds(new Rectangle(150, 30, 79, 70));
			checkBox2.setBounds(new Rectangle(150, 70, 79, 70));
			
			checkBox1.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(ActionEvent e) {
							checkBox1_actionPerformed(e);
						}
					});
			checkBox2.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(ActionEvent e) {
							checkBox2_actionPerformed(e);
						}
					});
			
			this.getContentPane().add(checkBox1, null);
			this.getContentPane().add(checkBox2, null);

		}
		catch(Exception e)
		{
				
		}
	}
	

    private String getProductName(String aline) {
        int Sep = aline.lastIndexOf(':');
        return aline.substring(0, Sep);
    }
    
    private String getProductType(String aline) {
        int Sep = aline.lastIndexOf(':');
        return aline.substring(Sep+1, aline.length());
    }

	public void showRadioButton() {
		show();
	}

	public void showLabels() {
		setLocation(400,200);
    	setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setTitle("Produce");
		jLabel1.setText("Type of Produce");
        jLabel1.setBounds(new Rectangle(15, 15, 80, 18));
		this.getContentPane().add(jLabel1, null);

	}

	public void showComboxes() {
		
	}
	
	void bAdd_actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "Iterator and Factory Pattern Implemented Successfully",
                "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
		hide();
	}
	

	void bView_actionPerformed(ActionEvent e) {

	}

	void checkBox1_actionPerformed(ActionEvent e)
	{
		
	}
	
	void checkBox2_actionPerformed(ActionEvent e)
	{
		
	}
	
	void checkBox3_actionPerformed(ActionEvent e)
	{
		
	}
}
