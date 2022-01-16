package com.company;

public class LoginFactory {
    //Create a Login Factory to generate object of concrete class based on given information.
    public static Login getLogin(String login_options) {
        if (login_options == null) {
            return null;
        } else if (login_options.equalsIgnoreCase("1")) {
            Patient instance = Patient.getPatientInstance();
            instance.setId(123);
            instance.setPassword(123);
            return instance;
        } else if (login_options.equalsIgnoreCase("2")) {
            return new Doctor(21, 123);
        }
        return null;
    }
}
