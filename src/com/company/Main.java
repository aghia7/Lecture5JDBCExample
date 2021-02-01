package com.company;

import com.company.data.DB;
import com.company.data.interfaces.IDB;
import com.company.repositories.UserRepository;
import com.company.repositories.interfaces.IUserRepository;

public class Main {

    public static void main(String[] args) {
        IDB db = new DB();
        IUserRepository repo = new UserRepository(db);
        MyApplication app = new MyApplication(repo);
        app.start();
    }
}
