package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
	    try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\JAVA-Dev\\JDBC\\TestDB\\testdb.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts(name TEXT,phone INTEGER ,email TEXT)");
            statement.close();
            conn.close();
        }catch (SQLException e){
            System.out.println("Something went wrong "+e.getMessage());
        }
    }
}
