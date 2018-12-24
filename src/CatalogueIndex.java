/*
 * This Class is the index of a CatalogueEntry used to search and sort the entry in the file system
 * when extracting data from .dat files, the name is what will be extracted when doing searching and sorting
 * 
 * */


public class CatalogueIndex 
{
	//vars
	private String m_strName;
	
	public CatalogueIndex(String name)
	{
		//cstr
		this.m_strName = name;
	}
}
