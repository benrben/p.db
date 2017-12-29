import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//main
public class Create {
              // Database credentials
              static final String driver = "com.mysql.jdbc.Driver";
              static final String protocol = "jdbc:mysql://localhost:3307/ben_s?useSSL=true";
              static final String user = "root";
              static final String password = "Abc12345";
             
              public static void main(String[] args) {
                           Connection connection = null;
                           Statement statement = null;
                           try {
                                Class.forName("com.mysql.jdbc.Driver");
                                // Open connection with the correct information
                                connection = DriverManager.getConnection(protocol, user, password);
                                //making a statement for testing our system 
                                statement = connection.createStatement();
              /*__________________________________________CREATE_TABLES_TO_DB_________________________________________*/
                                        //Engineer TABALE CERATION
                                        String engineer = "CREATE TABLE IF NOT EXISTS Engineer "
                                                    + "(Engineer_Id INTEGER not NULL AUTO_INCREMENT,"
                                                    + "First_Name VARCHAR(30), "
                                                    + "Last_Name VARCHAR(30), "
                                                    + "Date_Of_Birth VARCHAR(30), "
                                                    + "Adress VARCHAR(30), "
                                                    + "Age INTEGER, "
                                                    + "PRIMARY KEY ( Engineer_Id))";               
                                        statement.execute(engineer);
                                        //Phone TABALE CERATION
                                        String phone = "CREATE TABLE IF NOT EXISTS Phone"
                                                    +"(Engineer_Id INTEGER not NULL AUTO_INCREMENT,"
                                                    +"Phone VARCHAR(20),"
                                                    +"FOREIGN KEY(Engineer_Id) REFERENCES Engineer(Engineer_Id),"
                                                    +"PRIMARY KEY (Phone))";
                                        statement.execute(phone);
                                        //Software_Area TABALE CERATION
                                        String software_area = "CREATE TABLE IF NOT EXISTS Software_Area"
                                                    +"(Domain_Number INTEGER not NULL AUTO_INCREMENT,"
                                                    +"Domain_Name VARCHAR(30),"
                                                    +"Expertise VARCHAR(30),"
                                                    +"PRIMARY KEY (Domain_Number))";
                                        statement.execute(software_area);
                                        //Work_in_The_Field TABALE CERATION
                                        String work_in_the_field ="CREATE TABLE IF NOT EXISTS Work_In_The_Field"
                                                    +"(Engineer_id INTEGER not NULL,"
                                                    +"Domain_Name VARCHAR(20),"
                                                    +"Domain_Number INTEGER not NULL,"
                                                    +"FOREIGN KEY(Engineer_Id) REFERENCES Engineer(Engineer_Id),"
                                                    +"FOREIGN KEY(Domain_Number) REFERENCES Software_Area(Domain_Number))";
                                        statement.execute(work_in_the_field); 
                                        //Project TABALE CERATION
                                        String project = "CREATE TABLE IF NOT EXISTS Project"
                                                    +"(Project_ID INTEGER not NULL,"
                                                    +"Description  VARCHAR(300),"
                                                    +"Project_Name VARCHAR(30),"
                                                    +"Client_Name  VARCHAR(30),"
                                                    +"Start_Date   VARCHAR(10),"
                                                    +"PRIMARY KEY (Project_Id))";
                                                    statement.execute(project);
                                        // Development_Enviroment TABALE CERATION
                                        String  Development_Enviroment ="CREATE TABLE IF NOT EXISTS Development_Enviroment"
                                                    +"(Development_Enviroment_Id INTEGER not NULL,"
                                                    +"Requirements_Managment  VARCHAR(20),"
                                                    +"Planning 			    VARCHAR(10),"
                                                    +"Task_Managment          VARCHAR(30),"
                                                    +"Design                  VARCHAR(10),"
                                                    +"Unit_Tests              VARCHAR(20),"
                                                    +"Configuration_Managment VARCHAR(20),"
                                                    +"Software_Testing        VARCHAR(20),"
                                                    +"PRIMARY KEY (Development_Enviroment_Id))";
                                          statement.execute(Development_Enviroment);
                                        //Include TABALE CERATION
                                        String include = "CREATE TABLE IF NOT EXISTS Include"
                                                    +"(Project_ID INTEGER not NULL,"
                                                    +"Development_Enviroment_Id INTEGER not NULL,"
                                                    +"FOREIGN KEY(Project_Id) REFERENCES Project(Project_Id),"
                                                    +"FOREIGN KEY(Development_Enviroment_Id) REFERENCES Development_Enviroment(Development_Enviroment_Id))";
                                          statement.execute(include);
                                          
                                          //Works_On TABALE CERATION
                                        String Works_On ="CREATE TABLE IF NOT EXISTS Works_On"
                                                    +"(Domain_Number INTEGER not NULL ,"
                                                    +"Project_Id INTEGER not NULL ,"
                                                    +"Engineer_Id INTEGER not NULL ,"
                                                    +"Date_Mounth DATE,"
                                                    +"Role VARCHAR(20),"
                                                    +"Rate VARCHAR(20),"
                                                    +"FOREIGN KEY(Project_Id) REFERENCES Project (Project_Id),"
                                                    +"FOREIGN KEY(Engineer_Id) REFERENCES Engineer(Engineer_Id),"
                                                    +"FOREIGN KEY(Domain_Number) REFERENCES Software_Area(Domain_Number),"
                                                    +"PRIMARY KEY (Date_Mounth))";
                                          statement.execute(Works_On);
                                          //Milestone TABALE CERATION
                                        String  Milestons ="CREATE TABLE IF NOT EXISTS Milestons"
                                          			+"(Date_I DATE not NULL ,"
                                          			+"Revenue VARCHAR(20),"
                                          			+"Submission VARCHAR(20),"
                                          			+"Project_id INTEGER NOT NULL,"
                                          			+"FOREIGN KEY(Project_Id) REFERENCES project (Project_Id),"
                                          			+"PRIMARY KEY (Date_I))";
                                          statement.execute(Milestons); 
                                          //Has TABALE CERATION
                                        String Has ="CREATE TABLE IF NOT EXISTS Has"
                                                    + "(Project_ID INTEGER not NULL ,"
                                                    + "Date_I DATE not NULL,"
                                                    +"FOREIGN KEY(Project_Id) REFERENCES Project(Project_Id),"
                                                    + "FOREIGN KEY(Date_I) REFERENCES Milestons(Date_I))";
                                        statement.execute(Has);

                                         }
                           catch (SQLException se)
                           {           
                                         se.printStackTrace();
                           }
                           catch (Exception e)
                           {
                                         e.printStackTrace();
                           }
                           finally
                           {
                                         try
                                         {
                                                       if (statement != null)
                                                                    connection.close();
                                         }
                                         catch (SQLException se) {}
                                         try
                                         {
                                                       if (connection != null)
                                                                    connection.close();
                                         }
                                         catch (SQLException se)
                                         {se.printStackTrace();}
                           }
                           System.out.println("End of Creation");
              }
 
}