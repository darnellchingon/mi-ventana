package model;

public class AuthModel {

    public boolean authenticate(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        return username.equals("admin") && password.equals("1234");
    }

    public boolean register(String username, String password, String confirmPassword) {
        if (username == null || password == null || confirmPassword == null) {
            return false;
        }
        if (!password.equals(confirmPassword)) {
            return false;
        }
        return true;
    }
}package model;

public class AuthModel {

    public boolean authenticate(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
   
        return username.equals("admin") && password.equals("1234");
    }

    public boolean register(String username, String password, String confirmPassword) {
        if (username == null || password == null || confirmPassword == null) {
            return false;
        }
        if (!password.equals(confirmPassword)) {
            return false;
        }
       
        return true;
    }
}