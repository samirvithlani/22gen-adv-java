package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.StudentBean;
import util.DBConnection;

public class StudentDao {

	public boolean addStudent(StudentBean studentBean) {

		boolean flag = false;

		// connection...

		Connection conn = DBConnection.getConnection();
		if (conn != null) {

			String INSERTSQL = "insert into student(sName,sAge,sEmail)values(?,?,?)";
			try {
				PreparedStatement pstmt = conn.prepareStatement(INSERTSQL);
				pstmt.setString(1, studentBean.getsName());
				pstmt.setInt(2, studentBean.getsAge());
				pstmt.setString(3, studentBean.getsEmail());

				int res = pstmt.executeUpdate();
				if (res > 0) {
					flag = true;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return flag;

	}

	public List<StudentBean> getAllStudents() {

		Connection conn = DBConnection.getConnection();
		List<StudentBean> students = new ArrayList<StudentBean>();
		if (conn != null) {

			String SelectSQl = "select * from student";
			try {
				PreparedStatement pstmt = conn.prepareStatement(SelectSQl);

				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {

					StudentBean studentBean = new StudentBean();
					studentBean.setsId(rs.getInt("sid"));
					studentBean.setsName(rs.getString("sname"));
					studentBean.setsEmail(rs.getString("semail"));
					studentBean.setsAge(rs.getInt("sage"));

					students.add(studentBean);

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return students;

	}

}
