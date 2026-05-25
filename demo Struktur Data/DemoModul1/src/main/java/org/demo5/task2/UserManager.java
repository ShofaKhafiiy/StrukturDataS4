package org.demo5.task2;

import java.io.Console;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UserManager {

    // Username -> Password
    private HashMap<String, String> users =
            new HashMap<>();

    // Username -> [FullName, Address]
    private HashMap<String, ArrayList<String>> userDetails =
            new HashMap<>();

    // Session login
    private String loggedInUser = null;



    // =====================================
    // REGISTER
    // =====================================

    public void register(Scanner input) {

        System.out.print("Username: ");
        String username = input.nextLine();

        Console console = System.console();

        String password;

        if (console != null) {

            char[] passwordArray =
                    console.readPassword("Password: ");

            password = new String(passwordArray);

        } else {

            System.out.print("Password: ");
            password = input.nextLine();
        }

        System.out.print("Full Name: ");
        String fullName = input.nextLine();

        System.out.print("Address: ");
        String address = input.nextLine();



        // VALIDASI USERNAME SUDAH ADA
        if (users.containsKey(username)) {

            System.out.println(
                    "\nRegistration Failed!"
            );

            System.out.println(
                    "Username already exists!"
            );

            return;
        }



        // VALIDASI HARUS ADA @
        if (!username.contains("@")) {

            System.out.println(
                    "\nRegistration Failed!"
            );

            System.out.println(
                    "Username must contain '@'"
            );

            return;
        }



        // VALIDASI PASSWORD
        if (password.length() < 8) {

            System.out.println(
                    "\nRegistration Failed!"
            );

            System.out.println(
                    "Password minimum 8 characters!"
            );

            return;
        }



        // SIMPAN USER
        users.put(username, password);



        // SIMPAN DETAIL USER
        ArrayList<String> details =
                new ArrayList<>();

        details.add(fullName);
        details.add(address);

        userDetails.put(username, details);



        System.out.println(
                "\nRegistration Successful!"
        );
    }



    // =====================================
    // LOGIN
    // =====================================

    public void login(Scanner input) {

        System.out.print("Username: ");
        String username = input.nextLine();

        System.out.print("Password: ");
        String password = input.nextLine();



        // VALIDASI LOGIN
        if (users.containsKey(username)
                &&
                users.get(username).equals(password)) {

            loggedInUser = username;

            ArrayList<String> details =
                    userDetails.get(username);

            System.out.println(
                    "\nLogin Successful!"
            );

            System.out.println(
                    "Welcome, "
                            + details.get(0)
                            + " ("
                            + details.get(1)
                            + ")"
            );

        } else {

            System.out.println(
                    "\nLogin Failed!"
            );
        }
    }



    // =====================================
    // LOGOUT
    // =====================================

    public void logout() {

        loggedInUser = null;

        System.out.println(
                "\nLogout Successful!"
        );
    }



    // =====================================
    // CHECK LOGIN
    // =====================================

    public boolean isLoggedIn() {

        return loggedInUser != null;
    }



    // =====================================
    // GET FULL NAME
    // =====================================

    public String getLoggedInFullName() {

        if (loggedInUser == null) {

            return "";
        }

        return userDetails
                .get(loggedInUser)
                .get(0);
    }
}