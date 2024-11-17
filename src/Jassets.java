// Required imports here
// scanner for user input
import java.util.Scanner;

public class Jassets {

	public static void main(String[] args) {
		// Declare our menu object for use during the program
		JassetMenu jassetMenu = new JassetMenu();
		ServerAsset serverAssets[] = {new ServerAsset("8GB", 16, "SSD", "Directory", "10.10.10.100"), new ServerAsset("16GB", 8, "HD", "Fileserver", "10.10.10.110")};
		WorkstationAsset workstationAssets[] = {new WorkstationAsset("16GB", 8, "SSD", "Merketing", 'Y'), new WorkstationAsset("16GB", 8, "SSD", "HR", 'N')};
		// Declare required variables.
		int menuChoice = 0;
		// Declare input scanner for user input in menu
		Scanner menuInput = new Scanner(System.in);
		do {
			

		// Print initial application menu screen
		jassetMenu.mainMenu();
		// Run user input through try/ catch to check for invalid user input
		try {
			menuChoice = menuInput.nextInt();
			// Check what option the user wants.
			if (menuChoice == 1) {
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
					System.exit(1);
				}
				// Exit application if user enters 5
				}while (!(menuChoice == 1 || menuChoice == 2 || menuChoice == 5));
				System.out.println("Exiting Jasset application");
				System.exit(0);
			}
		
		catch (Exception e) {
			System.out.println("Invalid input detected");
			System.exit(1);
		}
		
		System.out.println(menuChoice);
		
		// Exit application if user enters 5
		}while (!(menuChoice == 1 || menuChoice == 5));
		System.out.println("Exiting Jasset application");
		System.exit(0);
	}

}