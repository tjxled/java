package test;
import java.sql.*;

public class Test_table {
	public static void main(String args[]){
	try {  
	      Class.forName("com.mysql.jdbc.Driver");     //加载MYSQL JDBC驱动程序     
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
	           //连接URL为   jdbc:mysql//服务器地址/数据库名  ，后面的2个参数分别是登陆用户名和密码  
	      
	      String sql = "select id,name,salary from test_table";
	      PreparedStatement preparedStatement = connect.prepareStatement(sql);
	      ResultSet rs = preparedStatement.executeQuery();
	                                                              //user 为你表的名称  
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
