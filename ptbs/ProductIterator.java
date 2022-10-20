package ptbs;

import java.util.ArrayList;
import java.io.*;
public class ProductIterator {

	private ClassProductList theProductList;
	int currentProductNumber = -1;
	public ProductIterator(ClassProductList productList) {
		theProductList = productList;
	}
	
	public boolean hasNext()
	{
		if (currentProductNumber >= theProductList.size()-1)
			return false;
		else
			return true;
	}

	public Object next()
	{
	    if (hasNext()==true)
	    {
	    	currentProductNumber ++;
	      return theProductList.get(currentProductNumber);
	    }
	    else
	    {
	      return null;
	    }
	}
	public void remove()
	{
	    theProductList.remove(currentProductNumber);
	}

	public Object next(String ProductName)
	{
	    Product theProduct;
	    theProduct=(Product)next();
	    while(theProduct!=null)
	    {
	      if(ProductName.compareTo(theProduct.toString())==0)
	      {
	        return theProduct;
	      }
	      theProduct=(Product)next();
	    }
	    return null;
	}

	public void moveToHead() {

	}

}
