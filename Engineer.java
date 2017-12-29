
public class Engineer {
	public String first_name;
	public String last_name;
	public String Date_of_Birth;
	public String Age;
	public String Adress;
	public String id;
	public String Domain_Number;
	public String Domain_Name;
	public String Expertise;
	
	public Engineer() {
		super();
	}
	public Engineer(String first_name, String last_name, String date_of_Birth, String age, String adress, String id,
			String domain_Number, String domain_Name, String expertise) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		Date_of_Birth = date_of_Birth;
		Age = age;
		Adress = adress;
		this.id = id;
		Domain_Number = domain_Number;
		Domain_Name = domain_Name;
		Expertise = expertise;
	}
	public String getDomain_Number() {
		return Domain_Number;
	}
	public void setDomain_Number(String domain_Number) {
		Domain_Number = domain_Number;
	}
	public String getDomain_Name() {
		return Domain_Name;
	}
	public void setDomain_Name(String domain_Name) {
		Domain_Name = domain_Name;
	}
	public String getExpertise() {
		return Expertise;
	}
	public void setExpertise(String expertise) {
		Expertise = expertise;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDate_of_Birth() {
		return Date_of_Birth;
	}
	public void setDate_of_Birth(String date_of_Birth) {
		Date_of_Birth = date_of_Birth;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Engineer [first_name=" + first_name + ", last_name=" + last_name + ", Date_of_Birth=" + Date_of_Birth
				+ ", Age=" + Age + ", Adress=" + Adress + ", id=" + id + ", Domain_Number=" + Domain_Number
				+ ", Domain_Name=" + Domain_Name + ", Expertise=" + Expertise + "]";
	}
	
	public String showifno()//Show info qury
	{
		String show_info = "SELECT `engineer`.`Engineer_Id`,"
                +"engineer`.`First_Name`,"
                +"`engineer`.`Last_Name`,"
                +"`engineer`.`Date_Of_Birth`,"
                +"`engineer`.`Adress`,"
                +"`engineer`.`Age`"
                +"FROM `ben_s`.`engineer`;";
		return show_info;
	}
	public String Inerst()//INSERT QURY!!
	{
		String insert_to_engineer_BOX=" INSERT INTO `ben_s`.`engineer`"/*Into Engineer Table*/
                +"(`Engineer_Id`,`First_Name`,`Last_Name`,`Date_Of_Birth`,`Adress`,`Age`)"
                + "VALUES"
                +"("+this.id+","+this.first_name+","+this.last_name+","+this.Date_of_Birth+","+this.Adress+","+this.Age+");"
                +"INSERT INTO `ben_s`.`software_area`"/*Into Software_Area Table*/
                +"(`Domain_Number`,`Domain_Name`,`Expertise`)"
                + "VALUES"
                + "("+this.Domain_Number+","+this.Domain_Name+","+this.Expertise+");"
                +" INSERT INTO `ben_s`.`work_in_the_field`"/*Into work_in_the_field Table*/
                + "(`Engineer_id`,`Domain_Name`,`Domain_Number`)"
                + "VALUES"
                + "("+this.id+","+this.Domain_Name+","+this.Domain_Number+");";
		return insert_to_engineer_BOX;
	}
	public String update_engineer_info()
	{
		/*UpDate Qury to Engnieer */
		String upDate_to_Engineer="UPDATE `ben_s`.`engineer`"
		                                       +"SET"
		                                       +"`First_Name` ="+this.first_name+","
		                                       +"'Last_Name' = "+this.last_name+","
		                                       +"`Adress` =" +this.Adress+","
		                                       +"WHERE `Engineer_Id` ="+this.id;
	return upDate_to_Engineer;
	}
	public String delete_engineer()
	{
		/*Delete Qury to Engnieer */
		String delete_Engineer="DELETE FROM `ben_s`.`engineer`"
		                                       +"WHERE `Engineer_Id` ="+this.id
		                                       +"DELETE FROM `ben_s`.`work_in_the_field`"
		                                       +"WHERE `Engineer_Id` ="+this.id
		                                       +"DELETE FROM `ben_s`.`works_on`"
		                                       +"WHERE `Engineer_Id` ="+this.id     
		                                       +"DELETE FROM `ben_s`.`phone`"
		                                       +"WHERE `Engineer_Id` ="+this.id;
	return delete_Engineer;
	}
	
	
}


