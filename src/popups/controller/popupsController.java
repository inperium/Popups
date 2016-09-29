package popups.controller;

import popups.view.PopupsViewer;

public class PopupsController
{
	private PopupsViewer display;

	public PopupsController()
	{
		display = new PopupsViewer();
	}

	public void start()
	{
		int count = 0;
		String answer = "sample";
		while(!answer.equals(""))
		{
			answer = display.collectResponse("Your antivirus software has encountered a virus. Please\n enter your SSN to allow it to delete the infected file.");
					
		}
		
		
	}
	
	/**
	 * Checks a supplied String value to see if it can be converted to a double.
	 * @param potentialValue The supplied String.
	 * @return Whether the conversion to a double is possible as a boolean value.
	 */
	
	private boolean isDouble(String potentialValue)
	{
		boolean validDouble = false;
		
		try
		{
			double testValue = Double.parseDouble(potentialValue);
			validDouble = true;
		}
		catch(NumberFormatException notDoubleError)
		{
			
		}
		
		return validDouble;
	}


}
