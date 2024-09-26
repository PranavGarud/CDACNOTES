package day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBCRUDOperartions {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection con =null;
		String url = "jdbc:mysql://localhost:3306/mycollege";
		Class.forName("com.mysql.cj.jdbc.Driver");
		String insertrecord = "insert into student values(?,?,?,?,?);";
		String selectrecord = "select * from student";
		String updaterecord = "update student set marks = ? where rollno = ?; ";
		try {
			  con=DriverManager.getConnection(url,"root","root");
			  PreparedStatement pst = con.prepareStatement(insertrecord);
			  pst.setInt(1,14);
			  pst.setString(2,"Niks");
			  pst.setString(3,"P");
			  pst.setInt(4,2);
			  pst.setInt(5,98);
			  int count = pst.executeUpdate();
			  System.out.println(count + "row(s) affected");
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		try {
			  con=DriverManager.getConnection(url,"root","root");
			  Statement st = con.createStatement();
			  ResultSet records = st.executeQuery(selectrecord);
			  while(records.next())
			  {
				 System.out.println(records.getInt(1)+","+records.getString(2)+","+records.getString(3)+","
			  		  +records.getInt(4)+","+records.getInt(5));
			  }
			}	
		catch(SQLException e) {
			System.out.println(e);
		}
		try {
			  con=DriverManager.getConnection(url,"root","root");
			  PreparedStatement pst = con.prepareStatement(updaterecord);
			  pst.setInt(1,65);
			  pst.setInt(2,13);
			  int count = pst.executeUpdate();
			  System.out.println(count + "row(s) affected");
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
}
