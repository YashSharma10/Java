package StudentEnrollmentSystem.Entity;

public class Student implements Comparable<Student> {

	int sid;
	String sname;
	String semail;

	public Student(int sid, String sname, String semail) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
	}
	public Student() {
		
	}

	public long getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname( String sname) {
		this.sname = sname;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}
	
	@Override
    public int compareTo(Student other) {
        return Integer.compare(this.sid, other.sid);
    }

}
