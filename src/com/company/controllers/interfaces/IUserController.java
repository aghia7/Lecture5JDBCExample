package com.company.controllers.interfaces;

public interface IUserController {
    String createUser(String name, String surname, String gender);
    String getUser(int id);
    String getAllUsers();
}
