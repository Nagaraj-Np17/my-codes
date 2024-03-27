package com.zsgs.interviewpanel.login;
import java.util.Scanner;

import com.zsgs.interviewpanel.InterviewPannel;
import com.zsgs.interviewpanel.receptionistsetup.ReceptionistView;

	public class LoginView {
	    private LoginModel loginModel;

	    public LoginView(){
	        loginModel = new LoginModel(this);
	    }

	    public void init(){
	        System.out.println(InterviewPannel.getInstance().getAppName() + "\nversion :"
	                + InterviewPannel.getInstance().getAppVersion() );
	        proceedLogin();
	    }

	    public void onLoginFailed(String txt){
	        System.out.println(txt);
	        checkLogin();;

	    }

	    private void checkLogin(){
	        System.out.println("Do yoou try again? \nType Yes/No");
	        Scanner scanner = new Scanner(System.in);
	        String choice = scanner.nextLine();
	        if(choice.equalsIgnoreCase("yes")){
	            proceedLogin();
	        }else if(choice.equalsIgnoreCase("no")){
	            System.out.println("\n ----- Thank You -----");
	        }else{
	            System.out.println("\nInvalid choice, Please enter valid choice. \n");
	            checkLogin();
	        }
	    }

	    public void onLoginSuccess(){
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("your logined");
	        updateAdminPassword();
	        new ReceptionistView().init();
	    }
	    private void proceedLogin(){
	        loginModel.addAdmin();
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the user name :");
	        String userName = scanner.nextLine();
	        System.out.println("Enter the password :");
	        String passWord = scanner.nextLine();
	        loginModel.validateUser(userName, passWord);
	    }
	    
	    private void updateAdminPassword()
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the new password :");
	        String passWord = scanner.nextLine();
	        loginModel.updateAdmin(passWord);
	    }

		public void showMessage(String string) {
			System.out.println(string);
			
		}

	}

