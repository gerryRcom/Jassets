// Class for the Jasset menu system which will be called during runtime
public class JassetMenu {
	
	// Output the loading menu
	public void loadingMenu(){
		String loadingMessage = ". . . .";
		System.out.println("### Jasset Asset Manager");
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
	


}
