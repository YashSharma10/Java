package StudentEnrollmentSystem.Entity;

public class Instructor {
	int iid;
	String iname;

	public int getIId() {
		return iid;
	}

	public void setIId(int iid) {
		this.iid = iid;
	}

	public String getIname() {
		return iname;
	}

	public void setName(String iname) {
		this.iname = iname;
	}

	public Instructor(int iid, String iname) {
		super();
		this.iid = iid;
		this.iname = iname;
	}
	public Instructor() {
		
	}
}
