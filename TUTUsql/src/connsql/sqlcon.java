package connsql;

import java.sql.*;

public class sqlcon {
	public static void main(String[] args) {
		String driverName = "com.mysql.cj.jdbc.Driver"; // JDBC����
		String dbURL = "jdbc:mysql://localhost:3306/thx?serverTimezone=UTC"; // ���ӷ����������ݿ�test
		String userName = "root"; // Ĭ���û���
		String userPwd = "123456"; // ����
		Connection con;
		try {
			Class.forName(driverName); // ����JDBC����
			con = DriverManager.getConnection(dbURL, userName, userPwd);
			System.out.println("Connection Successful!"); // ������ӳɹ�����̨���Connection Successful!
			Statement stmt=con.createStatement();//����SQL�������
			//������
			System.out.println("��ʼ������");
			String query="create table TABLE1(ID VARCHAR(2),NAME VARCHAR(10))";//������SQL���
			stmt.executeUpdate(query);//ִ��SQL�������
			System.out.println("�����ɹ�");
			//��������
			System.out.println("��ʼ��������");
			String a1="INSERT INTO TABLE1 VALUES('1','���')";//��������SQL���
			String a2="INSERT INTO TABLE1 VALUES('2','ΰ��')";
			String a3="INSERT INTO TABLE1 VALUES('3','�Ÿ�')";
			stmt.executeUpdate(a1);//ִ��SQL�������
			stmt.executeUpdate(a2);   
			stmt.executeUpdate(a3);
			System.out.println("�������ݳɹ�");
			//��ȡ����
			System.out.println("��ʼ��ȡ����");
			ResultSet rs=stmt.executeQuery("SELECT * FROM TABLE1 WHERE ID=id");//����SQL����ѯ�����(����)
			//ѭ�����ÿһ����¼
			 while(rs.next())
			{
				//���ÿ���ֶ�
				System.out.println(rs.getString("ID")+"\t"+rs.getString("NAME"));
			}
			System.out.println("��ȡ���");
			//�ر�����
			stmt.close();//�ر������������
			con.close();//�ر����ݿ�����
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��������ʧ�ܣ�");
		}

	}
}
