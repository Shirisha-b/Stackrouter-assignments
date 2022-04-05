package entities;

import java.math.BigDecimal;

public class Product {
	private int productID;
	private String productName;
	private BigDecimal productPrice;
        private String productcategory;

	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public BigDecimal getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

        public String getproductcategory() {
        return productcategory;
        }

        public void setCategory(String productcategory) {
                 this.productcategory=productcategory;

         }
	
}