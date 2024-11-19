// Server asset that will extend the BaseAsset class.
public class ServerAsset extends BaseAsset {
	// Declare variables that are specific to ServerAsset asset types
	String serverService = "";
	String serverIP = "";
	int serverAssetID = 0;
	
	public ServerAsset(String memory, int cores, String storage, String service, String ip) {
		BaseAsset.assetID++;
		serverAssetID = BaseAsset.assetID;
		this.assetMemory = memory;
		this.assetCores = cores;
		this.storageType = storage;
		this.serverService = service;
		this.serverIP = ip;		
	}
	
	public void niceOutput() {
		System.out.println("###################");
		System.out.println("Asset ID: "+ this.serverAssetID);
		System.out.println("Memory: "+ this.assetMemory);
		System.out.println("CPU Cores: "+ this.assetCores);
		System.out.println("Storage Type: "+ this.storageType);
		System.out.println("Service: "+ this.serverService);
		System.out.println("IP: "+ this.serverIP);
	}
}
