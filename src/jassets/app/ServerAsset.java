package jassets.app;

// Server asset that will extend the BaseAsset class and implement ClassMenu interface.
public class ServerAsset extends BaseAsset implements ClassMenu{
	// Declare variables that are specific to ServerAsset asset types
	String serverService = "";
	String serverIP = "";
	int serverAssetID = 0;

	// Default constructor so new type can be instantiated with no values if required
	public ServerAsset() {	
	}
	
	// Main constructor for class including all value parameters.
	ServerAsset(String memory, int cores, String storage, String service, String ip) {
		setAssetID();
		setServerAssetID(getAssetID());
		setAssetMemory(memory);
		setAssetCores(cores);
		setStorageType(storage);
		setServerService(service);
		setServerIP(ip);		
	}
	
	// Getter to return server service
	String getServerService() {
		return serverService;
	}
	// Getter to return server ip
	String getServerIP() {
		return serverIP;
	}
	// Getter to return server assetid
	int getServerAssetID() {
		return serverAssetID;
	}
	

	// Setter to assign service
	void setServerService(String serverService) {
		this.serverService = serverService;
	}
	// Setter to assign IP
	void setServerIP(String serverIP) {
		this.serverIP = serverIP;
	}
	// Setter to assign Asset ID
	void setServerAssetID(int serverAssetID) {
		this.serverAssetID = serverAssetID;
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
