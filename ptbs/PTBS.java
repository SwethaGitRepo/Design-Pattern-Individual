package ptbs;
public class PTBS
    {
    public static void main(String args[])
    {
        Facade facadeObj = new Facade();
        UserInfoItem userinfoitem = new UserInfoItem();
        if(facadeObj.login(userinfoitem))
        {
        	System.out.println("Login success and entered code");
            facadeObj.addTrading();
            facadeObj.viewTrading();
            facadeObj.decideBidding();
            facadeObj.discussBidding();
            facadeObj.submitBidding();
            facadeObj.remind();
            facadeObj.createUser(userinfoitem);
            facadeObj.createProductList();
            facadeObj.attachProductToUser();
            Product pr = facadeObj.selectProduct();
            facadeObj.productOperation();
        }
    }
    }