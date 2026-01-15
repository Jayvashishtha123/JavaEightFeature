package com.gevernova.javaeightfeature.UserRegistrationProblem;


public class Main {
    static void main(String[] args) {

        // Name validator
        UserValidator<String, Boolean> nameValidator =
                (name) -> name != null && name.matches("^[A-Z][a-z]{2,}$");

        // Email validator
        UserValidator<String, Boolean> emailValidator =
                (email) -> email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

        // Mobile validator
        UserValidator<String, Boolean> mobileValidator =
                (mobile) -> mobile.matches("[0-9]{10}");

        // Password validator
        UserValidator<String, Boolean> passwordValidator =
                (password) -> password.matches("(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=]).{8,}");

        // Sample user inputs
        String firstName = "Jay";
        String lastName = "Vashishtha";
        String email = "jayvashishtha@gmail.com";
        String mobile = "7838965411";
        String password = "Password@1";

        // Validation output
        System.out.println("First Name Valid : " + nameValidator.validate(firstName));
        System.out.println("Last Name Valid : " + nameValidator.validate(lastName));
        System.out.println("Email Valid : " + emailValidator.validate(email));
        System.out.println("Mobile Valid : " + mobileValidator.validate(mobile));
        System.out.println("Password Valid : " + passwordValidator.validate(password));
    }
}
