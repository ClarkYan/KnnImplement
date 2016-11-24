package knnAlgorithm;

//To record the information about k nearest elements
public class KnnRecord {

	//The order of the element
	private int index;
	//The distance between two elements
	private double distance;
	//The attribute of the tested element
	private String attribute;
	
	public KnnRecord(int index, double distance, String attribute)
	{
		super();
		this.index = index;
		this.distance = distance;
		this.attribute = attribute;
	}
	
	public void setIndex(int index)
	{
		this.index = index;
	}
	public int getIndex()
	{
		return index;
	}
	public void setDistance(double distance)
	{
		this.distance = distance;
	}
	public double getDistance()
	{
		return distance;
	}
	public void setAttribute(String attribute)
	{
		this.attribute = attribute;
	}
	public String getAttribute()
	{
		return attribute;
	}
}
