/*
 * This Class represents a single entry in a catalogue of items
 * each entry has the name of the product, products in stock,
 * prices associated with the product, the review of the product
 * and the manufactorer of the product
 * 
 * */


public class CatalogueEntry 
{
	// vars
	private String m_strName;
	private int m_iStock; //items in stock
	private int m_iPrice; //price for sale
	private int m_iBuyPrice; //original buying price
	private char m_cReview; //item review
	private String m_strManufactorer;
	
	//methods
	public CatalogueEntry(String name, int stock, int price, int bPrice, char review, String manu) 
	{
		//cstr
		this.m_strName = name;
		this.m_iStock = stock;
		this.m_iPrice = price;
		this.m_iBuyPrice = bPrice;
		this.m_cReview = review;
		this.m_strManufactorer = manu;
	}
}
