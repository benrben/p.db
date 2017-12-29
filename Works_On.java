

public class Works_On extends Engineer {
	public String Date_Mounth;
	public String Role;
	public String Rate;

	public Works_On(String date_Mounth, String role, String rate, Projects mClass) {
		super();
		Date_Mounth = date_Mounth;
		Role = role;
		Rate = rate;
		this.mClass = mClass;
	}
	String input;
	
	@Override
	public String toString() {
		return "Works_On [Date_Mounth=" + Date_Mounth + ", Role=" + Role + ", Rate=" + Rate + ", mClass=" + mClass+ "]";
	}

    private Projects mClass;

	public String getDate_Mounth()
	{
		return Date_Mounth;
		
	}
	
	public String getRole()
	{
		return Role;
	}
	
	public String getRate(){
		return Rate;
	}
	
	public void setDate_Mounth(String newdate)
	{
		Date_Mounth=newdate;
	}
	
	public void setRole(String newRole)
	{
		Role=newRole;
	}
	
	public void setRate(String newRate)
	{
		Rate=newRate;
	}
	
	

}
