package ch15;


/**
 * 员工信息
 * @author yangjiaxin
 *
 */
public class Info {
	private String key;
	private String name;
	
	public Info() {
		
	}

	public Info(String key, String name) {
		super();
		this.key = key;
		this.name = name;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
