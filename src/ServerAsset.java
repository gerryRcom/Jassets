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
	
	// Getter to return server service
	public String getServerService() {
		return serverService;
	}

	// Getter to return server ip
	public String getServerIP() {
		return serverIP;
	}

	// Getter to return server assetid
	public int getServerAssetID() {
		return serverAssetID;
	}


	// Default constructor so new type can be instantiated with no values
	public ServerAsset() {
		
	}
	
	@Override
	public void niceOutput() {
		System.out.println("##### SERVER ######");
		System.out.println("Asset ID: "+ getServerAssetID());
		System.out.println("Memory: "+ getAssetMemory());
		System.out.println("CPU Cores: "+ getAssetCores());
		System.out.println("Storage Type: "+ getStorageType());
		System.out.println("Service: "+ getServerService());
		System.out.println("IP: "+ getServerIP());
		System.out.println("###################");
	}
}
