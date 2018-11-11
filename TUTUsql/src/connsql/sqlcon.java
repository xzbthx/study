package connsql;

import java.sql.*;

public class sqlcon {
	public static void main(String[] args) {
		String driverName = "com.mysql.cj.jdbc.Driver"; // JDBC驱动
		String dbURL = "jdbc:mysql://localhost:3306/thx?serverTimezone=UTC"; // 连接服务器和数据库test
		String userName = "root"; // 默认用户名
		String userPwd = "123456"; // 密码
		Connection con;
		try {
			Class.forName(driverName); // 加载JDBC驱动
			con = DriverManager.getConnection(dbURL, userName, userPwd);
			System.out.println("Connection Successful!"); // 如果连接成功控制台输出Connection Successful!
			Statement stmt=con.createStatement();//创建SQL命令对象
			//创建表
			System.out.println("开始创建表");
			String query="create table TABLE1(ID VARCHAR(2),NAME VARCHAR(10))";//创建表SQL语句
			stmt.executeUpdate(query);//执行SQL命令对象
			System.out.println("表创建成功");
			//输入数据
			System.out.println("开始插入数据");
			String a1="INSERT INTO TABLE1 VALUES('1','旭哥')";//插入数据SQL语句
			String a2="INSERT INTO TABLE1 VALUES('2','伟哥')";
			String a3="INSERT INTO TABLE1 VALUES('3','张哥')";
			stmt.executeUpdate(a1);//执行SQL命令对象
			stmt.executeUpdate(a2);   
			stmt.executeUpdate(a3);
			System.out.println("插入数据成功");
			//读取数据
			System.out.println("开始读取数据");
			ResultSet rs=stmt.executeQuery("SELECT * FROM TABLE1 WHERE ID=id");//返回SQL语句查询结果集(集合)
			//循环输出每一条记录
			 while(rs.next())
			{
				//输出每个字段
				System.out.println(rs.getString("ID")+"\t"+rs.getString("NAME"));
			}
			System.out.println("读取完毕");
			//关闭连接
			stmt.close();//关闭命令对象连接
			con.close();//关闭数据库连接
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("加载驱动失败！");
		}

	}
}
