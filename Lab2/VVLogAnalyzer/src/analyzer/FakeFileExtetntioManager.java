package analyzer;

public class FakeFileExtetntioManager implements IFileExtentionManager{

	private boolean willReturn;

	public void setWillReturn(boolean willReturn) {
		this.willReturn = willReturn;
	}
	
	@Override
	public boolean isValid(String str) {
		return willReturn;
	}

	
	
}
