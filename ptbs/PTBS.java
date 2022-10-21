package ptbs;
public class PTBS
    {
    public static void main(String args[])
    {
        Facade facadeObj = new Facade();
        UserInfoItem userinfoitem = new UserInfoItem();
        if(!facadeObj.login(userinfoitem))
        {
        	System.out.println("Facade Pattern implemented Successfully");
            facadeObj.createProductList();
        	System.out.println("Product List Created");
            facadeObj.attachProductToUser();
        	System.out.println("Product attached to user");
            facadeObj.viewTrading(userinfoitem.userType);
            facadeObj.addTrading();
            facadeObj.decideBidding();
            facadeObj.discussBidding();
            facadeObj.submitBidding();
            facadeObj.remind();
            facadeObj.createUser(userinfoitem);
            Product pr = facadeObj.selectProduct();
            facadeObj.productOperation();
        }
    }
    }