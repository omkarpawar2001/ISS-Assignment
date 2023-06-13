import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.Statement;


public class JavaConnect2SQL {
   static final String DB_URL = "jdbc:mysql://localhost/omkardb";
   static final String USER = "omkar";
   static final String PASS = "omkar123";

   public static void main(String[] args) {
      System.out.println("Connecting to a selected database...");
      // Open a connection

      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);) {		      
         System.out.println("Connected database successfully...");  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
      
      //Create Table
//      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//    	         Statement stmt = conn.createStatement();
//    	      ) {		      
//    	          Strinog sql = "CREATE TABLE REGISTRATION " +
//    	                   "(id INTEGER not NULL, " +
//    	                   " first VARCHAR(255), " + 
//    	                   " last VARCHAR(255), " + 
//    	                   " age INTEGER, " + 
//    	                   " PRIMARY KEY ( id ))"; 
//
//    	         stmt.executeUpdate(sql);
//    	         System.out.println("Created table in given database...");   	  
//    	      } catch (SQLException e) {
//    	         e.printStackTrace();
//    	      } 
      
      
      //Insert Records
//      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//    	         Statement stmt = conn.createStatement();
//    	      ) {		      
//    	         // Execute a query
//    	         System.out.println("Inserting records into the table...");          
//    	         String sql = "INSERT INTO Registration VALUES (100, 'Zara', 'Ali', 18)";
//    	         stmt.executeUpdate(sql);
//    	         sql = "INSERT INTO Registration VALUES (101, 'Mahnaz', 'Fatma', 25)";
//    	         stmt.executeUpdate(sql);
//    	         sql = "INSERT INTO Registration VALUES (102, 'Zaid', 'Khan', 30)";
//    	         stmt.executeUpdate(sql);
//    	         sql = "INSERT INTO Registration VALUES(103, 'Sumit', 'Mittal', 28)";
//    	         stmt.executeUpdate(sql);
//    	         System.out.println("Inserted records into the table...");   	  
//    	      } catch (SQLException e) {
//    	         e.printStackTrace();
//    	      } 
      
      
      //Display Records
//      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//    	         Statement stmt = conn.createStatement();
//    	         ResultSet rs = stmt.executeQuery("SELECT id, first, last, age FROM Registration");
//    	      ) {		      
//    	         while(rs.next()){
//    	            //Display values
//    	            System.out.print("ID: " + rs.getInt("id"));
//    	            System.out.print(", Age: " + rs.getInt("age"));
//    	            System.out.print(", First: " + rs.getString("first"));
//    	            System.out.println(", Last: " + rs.getString("last"));
//    	         }
//    	      } catch (SQLException e) {
//    	         e.printStackTrace();
//    	      } 
      
      
      
      //Update Records
//      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//    	         Statement stmt = conn.createStatement();
//    	      ) {		      
//    	         String sql = "UPDATE Registration " +
//    	            "SET age = 24 WHERE id in (100, 101)";
//    	         stmt.executeUpdate(sql);
//    	         ResultSet rs = stmt.executeQuery("SELECT id, first, last, age FROM Registration");
//    	         while(rs.next()){
//    	            //Display values
//    	            System.out.print("ID: " + rs.getInt("id"));
//    	            System.out.print(", Age: " + rs.getInt("age"));
//    	            System.out.print(", First: " + rs.getString("first"));
//    	            System.out.println(", Last: " + rs.getString("last"));
//    	         }
//    	         rs.close();
//    	      } catch (SQLException e) {
//    	         e.printStackTrace();
//    	      } 
      
      
      
      //Delete Records
//      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//    	         Statement stmt = conn.createStatement();
//    	      ) {		      
//    	         String sql = "DELETE FROM Registration " +
//    	            "WHERE id = 101";
//    	         stmt.executeUpdate(sql);
//    	         ResultSet rs = stmt.executeQuery("SELECT id, first, last, age FROM Registration");
//    	         while(rs.next()){
//    	            //Display values
//    	            System.out.print("ID: " + rs.getInt("id"));
//    	            System.out.print(", Age: " + rs.getInt("age"));
//    	            System.out.print(", First: " + rs.getString("first"));
//    	            System.out.println(", Last: " + rs.getString("last"));
//    	         }
//    	         rs.close();
//    	      } catch (SQLException e) {
//    	         e.printStackTrace();
//    	      }
      
      
      //Callable Statement
//      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//    	         CallableStatement stmt = conn.prepareCall("{call getEmpName (?, ?)}");
//    	      ) {		      
//    	         // Bind values into the parameters.
//    	         stmt.setInt(1, 2);  // This would set ID
//    	         // Because second parameter is OUT so register it
//    	         stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
//    	         //Use execute method to run stored procedure.
//    	         System.out.println("Executing stored procedure..." );
//    	         stmt.execute();
//    	         //Retrieve employee name with getXXX method
//    	         String empName = stmt.getString(2);
//    	         System.out.println("Emp Name with ID: 102 is " + empName);
//    	      } catch (SQLException e) {
//    	         e.printStackTrace();
//    	      } 
      
      
      //prepared statement
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    	         PreparedStatement stmt = conn.prepareStatement("UPDATE Employees set age=? WHERE id=?");
    	      ) {		      
    	         // Bind values into the parameters.
    	         stmt.setInt(1, 36);  // This would set age
    	         stmt.setInt(2, 4); // This would set ID

    	         // Let us update age of the record with ID = 102;
    	         int rows = stmt.executeUpdate();
    	         System.out.println("Rows impacted : " + rows );

    	         // Let us select all the records and display them.
    	         ResultSet rs = stmt.executeQuery("SELECT id, first, last, age FROM Employees");		      

    	         // Extract data from result set
    	         while (rs.next()) {
    	            // Retrieve by column name
    	            System.out.print("ID: " + rs.getInt("id"));
    	            System.out.print(", Age: " + rs.getInt("age"));
    	            System.out.print(", First: " + rs.getString("first"));
    	            System.out.println(", Last: " + rs.getString("last"));
    	         }
    	         rs.close();
    	      } catch (SQLException e) {
    	         e.printStackTrace();
    	      } 
   }
}