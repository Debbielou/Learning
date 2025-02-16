package enumHandling;

public enum Category {
	SPORTS("S"), MUSIC("M"), TECHNOLOGY("T");
	
	private String code;

	private Category(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	

}
