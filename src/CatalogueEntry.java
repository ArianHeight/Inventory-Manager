/*
 * This Class represents a single entry in a catalogue of items
 * each entry has the name of the product, products in stock,
 * prices associated with the product, the review of the product
 * and the manufactorer of the product
 * 
 * */


import java.util.ArrayList;

public class CatalogueEntry {
	private String m_strName;
	private int m_iStock;                 // Items in stock
	private int m_iPrice;                 // Price for sale
	private int m_iBuyPrice;              // Original buying price
	private ArrayList<String> m_cReviews; // Item review
	private String m_strManufacturer;     // Item's Manufacturer
	
	public CatalogueEntry(String name, int stock, int price, int bPrice, ArrayList<String> review, String manu) {
		this.m_strName = name;
		this.m_iStock = stock;
		this.m_iPrice = price;
		this.m_iBuyPrice = bPrice;
		this.m_cReviews = review;
		this.m_strManufacturer = manu;
	}

	// ------------------------ Setters and Getters (self-expanatory) ------------------------- //
	public String getName() {
        return m_strName;
    }

    public void setName(String name) {
        m_strName = name;
    }

    public int getStock() {
        return m_iStock;
    }

    public void addStock() {
	    m_iStock++;
    }

    public void decreaseStock() {
	    m_iStock--;
    }

    public int getPrice() {
        return m_iPrice;
    }

    public void setPrice(int price) {
	    m_iPrice = price;
    }

    public int getBuyPrice() {
        return m_iBuyPrice;
    }

    public void setBuyPrice(int price) {
	    m_iBuyPrice = price;
    }

    public ArrayList getReviews() {
        return m_cReviews;
    }

    public void addReview(String rev) {
	    m_cReviews.add(rev);
    }

    public String getManufactorer() {
        return m_strManufacturer;
    }
    // ------------------------ End of Setters and Getters ------------------------------------ //
}
