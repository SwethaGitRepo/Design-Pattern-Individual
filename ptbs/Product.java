package ptbs;
public class Product {
		  String productName;
		  int numOfProducts;
		  int productType;


		  public Product(String strProduct, int productType) {
		    this.productName = strProduct;
		    this.productType = productType;
		    this.numOfProducts = 0;
		  }
		  
		  void accept(NodeVisitor visitor)
		  {
		    visitor.visitProduct(this);
		  }

}
