
package projectSmartCity;
public class Shopping {
	
	private String ShopName;
	private String Location;
	private String Category;
	public Shopping() 
	{
		super();
     }
	public Shopping(String ShopName, String Location, String Category)
	{
		super();
		this.ShopName=ShopName;
		this.Location=Location;
		this.Category=Category;
	}
	public String getShopName() {
		return ShopName;
	}
	public void setShopName(String shopName) {
		ShopName = shopName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	
	@Override
	public String toString() {
		return "Shopping [ShopName=" + ShopName + ", Location=" + Location + ", Category=" + Category + "]";
	}
	
}
