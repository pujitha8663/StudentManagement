package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Utill.UtilConnection;
import com.model.Student;

public class StudentImpl implements StudentDao {

	public List<Student> getAllStudents() {
		Connection c=null;
		PreparedStatement p =null;
		ResultSet rs=null;
		List<Student> s =new ArrayList<Student>();
		
		c=UtilConnection.getConnection();
		try {
			p=c.prepareStatement("select*from students");
			rs=p.executeQuery();
			
			while (rs.next()) {
				Student st = new Student();
				
				st.setId(rs.getInt("id"));
				st.setName(rs.getString("name"));
				st.setFee(rs.getDouble("fee"));
				st.setCourse(rs.getString("course"));
			s.add(st);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return s;
		
	}

	public void add(Student student) {
		// TODO Auto-generated method stub
		
	}

}
