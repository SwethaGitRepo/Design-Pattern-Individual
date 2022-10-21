package ptbs;
import java.util.ArrayList;
import java.io.*;
public class ClassProductList extends ArrayList<Product> {

	private ProductIterator productIterator;
	
	public void readFileAndGetList(String fileName)
	{
		try {
			BufferedReader file;
			String strProductName = null;
			file = new BufferedReader(new FileReader(fileName));
			while ((strProductName = file.readLine()) != null) {
				Product theProduct;
				theProduct = new Product(strProductName, 0);
				add(theProduct);
				//System.out.println("readFileAndGetList" + theProduct);
			}
		} catch (Exception ee) {
			;
		}
		
	}
	
	Product FindTypeByProductName(String productName) {
		int nProductCount = size();
		for (int i = 0; i < nProductCount; i++) {
			Product theProduct = (Product) get(i);
			if (theProduct.productName.compareTo(productName) == 0)
				return theProduct;
		}
		return null;
	}

	public void accept(NodeVisitor visitor) {

	}

}
