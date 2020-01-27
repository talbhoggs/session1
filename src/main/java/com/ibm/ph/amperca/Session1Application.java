package com.ibm.ph.amperca;

import com.ibm.ph.amperca.controller.UserController;

public class Session1Application {

	public static void main(String[] args) {
		UserController controller = new UserController();
		controller.getUsers().forEach(user -> System.out.println(user.getId() + " " + user.getName()));
	}

}
