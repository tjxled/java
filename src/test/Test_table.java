package test;
import java.sql.*;

public class Test_table {
	public static void main(String args[]){
	try {  
	      Class.forName("com.mysql.jdbc.Driver");     //����MYSQL JDBC��������     
	      //Class.forName("org.gjt.mm.mysql.Driver");  
	    }  
	    catch (Exception e1) {  
	      System.out.print("Error loading Mysql Driver!");  
	      e1.printStackTrace();  
	    }  
	    try {  
	      Connection connect = DriverManager.getConnection(  
	          "jdbc:mysql://localhost:3306/test","root","123456");  
	      System.out.println("connect success");
	           //����URLΪ   jdbc:mysql//��������ַ/���ݿ���  �������2�������ֱ��ǵ�½�û���������  
	      
	      String sql = "select id,name,salary from test_table";
	      PreparedStatement preparedStatement = connect.prepareStatement(sql);
	      ResultSet rs = preparedStatement.executeQuery();
	                                                              //user Ϊ��������  
	      while (rs.next()) {  
	        System.out.println(rs.getInt(1) + "   "+ rs.getString(2));  
	      }  
	    }  
	    catch (Exception e1) {  
	      System.out.print("get data error!");  
	      e1.printStackTrace();  
	    }
	}
}
