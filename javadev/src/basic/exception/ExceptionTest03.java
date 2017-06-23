package basic.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/*
 Dynamic Query vs. Parameter Query
 1. 쿼리작성이 간결
 2. 성능이 더 좋음 : 항상 날아가는 Query가 Parameter Query는 같기 때문
 3. SQL Injection에 더 좋음
 */

public class ExceptionTest03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("id : "); String user_id = sc.nextLine();
		System.out.print("pw : "); String user_pw = sc.nextLine();
		MemberVO userInfo = new MemberVO();
		userInfo.setUser_id(user_id);
		userInfo.setUser_pw(user_pw);
		
		try {
			userInfo = login(userInfo);
			System.out.println(userInfo.getUser_name() + "님이 로그인 하셨습니다.");
		} catch (Exception e) {
		
			System.out.println(e.getMessage());
		}

		
	}

	private static MemberVO login(MemberVO userInfo) throws Exception{
		Connection cn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		StringBuffer sql = new StringBuffer();
		sql.append(" SELECT user_name");
		sql.append(" FROM   t_mem");
		sql.append(" WHERE  user_id=?"); 
		sql.append(" and    user_pw=?");
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
											 "bigdata", 
											 "bigdata");
			st = cn.prepareStatement(sql.toString());
			st.setString(1, userInfo.getUser_id());
			st.setString(2, userInfo.getUser_pw());
			rs = st.executeQuery();
			if (rs.next()) {
				userInfo.setUser_name(rs.getString("user_name"));
				return userInfo;
			} else {
				throw new LoginFailException("아이디 혹은 비밀번호가 틀렸습니다.", userInfo);
			}
		} finally {
			if (rs != null) try {rs.close();} catch(Exception e) {}
			if (st != null) try {st.close();} catch(Exception e) {}
			if (cn != null) try {cn.close();} catch(Exception e) {}	
			}
		}
		
	}
