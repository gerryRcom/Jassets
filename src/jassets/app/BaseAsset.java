package jassets.app;

// Declare BaseAsset as abstract as it will not be instantiated directly.
// Seal class so only ServerAsset and WorkstationAsset can extend it.
sealed abstract class BaseAsset permits ServerAsset, WorkstationAsset {
	// Declare assetID as static as it will be shared across all assets.
	private static int assetID = 1000;
	
	// Declare variables that will be common across all asset types
	private String assetMemory = "";
	private int assetCores = 0;
	private String storageType = "";
	
	// Getter to return asset memory
	String getAssetMemory() {
		return assetMemory;
	}
	// Getter to return asset cores
	int getAssetCores() {
		return assetCores;
	}
	// Getter to return asset storage type
	String getStorageType() {
		return storageType;
	}
	// Getter to return asset ID
	static int getAssetID() {
		return assetID;
	}

	// Setter to increment asset ID
	static void setAssetID() {
		assetID = assetID + 1;
	}
	// Setter to assign Memory
	void setAssetMemory(String assetMemory) {
		this.assetMemory = assetMemory;
	}
	// Setter to assign Cores
	void setAssetCores(int assetCores) {
		this.assetCores = assetCores;
	}
	// Setter to assign Storage Type
	void setStorageType(String storageType) {
		this.storageType = storageType;
	}
}
