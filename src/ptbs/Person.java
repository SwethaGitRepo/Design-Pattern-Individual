package ptbs;
import java.util.*;

import javax.swing.JDialog;

public class Person extends JDialog{

	public static final String userName = null;
	private ProductMenu theProductMenu;
	ClassProductList productList;
	public int type = 0;
	
	public Person()
	{
	setModal(true);
    setSize(575,330);
    }

	public void showMenu() {

	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public ProductMenu createProductMenu() {
		return null;
	}

	public void addProduct(Product theSelectedProduct) {
		productList.add(theSelectedProduct);
	}

}
