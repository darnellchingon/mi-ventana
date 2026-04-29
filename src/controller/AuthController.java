package controller;
import view.AuthView;


public class AuthController {
	
	
	private AuthView vista;
	
	
	
	public AuthController() {
		
		vista = new AuthView();
		
		
	}
	
	public void login() {
		
	 vista.dasclogin();	
	 
	}
	
	
}
