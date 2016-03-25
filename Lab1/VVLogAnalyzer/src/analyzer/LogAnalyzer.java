package analyzer;

public class LogAnalyzer extends IllegalArgumentException{

	public LogAnalyzer() {
	}

	public boolean isValidLogFileName(String fileName) {
		if (fileName != null) {
			if (fileName.length() < ".slr".length()){
				throw new IllegalArgumentException("Name is to short!");
			}
			return fileName.endsWith(".slr") ? true : false;
		}
		return false;
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
