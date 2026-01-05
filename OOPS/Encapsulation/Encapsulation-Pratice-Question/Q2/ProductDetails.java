// Q2. 
// Read-Only Encapsulation

// Class Name: ProductDetails
// Private Variables:
// int productId
// String productName
// Methods:
// public Product(int productId, String productName)
// public int getProductId()
// public String getProductName()
// Condition:
// No setter methods allowed

class ProductDetails {
	private int productId;
	private String productName;
	public ProductDetails(int productId,String productName){
		this.productId=productId;
		this.productName=productName;
	}
	public int getProductId(){
		return productId;
	}
	public String getProductName(){
		return productName;
	}
}