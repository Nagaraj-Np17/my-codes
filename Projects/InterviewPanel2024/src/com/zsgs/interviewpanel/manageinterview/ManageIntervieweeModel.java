package com.zsgs.interviewpanel.manageinterview;

import com.zsgs.interviewpanel.datalayer.InterviewPannelDatabase;
import com.zsgs.interviewpanel.model.Interviewee;
import com.zsgs.interviewpanel.validation.RegexValidate;

public class ManageIntervieweeModel {
	    private ManageIntervieweeView manageIntervieweeView;
	    public ManageIntervieweeModel(ManageIntervieweeView manageIntervieweeView){
	        this.manageIntervieweeView = manageIntervieweeView;
	    }


	    public void addInterviewee(Interviewee interviewee){
	        if(InterviewPannelDatabase.getInstance().insertInterviewees(interviewee)){
	            manageIntervieweeView.onIntervieweeAdded(interviewee);
	        }else{
	            manageIntervieweeView.onIntervieweeExist(interviewee);
	        }
	    }
   
	    // below code is for validation

	    public boolean isValidateName(String name){
	        return RegexValidate.getInstance().isValidateName(name);
	    }

	    public boolean isValidatePassword(String password){
	        return RegexValidate.getInstance().isValidatePassword(password);
	    }

	    public boolean isValidatePhoneNumber(String phoneNumber){
	        return RegexValidate.getInstance().isValidatePhoneNumber(phoneNumber);
	    }

	    public boolean isValidateEmailId(String email){
	        return RegexValidate.getInstance().isValidateEmailId(email);
	    }

	    public boolean isValidateAddress(String address){
	        return RegexValidate.getInstance().isValidateAddress(address);
	    }
}
