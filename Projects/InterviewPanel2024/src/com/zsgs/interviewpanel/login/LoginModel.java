package com.zsgs.interviewpanel.login;

import com.zsgs.interviewpanel.datalayer.InterviewPannelDatabase;
import com.zsgs.interviewpanel.model.Admin;

public class LoginModel {
	    private LoginView loginView;

	    LoginModel(LoginView loginView){
	        this.loginView = loginView;
	    }

	    public void validateUser(String userName, String password){
	        if(isValidUserName(userName)){
	            if(isValidPassword(password)){
	                loginView.onLoginSuccess();
	            }else{
	                loginView.onLoginFailed("Invalid password");
	            }
	        }else{
	            loginView.onLoginFailed("Invalid User Name");
	        }
	    }

	    private boolean isValidUserName(String userName){
	        return userName.equals(InterviewPannelDatabase.getInstance().getAdmin().getName());
	    }

	    private boolean isValidPassword(String password){
	        return password.equals(InterviewPannelDatabase.getInstance().getAdmin().getPassword());
	    }

	    public void addAdmin(){
	        InterviewPannelDatabase.getInstance().addAdmin(new Admin("naga", "raj", "9751590041", "naga@gmail.com", "sedapatti"));
	    }
	    
	    public void updateAdmin(String password) {
	    	Admin admin = InterviewPannelDatabase.getInstance().getAdmin();
	    	admin.setPassword(password);
	    	InterviewPannelDatabase.getInstance().addAdmin(admin);
	    	loginView.showMessage("Admin password updated successfully");
	    }


}
