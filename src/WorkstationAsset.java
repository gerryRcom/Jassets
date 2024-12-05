// Workstation asset that will extend the BaseAsset class.
public class WorkstationAsset extends BaseAsset {
	// Declare variables that are specific to WorkstationAsset asset types
	String workstationDept = "";
	char workstationPortable = 'N';
	int workstationAssetID = 0;
	
	public WorkstationAsset(String memory, int cores, String storage, String department, char portable) {
		BaseAsset.assetID++;
		workstationAssetID = BaseAsset.assetID;
		this.assetMemory = memory;
		this.assetCores = cores;
		this.storageType = storage;
		this.workstationDept = department;
		this.workstationPortable = portable;
	}
	
	// Default constructor so new type can be instantiated with no values
	public WorkstationAsset() {
		
	}
	
	// Getter to return workstation dept
	public String getWorkstationDept() {
		return workstationDept;
	}

	// Getter to return workstation portable status
	public char getWorkstationPortable() {
		return workstationPortable;
	}

	// Getter to return workstation asset id
	public int getWorkstationAssetID() {
		return workstationAssetID;
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
