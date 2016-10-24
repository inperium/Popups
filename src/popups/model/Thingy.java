package popups.model;

public class Thingy
{

	private int number;
	private double value;
	private String words;
	private boolean isvalid;
	
	public Thingy()
	{
		number = 9;
	}
	public int getNumber()
	{
		return number;
	}
	public void setNumber(int number)
	{
		this.number = number;
	}
	public double getValue()
	{
		return value;
	}
	public void setValue(double value)
	{
		this.value = value;
	}
	public String getWords()
	{
		return words;
	}
	public void setWords(String words)
	{
		this.words = words;
	}
	public boolean isIsvalid()
	{
		return isvalid;
	}
	public void setIsvalid(boolean isvalid)
	{
		this.isvalid = isvalid;
	}
}