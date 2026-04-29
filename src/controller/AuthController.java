package controller;

import model.AuthModel;
import view.AuthView;

import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthController implements ActionListener {

    private final AuthView vista;
    private final AuthModel modelo;

    public AuthController() {
        modelo = new AuthModel();
        vista = new AuthView();
        vista.addLoginListener(this);
        vista.addRegisterListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnAcceder) {
            String username = vista.getUsername();
            String password = vista.getPassword();

            if (modelo.authenticate(username, password)) {
                vista.showMessage("Login exitoso", true);
            } else {
                vista.showMessage("Usuario o contraseña incorrectos", false);
            }
        } else if (e.getSource() == vista.btnRegistrar) {
            String username = vista.getUsername();
            String password = vista.getPassword();
            String confirmPassword = vista.getConfirmPassword();

            if (modelo.register(username, password, confirmPassword)) {
                vista.showMessage("Registro exitoso", true);
                vista.dasclogin(); // Volver a login
            } else {
                vista.showMessage("Error en registro: contraseñas no coinciden", false);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AuthController::new);
    }
}
