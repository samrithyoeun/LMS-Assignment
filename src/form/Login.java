package form;

import component.*;

import javax.swing.*;
import java.awt.*;


public class Login {
	
	public static int attemp = 0;
	public static final int MAX_ATTEMP=3;
	public static String username = "";
	public static String password ="";
	
	@SuppressWarnings("deprecation")
	
	public static void login(){
		
		Mainscreen mainscreen = new Mainscreen();
        int IMAGE_WIDTH = 375;
        Color txtColor = new Color(29, 221,222);
        Color btnColor= new Color(255, 32, 66);
        int adjust =-15;

        JFrame login = new JFrame();
        login.setSize(750, 390);
        login.setLayout(null);
        login.setLocationRelativeTo(null);
        login.setTitle("LOGIN FORM WITH "+MAX_ATTEMP+ " ATTTEMP(S) --> BY SAMRITH YOEUN");
        login.setResizable(false);

        ImageIcon forLogIn = new ImageIcon("src/picture/setPassword.png");
        MLabel lblImage = new MLabel(0, 0, IMAGE_WIDTH, IMAGE_WIDTH, forLogIn);


        MLabel lblTitle = new MLabel(IMAGE_WIDTH + 50, 50, IMAGE_WIDTH - 50 * 2, 50, "Login-Form!");
        lblTitle.setFont(new Font("Consolas", Font.BOLD, 40));
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);

        MLabel lblUsername = new MLabel(IMAGE_WIDTH + 65, 120, IMAGE_WIDTH - 50 * 2, 30, "username");
        MTextField txtUsername = new MTextField(IMAGE_WIDTH + 50, 150, IMAGE_WIDTH - 50 * 2, 40);
        

        MPasswordField pswPassword = new MPasswordField(IMAGE_WIDTH + 50, 240, IMAGE_WIDTH - 50 * 2, 40);
        MLabel lblPassword = new MLabel(IMAGE_WIDTH + 65, 210, IMAGE_WIDTH - 50 * 2, 30, "password");


        MButton btnSignIn = new MButton(IMAGE_WIDTH + 200, 300, 125, 40, "Sign In");

        btnSignIn.addActionListener(e -> {
        	if(txtUsername.getText().equals(username) && pswPassword.getText().equals(password)){
        		mainscreen.show();
        		login.dispose();
        	
        		
        	}
        	else {
        		attemp++;
        		JOptionPane.showMessageDialog(login,"Invalid Username or Password ===> "+ (MAX_ATTEMP-attemp) +" Attemp(s) left" );
        	}
        	if(attemp==(MAX_ATTEMP)) System.exit(0);
        });

        login.add(lblImage);
        login.add(lblTitle);
        login.add(txtUsername);
        login.add(pswPassword);
        login.add(lblUsername);
        login.add(lblPassword);
        login.add(btnSignIn);
        login.setVisible(true);

    }

public static void main(String arg[]){
	new Login().login();
}
    
}
