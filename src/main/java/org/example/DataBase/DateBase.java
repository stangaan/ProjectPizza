package org.example.DataBase;

import java.sql.Connection;

public class DateBase {
    private  final String url;
    private final String user;
    private final String password;

    public DateBase(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    @Override
    public String toString() {
        return "DateBase{" +
                "url='" + url + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
