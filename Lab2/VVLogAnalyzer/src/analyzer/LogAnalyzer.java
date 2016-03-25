package analyzer;

public class LogAnalyzer extends IllegalArgumentException {

	private IFileExtentionManager ifem;
	public LogAnalyzer() {
	}

	public LogAnalyzer(IFileExtentionManager ifem) {
		this.ifem = ifem;
	}

	public boolean isValidLogFileName(String fileName) {
//		if (fileName != null) {
//			if (fileName.length() < ".slr".length()) {
//				throw new IllegalArgumentException("Name is to short!");
//			}
//			return fileName.endsWith(".slr") ? true : false;
//		}
//		return false;
		
		return ifem.isValid(fileName);
	}

	public void setFileExtentioManager(IFileExtentionManager ifem){
		this.ifem = ifem;
	}
	
	public static void main(String[] args) {

		LogAnalyzer la = new LogAnalyzer();
		System.out.println(la.isValidLogFileName("a.asd"));
		System.out.println(la.isValidLogFileName("a.slr"));
		System.out.println(la.isValidLogFileName("a.a.slr"));
		System.out.println(la.isValidLogFileName(""));
		System.out.println(la.isValidLogFileName("slr"));

	}

}
