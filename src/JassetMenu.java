// Required imports
import java.time.LocalDate;

// Class for the Jasset menu system which will be called during runtime
public class JassetMenu {
	
	// Output the loading menu
	public void loadingMenu(){
		String loadingMessage = ". . . .";
		System.out.println("### Jasset Asset Manager: " + seasonOutput() + " edition.");
		System.out.println("###");
		System.out.print("### Populating assets ");
		
		// Output an small animated loading menu on startup 
		for (int i = 0; i < loadingMessage.length(); i++) {
			// sleep for 400 ms between each character of the loading menu
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// print out the loadingMessage a character at a time.
			System.out.print(loadingMessage.charAt(i));
		}
		System.out.println(" .");
	}
	
	// Output the main application menu
	public void mainMenu(){
		System.out.println("###");
		System.out.println("### Please choose an option from the menu below");
		System.out.println("### -------------------------------------------");
		System.out.println("### View  Assets: 1");
		System.out.println("### Exit  Jasset: 5");
		System.out.println("###");
		System.out.print("### Enter choice (1,5): ");
	}
	
	// Output the view assets sub menu
	public void viewAssets(){
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
	
	// Private method to return current season to reflect current version of app in loading menu.
	private String seasonOutput() {
		LocalDate todayDate = LocalDate.now();
		String calcSeason = todayDate.toString().substring(5,6) + todayDate.toString().substring(6,7);
		// switch statement to calculate the season
		// Requires v 21 https://docs.oracle.com/en/java/javase/21/language/switch-expressions-and-statements.html
		switch (calcSeason) {
		case "02","03","04" -> {return "Spring";}
		case "05","06","07" -> {return "Summer";}
		case "08","09","10" -> {return "Autumn";}
		default -> {return "Winter";}
		}
	}
}
