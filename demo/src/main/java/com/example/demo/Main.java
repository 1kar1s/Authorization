package com.example.demo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {

    public static void main(String[] argv) {

        System.out.println("-------- MySQL JDBC Connection Testing ------------");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Где ваш драйвер JDBC для MySQL?");
            e.printStackTrace();
            return;
        }

        System.out.println("Зарегистрирован драйвер MySQL JDBC!");
        Connection connection = null;

        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://127.0.0.1/ikaris", "root", "12345");

        } catch (SQLException e) {
            System.out.println("Ошибка соединения! Проверить выходную консоль");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("Вы сделали это, теперь управляйте своей базой данных!");
        } else {
            System.out.println("Не удалось установить соединение!");
        }
    }
}
