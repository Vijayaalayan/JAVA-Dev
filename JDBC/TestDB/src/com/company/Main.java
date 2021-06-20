package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
	    try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\JAVA-Dev\\JDBC\\TestDB\\testdb.db");
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts(name TEXT,phone INTEGER ,email TEXT)");
//            statement.execute("INSERT into contacts(name,phone,email) values ('Vijay',1234,'vijay@gmail.com')");
//            statement.execute("INSERT into contacts(name,phone,email) values ('Naveen',2341,'naveen@gmail.com')");
//            statement.execute("INSERT into contacts(name,phone,email) values ('Nithin',3412,'nithin@gmail.com')");
            statement.execute("UPDATE contacts set name='Kili' where name='Vijay'");
            statement.close();
            conn.close();
        }catch (SQLException e){
            System.out.println("Something went wrong "+e.getMessage());
        }
    }
}
