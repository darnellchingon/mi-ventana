package model;

import java.util.regex.Pattern;

public class AuthModel {

    public boolean authenticate(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        return username.equals("admin") && password.equals("1234");
    }

    public boolean register(String nombres, String apellidos, String empresa, String ambito, String cargo, String usuario, String correo, String password, String confirmPassword) {
        if (nombres == null || apellidos == null || empresa == null || ambito == null || cargo == null || usuario == null || correo == null || password == null || confirmPassword == null) {
            return false;
        }
        if (!password.equals(confirmPassword)) {
            return false;
        }
       
        if (!Pattern.matches("^[a-zA-Z\\s]+$", nombres)) return false; 
        if (!Pattern.matches("^[a-zA-Z\\s]+$", apellidos)) return false;
        if (!Pattern.matches("^[a-zA-Z0-9\\s]+$", empresa)) return false; 
        if (!Pattern.matches("^[a-zA-Z\\s]+$", cargo)) return false;
        if (!Pattern.matches("^[a-zA-Z0-9\\s]+$", usuario)) return false;
        if (!Pattern.matches("^[^\\s]+$", correo)) return false; 
        if (!Pattern.matches("^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]+$", password)) return false;
       
        return true;
    }
}
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