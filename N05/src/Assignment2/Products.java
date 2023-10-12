package Assignment2;
import java.util.*;

public class Products {

	
		List<String> productList=new ArrayList<String>();

		public List<String> getProductList() {
			return productList;
		}

		public void setProductList(List<String> productList) {
			this.productList = productList;
		}
		public void addProductToList(String product)
		{
			productList.add(product);
		}
		public void sortProductList()
		{
			if(productList.isEmpty())
			{
				System.out.println("No data found");
			}
			else
			{
				Collections.sort(productList);
				System.out.println("Sorted Product list:"+productList);
			}
		}
	

	}


