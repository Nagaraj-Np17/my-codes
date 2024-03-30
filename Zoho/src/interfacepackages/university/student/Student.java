package interfacepackages.university.student;

public class Student {
	private String studentName;
    private int studentId;
    private String enrolledCourse;
    private String candidatePhoneNumber;
    private int candidateFeesDue;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getEnrolledCourse() {
		return enrolledCourse;
	}
	public void setEnrolledCourse(String enrolledCourse) {
		this.enrolledCourse = enrolledCourse;
	}
	public String getCandidatePhoneNumber() {
		return candidatePhoneNumber;
	}
	public void setCandidatePhoneNumber(String candidatePhoneNumber) {
		this.candidatePhoneNumber = candidatePhoneNumber;
	}
	public int getCandidateFeesDue() {
		return candidateFeesDue;
	}
	public void setCandidateFeesDue(int candidateFeesDue) {
		this.candidateFeesDue = candidateFeesDue;
	}
    
}
