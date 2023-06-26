package org.example;
packege DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connectionWithTable = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "user","user");
            Statement statement = connectionWithTable.createStatement();
            statement.execute("insert into pizzas values (3,1)");
        System.out.println("Connection!");

    }


    }
