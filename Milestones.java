
public class Milestones {
	String Revenue;
	String Submission;
	String Date;
	
	public Milestones() {
		super();
	}
	public Milestones(String revenue, String submission, String date) {
		super();
		Revenue = revenue;
		Submission = submission;
		Date = date;
	}
	public String getRevenue() {
		return Revenue;
	}
	public void setRevenue(String revenue) {
		Revenue = revenue;
	}
	public String getSubmission() {
		return Submission;
	}
	public void setSubmission(String submission) {
		Submission = submission;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	@Override
	public String toString() {
		return "Milestones [Revenue=" + Revenue + ", Submission=" + Submission + ", Date=" + Date + "]";
	}
	

}
