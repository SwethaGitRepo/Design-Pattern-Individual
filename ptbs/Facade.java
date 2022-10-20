package ptbs;

import java.io.BufferedReader;
import java.io.FileReader;

public class Facade {

	private int userType;

	private Product theSelectedProduct;

	private int nProductCategory;

	 ProductList theProductList;

	private Person thePerson;
	public boolean login(UserInfoItem userinfoItem)
	{
		Login login = new Login();
		login.setModal(true);
		login.show();
		userinfoItem.userName = login.getUserName();
		userinfoItem.userType = login.getUserType();
		return login.isExit();
	}

	public void addTrading()
	{
		UserMenu theUserMenu;
		if (thePerson.type == 0)/// 
		{
			theUserMenu = new BuyerMenu();
		}
		else
		{
			theUserMenu = new SellerMenu();
		}
		//Trading theTrading = new Trading();
		//theProductMenu.showMenu(theTrading, thePerson);
		//theTrading.AddAssignment(theTrading);
	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void createProductList() {

	}

	void attachProductToUser() 
	{
		BufferedReader file;
		try {
			file = new BufferedReader(new FileReader("ptbs/UserProduct.txt"));
			String aline, strUserName, strProductName;
			while ((aline = file.readLine()) != null) // not the EOF
			{
				strUserName = getUserName(aline);
				strProductName = getProductName(aline);
				if (strUserName.compareTo(thePerson.userName) == 0) /// the UserName mateches
				{
					theSelectedProduct = findProductByItsName(strProductName);
					if (theSelectedProduct != null) /// Find the product in the productList--->attach
					{
						thePerson.addProduct(theSelectedProduct);
					}
				}
			}
		} catch (Exception ee) {
			;
		}
	}
	
	private Product findProductByItsName(String strProductName) {
		ProductIterator Iterator = new ProductIterator(theProductList);
		return (Product) Iterator.next(strProductName);
	}

	private String getUserName(String aline) {
		int sep = aline.lastIndexOf(':');
		return aline.substring(0, sep);
	}
	
	private String getProductName(String aline) {
		int sep = aline.lastIndexOf(':');
		return aline.substring(sep + 1, aline.length());
	}
	public Product selectProduct() {
		return theSelectedProduct;
	}

	public void productOperation() {

	}

}
