package com.liftapp;

import com.liftapp.homepage.HomePage;

public class LiftSystemApplication {
	private String appName;
	private double version;

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	HomePage hm = new HomePage();
	private static LiftSystemApplication liftSystemApplication;

	private LiftSystemApplication() {

	}

	public static LiftSystemApplication getInstance() {
		if (liftSystemApplication == null) {
			liftSystemApplication = new LiftSystemApplication();
		}
		return liftSystemApplication;
	}

	private void start() {
		hm.init();

	}

	public static void main(String[] args) {
		getInstance().start();

	}

}
