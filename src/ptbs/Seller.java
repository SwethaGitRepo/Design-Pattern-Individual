package ptbs;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Seller extends Person {

	private boolean boolSubmit = false;
	Product theProduct;

    JRadioButton meatRadio = new JRadioButton();
    JRadioButton produceRadio = new JRadioButton();
    ButtonGroup buttonGroup1 = new ButtonGroup();

    JButton bSubmit = new JButton();
	JButton bCancel = new JButton();

	JLabel jLabel1 = new JLabel();	

	public Seller() {
		try {
			jbInit();
			System.out.println("Seller portal opened");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jbInit() throws Exception {
		setLocation(400,200);
    	setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setTitle("Seller portal");
		//System.out.println("Select the type of product that you sell");
		jLabel1.setText("Select the type of product that you sell");
		jLabel1.setBounds(new Rectangle(40, 36, 300, 35));
		this.getContentPane().setLayout(null);
		
		meatRadio.setSelected(true);
		meatRadio.setText("Meat");
		meatRadio.setBounds(new Rectangle(37, 154, 103, 26));
		produceRadio.setText("Product");
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
		System.out.println("Seller Menu ");
		show();
	}
	
	void bSubmit_actionPerformed(ActionEvent e) {
		boolSubmit = true;
	}

	void bCancel_actionPerformed(ActionEvent e) {
		boolSubmit = false;
	}


	public ProductMenu createProductMenu() {
		return null;
	}
}
