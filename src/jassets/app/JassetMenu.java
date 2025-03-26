package jassets.app;

// Required imports
import java.time.YearMonth;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

// Class for the Jasset menu system which will be called during runtime
public class JassetMenu {
	
	// Output the loading menu
	void loadingMenu(){
		// Define the loading menu character and the number of iterations to use in it
		String loadingMessage = ". ";
		int loadingLength[] = {5,4,3,2,1,0};
		System.out.println("### Jasset Asset Manager: " + seasonOutput() + " edition.");
		System.out.println("### Install Date: " + aboutJassets());		
		System.out.println("###");
		System.out.print("### Populating assets ");
		
		// Output a small animated loading menu on startup 
		// use an unnamed variable in the loading menus for loop
		for (int _ : loadingLength) {
			// sleep for 400 ms between each character of the loading menu
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// print out the loadingMessage a character at a time.
			System.out.print(loadingMessage);
		}
		// jump to a new line once loading menu is complete.
		System.out.println("");
	}
	
	// Output the main application menu
	void mainMenu(){
		System.out.println("###");
		System.out.println("### Please choose an option from the menu below");
		System.out.println("### -------------------------------------------");
		System.out.println("### View  Assets: 1");
		System.out.println("### Exit  Jasset: 5");
		System.out.println("###");
		System.out.print("### Enter choice (1,5): ");
	}
	
	// Output the view assets sub menu
	void viewAssets(){
		System.out.println("### Jasset Asset Manager");
		System.out.println("###");
		System.out.println("### View assets, please choose asset type to view");
		System.out.println("### ---------------------------------------------");
		System.out.println("### View Workstations: 1");
		System.out.println("### View  Servers    : 2");
		System.out.println("### Exit  Jasset:    : 5");
		System.out.println("###");
		System.out.print("### Enter choice (1,2,5): ");
	}
	
	// Define a function that will print some additional info About Jassets
	private String aboutJassets(){
		Path jassetsPath = Paths.get("");
		//System.out.println(jassetsPath.toAbsolutePath().toString());
		try {
			BasicFileAttributes jassetsAttrb = Files.readAttributes(jassetsPath, BasicFileAttributes.class);
			String installDate = jassetsAttrb.creationTime().toString();
			return installDate;
		} catch (IOException e){
			return (e.toString());
		}
	}
	
	// Private method to return current season to reflect current version of app in loading menu.
	private String seasonOutput() {
		YearMonth dateInfo = YearMonth.now();
		int currentMonth = dateInfo.getMonthValue();
		// switch statement to calculate the season
		switch (currentMonth) {
		case 2,3,4 -> {return "Spring";}
		case 5,6,7 -> {return "Summer";}
		case 8,9,10 -> {return "Autumn";}
		default -> {return "Winter";}
		}
	}
}
