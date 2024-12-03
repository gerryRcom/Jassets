// Required imports here
// scanner for user input
import java.util.Scanner;

public class Jassets {

	public static void main(String[] args) {
		// Declare our menu object for use during the program
		JassetMenu jassetMenu = new JassetMenu();
		// Declare input scanner for user input in menu
		Scanner menuInput = new Scanner(System.in);
		
		// Declare and Populate serverAsset array
		ServerAsset serverAssets[] = {new ServerAsset("8GB", 16, "SSD", "Directory", "10.10.10.100"), new ServerAsset("16GB", 8, "HD", "Fileserver", "10.10.10.110")};
		
		// Declare empty workStationAsset array
		//WorkstationAsset workstationAssets[] = {new WorkstationAsset("16GB", 8, "SSD", "Merketing", 'Y'), new WorkstationAsset("16GB", 8, "SSD", "HR", 'N')};
		WorkstationAsset workstationAssets[] = new WorkstationAsset[4];
		// Declare required variables.
		int menuChoice = 0;
		// Enter a loop until a valid option is selected.
		
		jassetMenu.loadingMenu();
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
						for (int x = 0; x < workstationAssets.length; x++) {
							workstationAssets[x].niceOutput();
						}
					}
					else if (menuChoice == 2) {
						for (int x = 0; x < serverAssets.length; x++) {
							serverAssets[x].niceOutput();
						}
					}
				}
				catch (Exception e) {
					System.out.println("Invalid input detected");
					// Close scanner
					menuInput.close();
					System.exit(1);
				}
				// Exit application if user enters 5
				}while (!(menuChoice == 5));
				System.out.println("Exiting Jasset application");
				// Close scanner
				menuInput.close();
				System.exit(0);
			}
			}
		
		catch (Exception e) {
			System.out.println("Invalid input detected");
			// Close scanner
			menuInput.close();
			System.exit(1);
		}
		
		System.out.println("bot mc: " + menuChoice);
		
		// Exit application if user enters 5
		}while (!(menuChoice == 1 || menuChoice == 5));
		System.out.println("Exiting Jasset application");
		// Close scanner
		menuInput.close();
		System.exit(0);
	}

}