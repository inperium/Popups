package popups.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import popups.model.Thingy;
import popups.view.PopupsViewer;

public class PopupsController
{
	private PopupsViewer display;
	private List<Thingy> thingyList;
	private int number;

	public PopupsController()
	{
		display = new PopupsViewer();
		thingyList = new ArrayList<Thingy>();
		number = 0;
	}

	public void start()
	{

		learnLists();

		String answer = "sample";
		while (answer != null & !isDouble(answer))
		{
			answer = display
					.collectResponse("Your antivirus software has encountered a virus. Please\n enter your SSN to allow it to delete the infected file.");
			while (answer == null)
			{
				answer = display
						.collectResponse("Your antivirus software has encountered a virus. Please\n enter your SSN to allow it to delete the infected file.");
			}
		}
	}

	/**
	 * Checks a supplied String value to see if it can be converted to a double.
	 * 
	 * @param potentialValue
	 *            The supplied String.
	 * @return Whether the conversion to a double is possible as a boolean
	 *         value.
	 */

	private boolean isDouble(String potentialValue)
	{
		boolean validDouble = false;

		try
		{
			double testValue = Double.parseDouble(potentialValue);
			validDouble = true;
		} catch (NumberFormatException notDoubleError)
		{

		}

		return validDouble;
	}

	/**
	 * Checks the suppliedString value to see if it can be converted to an
	 * integer. If it can not a PopUp is displayed.
	 * 
	 * @param potentialValue
	 *            The supplied String.
	 * @return Whether a conversion to an integer is possible.
	 */

	private boolean isInteger(String potentialValue)
	{
		boolean validInteger = false;

		try
		{
			int testVal = Integer.parseInt(potentialValue);
			validInteger = true;
		} catch (NumberFormatException notIntegerError)
		{
			display.displayMessage(notIntegerError.getMessage());
			display.displayMessage("Please enter a number.");
		}

		return validInteger;
	}

	public void createTextFile(String text)
	{
		String locationFile = System.getProperty("user.home") + "/Desktop/";
		File file = new File(locationFile + "noob.txt");
		file.setWritable(true);
		BufferedWriter writer = null;
		try
		{
			writer = new BufferedWriter(new FileWriter(file));
			writer.flush();
			writer.write(text);
			file.createNewFile();
		} catch (IOException e)
		{
			e.printStackTrace();
		} finally
		{
			try
			{
				writer.close();
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	private void learnLists()
	{
		display.displayMessage("This is the size of the list: " + thingyList.size());
		Thingy firstThingy = new Thingy();
		thingyList.add(firstThingy);
		display.displayMessage("This is the size of the list: " + thingyList.size());
		Thingy secondThingy = new Thingy();
		thingyList.add(secondThingy);
		display.displayMessage("This is the size of the list: " + thingyList.size());
		Thingy thirdThingy = new Thingy();
		thingyList.add(thirdThingy);
		display.displayMessage("This is the size of the list: " + thingyList.size());
		
		for(int index = 0; index < 5; index++)
		{
			Thingy loopThingy = new Thingy();
			thingyList.add(loopThingy);
		}
		
		for (int index = 0; index< thingyList.size(); index++)
		{
			display.displayMessage("The thingy at this spot has words of: " + thingyList.get(index).getWords());
		}
		
		Thingy specialThingy = new Thingy();
		specialThingy.setWords("not null stuff");
		
		thingyList.add(1, specialThingy);

		for(int index = 0; index < thingyList.size(); index++)
		{
			display.displayMessage("The message at " + index + "is " + thingyList.get(index).getWords());
		}
		
		thingyList.get(3).setWords("I just changed what is inside");
		Thingy tempThing = thingyList.get(4);
		tempThing.setWords("also changed");
		
		for (int index = 0; index <thingyList.size(); index++)
		{
			display.displayMessage(thingyList.get(index).getWords());
		}
		Thingy replacement = new Thingy();
		replacement.setWords("I am a replicant");

				Thingy old = thingyList.set(0, replacement);

				for(int index = 0; index < thingyList.size(); index++)
				{
				display.displayMessage(thingyList.get(index).getWords());
				}
		old.setWords("I was replaced :(");
		display.displayMessage(old.getWords());
		
		thingyList.remove(4);
		display.displayMessage("the size is now " + thingyList.size());
		old = thingyList.remove(4);
		display.displayMessage("The size is now " + thingyList.size());
		display.displayMessage("This is what I removed: " + old.getWords());
		thingyList.add(0,old);
	
		

		

		
	}

}
