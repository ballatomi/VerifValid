package analyzer;

public class LogAnalyzer extends IllegalArgumentException {

	private FileExtMgr ifem;
	private FileExtMgrFactory fileFactoryMgr;
	
 	public LogAnalyzer() {
	}

	public LogAnalyzer(FileExtMgr ifem) {
		this.ifem = ifem;
	}

 	public void setFileExtentioManager(FileExtMgr ifem){
 		this.ifem = ifem;
 	}

 	public boolean isValidLogFileName(String fileName) {
		return getFileExtentionManager().isValid(fileName);
	}


	
    public FileExtMgr getFileExtentionManager() {
		return new FileExtMgrImp();

    }

}
