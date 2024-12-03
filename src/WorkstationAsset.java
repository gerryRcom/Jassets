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
	
	@Override // Implement method
	public void niceOutput() {
		System.out.println("### WORKSTATION ###");
		System.out.println("Asset ID: "+ this.workstationAssetID);
		System.out.println("Memory: "+ this.assetMemory);
		System.out.println("CPU Cores: "+ this.assetCores);
		System.out.println("Storage Type: "+ this.storageType);
		System.out.println("Service: "+ this.workstationDept);
		System.out.println("IP: "+ this.workstationPortable);
		System.out.println("###################");
	}
}
