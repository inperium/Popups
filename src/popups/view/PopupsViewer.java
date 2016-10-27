package popups.view;

import javax.swing.JOptionPane;

/**
 * PopUp Display class with three methods for GUI.
 * @author Isaac Bowen
 * @version September 27, 2016
 *
 */
public class PopupsViewer
{

	/**
	 * Creates a PopUp message to show the user a screen.
	 * @param The String to show the user.
	 */
	
	public void displayMessage(String message)
	{
		JOptionPane.showMessageDialog(null, message);
	}
	
	/**
	 * Creates a PopUp to a question to the user. Stores the response as a String.
	 * @param message The question supplied to the user.
	 * @return The users response as a String.
	 */
	
	public String collectResponse(String message)
	{
		String responce = "";
		
		responce = JOptionPane.showInputDialog(null, message);
		
		return responce;
	}
}
