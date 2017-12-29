
public class Projects {
	String Description;
	String Project_Name;
	String Client_Name;
	String Project_id;
	String Start_Date;
	
	public Projects() {
		super();
	}
	public Projects(String description, String project_Name, String client_Name, String project_id, String start_Date) {
		super();
		Description = description;
		Project_Name = project_Name;
		Client_Name = client_Name;
		Project_id = project_id;
		Start_Date = start_Date;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getProject_name() {
		return Project_Name;
	}
	public void setProject_name(String project_name) {
		Project_Name = project_name;
	}
	public String getClient_Name() {
		return Client_Name;
	}
	public void setClient_Name(String client_Name) {
		Client_Name = client_Name;
	}
	public String getProject_id() {
		return Project_id;
	}
	public void setProject_id(String project_id) {
		Project_id = project_id;
	}
	public String getStart_Date() {
		return Start_Date;
	}
	public void setStart_Date(String start_Date) {
		Start_Date = start_Date;
	}
	@Override
	public String toString() {
		return "Projects [Description=" + Description + ", Project_name=" + Project_Name + ", Client_Name="
				+ Client_Name + ", Project_id=" + Project_id + ", Start_Date=" + Start_Date + "]";
	}
	

}
