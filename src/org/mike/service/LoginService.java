package org.mike.service;

import org.mike.dto.User;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 23.07.13
 * Time: 17:02
 * To change this template use File | Settings | File Templates.
 */
public class LoginService {
    HashMap<String, String> users = new HashMap<String, String>();

    public LoginService() {
        users.put("mike", "True Mike");
        users.put("bush", "Joye Bush");
    }

    public boolean authenticate(String userId, String password) {
        if(password == null || password.trim() == "") {
            return false;
        }

        return true;
    }

    public User getUserDetails(String userId) {
        User user = new User();
        user.setUserName(users.get(userId));
        user.setUserId(userId);
        return user;
    }
}
