import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class SQLconnect {
    static final String driver = "com.mysql.jdbc.Driver";
    static final String protocol = "jdbc:mysql://localhost:3307/ben_s?useSSL=true";
    static final String user = "root";
    static final String password = "Abc12345";
    static Connection connection = null;
    static Statement statement = null;
   public static Connection dbConnction()
   {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		connection  = DriverManager.getConnection(protocol, user, password);
		statement = connection.createStatement();
		return connection;
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, e);
		return null;
	}  
	
   }
}
