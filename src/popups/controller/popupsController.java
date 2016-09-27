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
		
	
	
}
