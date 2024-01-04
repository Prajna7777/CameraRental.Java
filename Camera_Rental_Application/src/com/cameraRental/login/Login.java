package com.cameraRental.login;

import java.util.Scanner;

public class Login extends Menu {
    Scanner sc = new Scanner(System.in);

    public void userLogin() {
        while (true) {
            System.out.println("+-----------------------------------+");
            System.out.println("| WELCOME TO CAMERA RENTAL APP      |");
            System.out.println("+-----------------------------------+");
            System.out.println("PLEASE LOGIN TO CONTINUE");
            System.out.print("USERNAME: ");
            String userid = sc.nextLine();
            System.out.print("PASSWORD: ");
            String password = sc.nextLine();

            if (userid.equals("Prajna") && password.equals("Admin@1234")) {
                System.out.println("Login successfully.");
                menuDisplay();
            } else {
                System.out.println("You entered wrong userid and password. Please enter correct id-password ");
            }
        }
    }
}
