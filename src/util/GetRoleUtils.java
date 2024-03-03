package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.RoleBean;

public class GetRoleUtils {

	public static List<RoleBean> getAllRoles() {

		Connection conn = DBConnection.getConnection();
		List<RoleBean> roles = new ArrayList<RoleBean>();
		if (conn != null) {

			try {
				PreparedStatement pstmt = conn.prepareStatement("select * from role");
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {
					RoleBean roleBean = new RoleBean();
					roleBean.setrId(rs.getInt("rid"));
					roleBean.setrName(rs.getString("rname"));

					roles.add(roleBean);

				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return roles;

	}
}
