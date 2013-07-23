package org.mike;

import org.mike.service.LoginService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Mike
 * Date: 23.07.13
 * Time: 16:51
 * To change this template use File | Settings | File Templates.
 */
@javax.servlet.annotation.WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userId, password;

        userId = req.getParameter("userId");
        password = req.getParameter("password");

        LoginService loginService = new LoginService();
        boolean result = loginService.authenticate(userId, password);

        if (result) {
            resp.sendRedirect("success.jsp");
        } else {
            resp.sendRedirect("login.jsp");
        }
    }
}
