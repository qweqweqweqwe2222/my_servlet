package org.mike.service;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 23.07.13
 * Time: 17:02
 * To change this template use File | Settings | File Templates.
 */
public class LoginService {
    public boolean authenticate(String userId, String password) {
        if(password == null || password.trim() == "") {
            return false;
        }

        return true;
    }
}
