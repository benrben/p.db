
public class Development_Enviroment {
	String Requirements_Management;
	String Planning;
    String Task_Management;
    String Design;
    String Unit_Tests;
    String Development_Enviroment_ID;
    String Software_Testing;
    String Configuration_Management;
    
    
	public Development_Enviroment() {
		super();
	}
	public Development_Enviroment(String requirements_Management, String planning, String task_Management,
			String design, String unit_Tests, String development_Enviroment_ID, String software_Testing,
			String configuration_Management) {
		super();
		Requirements_Management = requirements_Management;
		Planning = planning;
		Task_Management = task_Management;
		Design = design;
		Unit_Tests = unit_Tests;
		Development_Enviroment_ID = development_Enviroment_ID;
		Software_Testing = software_Testing;
		Configuration_Management = configuration_Management;
	}
	public String getRequirements_Management() {
		return Requirements_Management;
	}
	public void setRequirements_Management(String requirements_Management) {
		Requirements_Management = requirements_Management;
	}
	public String getPlanning() {
		return Planning;
	}
	public void setPlanning(String planning) {
		Planning = planning;
	}
	public String getTask_Management() {
		return Task_Management;
	}
	public void setTask_Management(String task_Management) {
		Task_Management = task_Management;
	}
	public String getDesign() {
		return Design;
	}
	public void setDesign(String design) {
		Design = design;
	}
	public String getUnit_Tests() {
		return Unit_Tests;
	}
	public void setUnit_Tests(String unit_Tests) {
		Unit_Tests = unit_Tests;
	}
	public String getDevelopment_Enviroment_ID() {
		return Development_Enviroment_ID;
	}
	public void setDevelopment_Enviroment_ID(String development_Enviroment_ID) {
		Development_Enviroment_ID = development_Enviroment_ID;
	}
	public String getSoftware_Testing() {
		return Software_Testing;
	}
	public void setSoftware_Testing(String software_Testing) {
		Software_Testing = software_Testing;
	}
	public String getConfiguration_Management() {
		return Configuration_Management;
	}
	public void setConfiguration_Management(String configuration_Management) {
		Configuration_Management = configuration_Management;
	}
	@Override
	public String toString() {
		return "Development_Enviroment [Requirements_Management=" + Requirements_Management + ", Planning=" + Planning
				+ ", Task_Management=" + Task_Management + ", Design=" + Design + ", Unit_Tests=" + Unit_Tests
				+ ", Development_Enviroment_ID=" + Development_Enviroment_ID + ", Software_Testing=" + Software_Testing
				+ ", Configuration_Management=" + Configuration_Management + "]";
	}
	

}
