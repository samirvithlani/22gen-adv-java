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

	public boolean updateStudent(StudentBean studentBean, int sId) {

		boolean flag = false;
		Connection conn = DBConnection.getConnection();
		if (conn != null) {

			String updateSQl = "update student set sname=?,semail=?,sage=? where sid = ?";
			try {
				PreparedStatement pstmt = conn.prepareStatement(updateSQl);
				pstmt.setString(1, studentBean.getsName());
				pstmt.setString(2, studentBean.getsEmail());
				pstmt.setInt(3, studentBean.getsAge());
				pstmt.setInt(4, sId);

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

	public StudentBean getStudentDetailById(int sId) {

		StudentBean studentBean = null;

		Connection conn = DBConnection.getConnection();
		if (conn != null) {

			String SELECTSQL = "select * from student where sid = ?";
			try {
				PreparedStatement pstmt = conn.prepareStatement(SELECTSQL);
				pstmt.setInt(1, sId);

				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {
					studentBean = new StudentBean();
					studentBean.setsId(rs.getInt("sid"));
					studentBean.setsName(rs.getString("sName"));
					studentBean.setsEmail(rs.getString("semail"));
					studentBean.setsAge(rs.getInt("sage"));

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return studentBean;

	}

	public boolean deleteStudent(int sId) {

		boolean flag = false;

		Connection conn = DBConnection.getConnection();
		if (conn != null) {

			String DELETESQL = " delete from student where sid = ?";
			try {
				PreparedStatement pstmt = conn.prepareStatement(DELETESQL);
				pstmt.setInt(1, sId);

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

	public boolean addStudent(StudentBean studentBean) {

		boolean flag = false;

		// connection...

		Connection conn = DBConnection.getConnection();
		if (conn != null) {

			String INSERTSQL = "insert into student(sName,sAge,sEmail,sPassword)values(?,?,?,?)";
			try {
				PreparedStatement pstmt = conn.prepareStatement(INSERTSQL);
				pstmt.setString(1, studentBean.getsName());
				pstmt.setInt(2, studentBean.getsAge());
				pstmt.setString(3, studentBean.getsEmail());
				pstmt.setString(4, studentBean.getsPassword());

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

	public StudentBean loginStudent(String email, String password) {

		StudentBean studentBean = null;

		Connection conn = DBConnection.getConnection();
		if (conn != null) {

			String selectSQL = "select * from student where semail =? and spassword =?";
			try {
				PreparedStatement pstmt = conn.prepareStatement(selectSQL);
				pstmt.setString(1, email);
				pstmt.setString(2, password);
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {
					studentBean = new StudentBean();
					studentBean.setsId(rs.getInt("sid"));
					studentBean.setsName(rs.getString("sname"));
					studentBean.setsEmail(rs.getString("semail"));
					studentBean.setsAge(rs.getInt("sage"));

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return studentBean;

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
