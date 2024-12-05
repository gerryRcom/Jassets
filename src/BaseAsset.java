// Declare BaseAsset as abstract as it will not be instantiated directly.
public abstract class BaseAsset {
	// Declare assetID as static as it will be shared across all assets.
	static int assetID = 1000;
	
	// Declare variables that will be common across all asset types
	String assetMemory = "";
	int assetCores = 0;
	String storageType = "";
	
	// Abstract method for formatted output, will be implemented by sub-class
	public abstract void niceOutput();

	// Getter to return asset memory
	public String getAssetMemory() {
		return assetMemory;
	}

	// Getter to return asset cores
	public int getAssetCores() {
		return assetCores;
	}

	// Getter to return asset storage type
	public String getStorageType() {
		return storageType;
	}

	

}
