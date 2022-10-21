package ptbs;
import javax.swing.JDialog;

import ptbs.UserInfoItem.UserType;

public class Product extends JDialog{
		  ClassProductList productList;
		  String productName;
		  int numOfProducts;
		  int productType;
		  public enum ProductName {
				Meat, Produce
			}


		  public Product(String strProduct, int productType) {
		    this.productName = strProduct;
		    this.productType = productType;
		    this.numOfProducts = 0;
		  }

		  public ProductIterator getProductIterator()
		  {
			  ProductIterator theproductIterator = new ProductIterator(productList);
			  return theproductIterator;
		  }
		  void accept(NodeVisitor visitor)
		  {
		    visitor.visitProduct(this);
		  }

		public void addProduct(Product theProduct) {
			// TODO Auto-generated method stub
			
		}

}
