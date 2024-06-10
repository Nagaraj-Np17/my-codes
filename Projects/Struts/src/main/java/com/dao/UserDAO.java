package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.mindrot.jbcrypt.BCrypt;

import com.connections.DBconnection;
import com.model.Users;

public class UserDAO {
	Connection connection = DBconnection.getInstance().getConnection();

	public boolean userValidation(String userName, String password) {
		String sql = "SELECT Password FROM User_Data WHERE Username = ? ";
		try {
			PreparedStatement pst = connection.prepareStatement(sql);

			pst.setString(1, userName);
			try (ResultSet rs = pst.executeQuery()) {
				if (rs.next()) {
					String pass = rs.getString("Password");
					return BCrypt.checkpw(password, pass);
				}

				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean addUser(String name, String email, String userName, String password) {
		if (userExists(userName, email)) {
			System.out.println("User exists with this email/username");
			return false;
		}
		String sql = "INSERT INTO User_Data (Name, Email, Username, Password) VALUES (?, ?, ?, ?)";
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, email);
			pst.setString(3, userName);
			String pass = BCrypt.hashpw(password, BCrypt.gensalt());
			pst.setString(4, pass);
			int rowsAffected = pst.executeUpdate();
			return rowsAffected > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	private boolean userExists(String userName, String email) {
		String sql = "SELECT COUNT(*) FROM User_Data WHERE Username = ? OR Email = ?";
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, userName);
			pst.setString(2, email);
			try (ResultSet rs = pst.executeQuery()) {
				if (rs.next()) {
					int count = rs.getInt(1);
					return count > 0;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	public Users getUserInfo(String userName) {
		Users userDTO = null;
		String sql = "SELECT * FROM User_Data WHERE Username = ?";
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, userName);
			try (ResultSet rs = pst.executeQuery()) {
				if (rs.next()) {
					userDTO = new Users();
					userDTO.setId(rs.getInt("Id"));
					userDTO.setName(rs.getString("Name"));
					userDTO.setEmail(rs.getString("Email"));
					userDTO.setUserName(rs.getString("UserName"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userDTO;

	}

}
