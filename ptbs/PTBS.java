package ptbs;
public class PTBS
    {
    static Facade facadeObj = new Facade();
    public static void main(String args[])
    {
        UserInfoItem userinfoitem = new UserInfoItem();
        if(facadeObj.login(userinfoitem))
        {
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