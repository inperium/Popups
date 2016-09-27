package popups.controller;

import popups.view.PopupsViewer;


public class PopupsController
{
	PopupsViewer popupsViewer;
	
	public PopupsController(){
		popupsViewer = new PopupsViewer();
	}
	
	public void start()
	{
		popupsViewer.displayMessage("Isaac is a noob");
	}
}
