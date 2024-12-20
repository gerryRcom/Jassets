package jassets.app;

// Required imports here
import java.util.Scanner;
import java.util.ArrayList;

public class Jassets {
	
	// add enum for service which would be static but can be added to here if required
	enum departments {
		MARKETING, FINANCE, HR
	}
	// add enum for departments which would be static but can be added to here if required
	enum services {
		DIRECTORY, FILESERVER, WEBSERVER
	}

	public static void main(String[] args) {
		// Declare our menu object for use during the program
		JassetMenu jassetMenu = new JassetMenu();
		// Declare input scanner for user input in menu
		Scanner menuInput = new Scanner(System.in);
		
		// Declare serverAssets ArrayList
		ArrayList<ServerAsset> serverAssets = new ArrayList<ServerAsset>();
		
		// Populate serverAssets ArrayList
		serverAssets.add(new ServerAsset("8GB", 16, "SSD", services.DIRECTORY.toString(), "10.10.10.100"));
		serverAssets.add(new ServerAsset("16GB", 8, "HD", services.FILESERVER.toString(), "10.10.10.110"));
		// Add an additional element to serverAssets ArrayList
		serverAssets.add(new ServerAsset("32GB", 16, "SSD", services.WEBSERVER.toString(), "10.10.10.120"));
	
		
		// Declare empty workStationAssets Array
		WorkstationAsset workstationAssets[] = new WorkstationAsset[4];
		// Create workStationAssets to populate Array
		WorkstationAsset ws01 = new WorkstationAsset("32GB", 8, "SSD", departments.MARKETING.toString(), 'Y');
		WorkstationAsset ws02 = new WorkstationAsset("16GB", 4, "SSD", departments.FINANCE.toString(), 'N');
		WorkstationAsset ws03 = new WorkstationAsset("16GB", 4, "SSD", departments.FINANCE.toString(), 'N');
		WorkstationAsset ws04 = new WorkstationAsset("16GB", 8, "SSD", departments.HR.toString(), 'N');
		
		// populate workstationAssets Array
		workstationAssets[0] = ws01;
		workstationAssets[1] = ws02;
		workstationAssets[2] = ws03;
		workstationAssets[3] = ws04;
		// Add an additional element to workstationAssets Array
		WorkstationAsset workstationAssetsB[] = {workstationAssets[0], workstationAssets[1], workstationAssets[2], workstationAssets[3], new WorkstationAsset("64GB", 16, "SSD", departments.MARKETING.toString(), 'Y')};
		
		// Declare required variables.
		int menuChoice = 0;
		
		// Call loadingMenu method for initial loading screen
		jassetMenu.loadingMenu();
		
		// Enter a loop until a valid option is selected.
		do {
			

		// Print initial application menu screen
		jassetMenu.mainMenu();
		// Run user input through try/ catch to check for invalid user input
		try {
			menuChoice = menuInput.nextInt();
			// Check what option the user wants.
			if (menuChoice == 1) {
				do {
					// Display view assets menu.
					jassetMenu.viewAssets();
				try {
					menuChoice = menuInput.nextInt();
					// Check what option the user wants.
					if (menuChoice == 1) {
						for (int x = 0; x < workstationAssetsB.length; x++) {
							workstationAssetsB[x].niceOutput();
						}
					}
					else if (menuChoice == 2) {
						for (int x = 0; x < serverAssets.size(); x++) {
							serverAssets.get(x).niceOutput();
						}
					}
				}
				// Catch if a non-int is input in the menu and exit with a message.
				catch (Exception e) {
					System.out.println("Invalid input detected, goodbye.");
					// Close scanner
					menuInput.close();
					System.exit(1);
				}
				// Exit application if user enters 5
				}while (!(menuChoice == 5));
				System.out.println("Exiting Jasset application, goodbye.");
				// Close scanner
				menuInput.close();
				System.exit(0);
			}
			}
		// Catch if a non-int is input in the menu and exit with a message.
		catch (Exception e) {
			System.out.println("Invalid input detected, goodbye.");
			// Close scanner
			menuInput.close();
			System.exit(1);
		}
		// Exit application if user enters 5
		}while (!(menuChoice == 5));
		System.out.println("Exiting Jasset application, goodbye.");
		// Close scanner
		menuInput.close();
		System.exit(0);
	}
}