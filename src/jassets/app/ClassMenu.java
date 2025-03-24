package jassets.app;

// Define Interface that will be implemented in required classes.
// Seal interface so only ServerAsset and WorkstationAsset can implement it.
sealed interface ClassMenu permits ServerAsset, WorkstationAsset {
	void niceOutput();
}
