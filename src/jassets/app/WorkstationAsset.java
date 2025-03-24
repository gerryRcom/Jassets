package jassets.app;

// Workstation asset that will extend the BaseAsset class and implement ClassMenu interface.
// Set to final as it is extending a sealed class and will does not need to be extended itself
public final class WorkstationAsset extends BaseAsset implements ClassMenu{
	// Declare variables that are specific to WorkstationAsset asset types
	private String workstationDept = "";
	private char workstationPortable = 'N';
	private int workstationAssetID = 0;

	// Default constructor so new type can be instantiated with no values if required
	public WorkstationAsset() {
		
	}
	
	// Main constructor for class including all value parameters.
	WorkstationAsset(String memory, int cores, String storage, String department, char portable) {
		setAssetID();
		setWorkstationAssetID(getAssetID());
		setAssetMemory(memory);
		setAssetCores(cores);
		setStorageType(storage);
		setWorkstationDept(department);
		setWorkstationPortable(portable);
	}
	
	// Getter to return workstation dept
	String getWorkstationDept() {
		return workstationDept;
	}
	// Getter to return workstation portable status
	char getWorkstationPortable() {
		return workstationPortable;
	}
	// Getter to return workstation asset id
	int getWorkstationAssetID() {
		return workstationAssetID;
	}
	
	
	// Setter to assign Department
	void setWorkstationDept(String workstationDept) {
		this.workstationDept = workstationDept;
	}
	// Setter to assign portable status
	void setWorkstationPortable(char workstationPortable) {
		this.workstationPortable = workstationPortable;
	}
	// Setter to assign asset ID
	void setWorkstationAssetID(int workstationAssetID) {
		this.workstationAssetID = workstationAssetID;
	}

	@Override // Implement method
	public void niceOutput() {
		System.out.println("### WORKSTATION ###");
		System.out.println("Asset ID: "+ getWorkstationAssetID());
		System.out.println("Memory: "+ getAssetMemory());
		System.out.println("CPU Cores: "+ getAssetCores());
		System.out.println("Storage Type: "+ getStorageType());
		System.out.println("Service: "+ getWorkstationDept());
		System.out.println("Portable: "+ getWorkstationPortable());
		System.out.println("###################");
	}
	
}
