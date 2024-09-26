package day11;

import java.sql.*;


public class BasicQueries {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/mycollege";
		Statement st=null;
		Connection con =null;
		String createTable = "create table student(\r\n"
				+ "rollNo int not null,\r\n"
				+ "firstname varchar(20) not null,\r\n"
				+ "lastname varchar(20) not null ,\r\n"
				+ "deptid int not null,\r\n"
				+ "marks int,\r\n"
				+ "primary key(rollno));";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			  con=DriverManager.getConnection(url,"root","root");
			st = con.createStatement();
			int count = st.executeUpdate(createTable);
			System.out.println(count + "rows(s) affected");
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		finally {
		st.close();
		con.close();
		}
	}
}
