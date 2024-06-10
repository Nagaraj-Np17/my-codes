package com.connections;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class Constants {
	public static boolean loginOrNot() {
		Map<String, Object> session = ActionContext.getContext().getSession();
		if (session.get("username") == null) {
			return false;
		}
		return true;
	}
}
