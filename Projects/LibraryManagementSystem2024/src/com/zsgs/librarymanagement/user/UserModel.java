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
	public void getAllUserInfo() {
		List<User>userList=LibraryDatabase.getInstance().getAllUserData();
		if(userList!=null) {
			for(User user:userList) {
				userView.showAlert(userList);
			}
				
		}
		else {
			userView.showAlert("No user Data,Add User");
		}
	}
	public void getRemoveUser(int userId) {
		String removeUserName=LibraryDatabase.getInstance().removeUserData(userId);
		if(removeUserName.length()>0) {
			userView.showAlert("User "+removeUserName+" Removed SucessFully");
		}
		else {
			userView.showAlert("User Not Found");
		}
	}
	
	
	
	
	
}
