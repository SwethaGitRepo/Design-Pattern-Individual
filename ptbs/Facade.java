package ptbs;
public class Facade {

	private int userType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

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
		ProductMenu theProductMenu;
		if (thePerson.type == 0)/// student
		{
			theProductMenu = new MeatProductMenu();
		}
		else
		{
			theProductMenu = new ProduceProductMenu();
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

	public void attachProductToUser() {

	}

	public Product selectProduct() {
		return theSelectedProduct;
	}

	public void productOperation() {

	}

}
