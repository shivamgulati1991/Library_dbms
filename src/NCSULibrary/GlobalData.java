/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NCSULibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author shiva
 */
public class GlobalData {
    public static String loginSession="";
    public static String loginpassword="";
    public static String loginType="";
    public static String DRIVER = "oracle.jdbc.driver.OracleDriver";
    public static String DB_URL ="jdbc:oracle:thin:@ora.csc.ncsu.edu:1521:ORCL";
    public static String USER_NAME = "sgulati2";
    public static String PASS = "200109633";
    public static Connection connection = null;
    public static void main(String args[]) {  
  
  // create connection in JDBC  
try {
                
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {

			System.out.println("Where is your Oracle JDBC Driver?");
			e.printStackTrace();
			return;

		}

		System.out.println("Oracle JDBC Driver Registered!");

		Connection connection = null;

		try {

			connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@ora.csc.ncsu.edu:1521:ORCL", "sgulati2",
					"200109633");

		      // Close the connection
		     // connection.close();  

		} catch (SQLException e) {

			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;

		}
  }    
    
    public GlobalData() throws SQLException{
        connection = DriverManager.getConnection(DB_URL,USER_NAME ,PASS);
    }
 }  
