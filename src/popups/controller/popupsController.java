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
		while(answer != null & !isDouble(answer))
		{
			answer = display.collectResponse("Your antivirus software has encountered a virus. Please\n enter your SSN to allow it to delete the infected file.");
			while (answer == null)
			{
				answer = display.collectResponse("Your antivirus software has encountered a virus. Please\n enter your SSN to allow it to delete the infected file.");
			}
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
	
	/**
	 * Checks the suppliedString value to see if it can be converted to an integer.
	 * If it can not a PopUp is displayed.
	 * @param potentialValue The supplied String.
	 * @return Whether a conversion to an integer is possible.
	 */
	
	private boolean isInteger(String potentialValue)
	{
		boolean validInteger = false;
		
		try
		{
			int testVal = Integer.parseInt(potentialValue);
			validInteger = true;
		}
		catch(NumberFormatException notIntegerError)
		{
			display.displayMessage(notIntegerError.getMessage());
			display.displayMessage("Please enter a number.");
		}
		
		return validInteger;
	}


}
