package bean;

public class StudentBean {

	private int sId;
	private String sName;
	private int sAge;
	private String sEmail;
	private String[] sSkills;

	public String[] getsSkills() {
		return sSkills;
	}

	public void setsSkills(String[] sSkills) {
		this.sSkills = sSkills;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

}
