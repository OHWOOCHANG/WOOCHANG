package basic.enumeration;

public enum PowerState {
	OFF("전원이 꺼졌습니다"), 
	ON("전원이 켜졌습니다"), 
	SUSPEND("먹통상태임"); // 모두 대문자로 하는게 관례
	
	private String description;
	private PowerState(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	@
	Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
