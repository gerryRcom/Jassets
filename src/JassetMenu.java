// Class for the Jasset menu system which will be called during runtime
public class JassetMenu {
	
	public void loadingMenu(){
		String loadingMessage = ". . . .";
		System.out.println("### Jasset Asset Manager");
		System.out.println("###");
		System.out.print("### Populating assets ");
		for (int i = 0; i < loadingMessage.length(); i++) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(loadingMessage.charAt(i));
		}
		System.out.println(" .");
	}
	
	
	public void mainMenu(){
		System.out.println("###");
		System.out.println("### Please choose an option from the menu below");
		System.out.println("### -------------------------------------------");
		System.out.println("### View  Assets: 1");
		System.out.println("### Exit  Jasset: 5");
		System.out.println("###");
		System.out.print("### Enter choice (1,5): ");
	}
	
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
	
	// check input provided and return valid entry if provided
	public void checkMainInput(int inputToCheck) {
		int input = inputToCheck;
		
		switch(input) {
		case 1:
			this.viewAssets();
			break;
		case 5:
			System.out.println("Exiting Jasset application");
			System.exit(1);
		default:
			System.out.println("Invalid entry, please select again");
			this.mainMenu();
			break;
		}
		
	}

}
