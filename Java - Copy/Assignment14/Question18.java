package Assignment14;

import java.sql.Connection;
import java.sql.SQLException;

public class Question18 {
	public static void commit() {
		Object tl;
		Connection conn = ((Object) tl).get();
		if (conn != null) {
			try {
				conn.commit();
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException("Connection 事务提交异常");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(commit);
	}

}
