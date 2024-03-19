package com.zsgs.librarymanagement.user;

import java.util.List;

import com.zsgs.librarymanagement.datalayer.LibraryDatabase;
import com.zsgs.librarymanagement.model.User;

public class UserModel {
private static UserView userView;
	public UserModel(UserView userView) {
		this.userView=userView;
	}
	public  void addUser(User user) {
		if (LibraryDatabase.getInstance().insertUser(user)) {
			userView.onUserAdded(user);
		} else {
			userView.onUserExits(user);
		}
		
	}
	public List<User> getAllUserInfo() {
		List<User>userList=LibraryDatabase.getInstance().getAllUserData();
		return userList;
	}
	
	
	
	
	
}
