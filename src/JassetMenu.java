// Class for the Jasset menu system which will be called during runtime
public class JassetMenu {
	
	public void mainMenu(){
		System.out.println("### Jasset Asset Manager");
		System.out.println("###");
		System.out.println("### Please choose an option from the menu below");
		System.out.println("### -------------------------------------------");
		System.out.println("### View  Assets: 1");
		System.out.println("### Add an Asset: 2");
		System.out.println("### Exit  Jasset: 3");
		System.out.println("###");
		System.out.print("### Enter choice (1,2,3): ");
	}
	
	public void newAsset(){
		System.out.println("### Jasset Asset Manager");
		System.out.println("###");
		System.out.println("### New asset, please choose an asset type");
		System.out.println("### --------------------------------------");
		System.out.println("### Workstation: 1");
		System.out.println("### Server     : 2");
		System.out.println("### Cancel     : 3");
		System.out.println("###");
		System.out.print("### Enter choice (1,2,3): ");
	}
	
	public void viewAssets(){
		System.out.println("### Jasset Asset Manager");
		System.out.println("###");
		System.out.println("### View assets, please choose asset type to view");
		System.out.println("### ---------------------------------------------");
		System.out.println("### View Workstations: 1");
		System.out.println("### View  Servers    : 2");
		System.out.println("### Exit  Jasset:    : 3");
		System.out.println("###");
		System.out.print("### Enter choice (1,2,3): ");
	}

}
