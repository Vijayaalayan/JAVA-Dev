package com.company;

import java.sql.*;

public class Main {
    public static final String DB = "testdb.db";
    public static final String CONNECTION_STRING ="jdbc:sqlite:D:\\JAVA-Dev\\JDBC\\TestDB\\"+DB;
    public static final String TABLE_CONTACTS = "contacts";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";
    public static void main(String[] args) {
	    try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING);
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            statement.execute("DROP TABLE IF EXISTS "+TABLE_CONTACTS);
            statement.execute("CREATE TABLE IF NOT EXISTS "+TABLE_CONTACTS+
                            "("+COLUMN_NAME+" TEXT,"+
                                COLUMN_PHONE+" INTEGER ,"+
                                COLUMN_EMAIL+" TEXT"
                            +")");
            insertContact(statement,"Vijay",1234,"vijay@gmail.com");
            insertContact(statement,"Naveen",2341,"naveen@gmail.com");
            insertContact(statement,"Nithin",3412,"nithin@gmail.com");


//            statement.execute("INSERT into contacts(name,phone,email) values ('Vijay',1234,'vijay@gmail.com')");
//            statement.execute("INSERT into contacts(name,phone,email) values ('Naveen',2341,'naveen@gmail.com')");
//            statement.execute("INSERT into contacts(name,phone,email) values ('Nithin',3412,'nithin@gmail.com')");
//            statement.execute("UPDATE contacts set name='Kili' where name='Vijay'");
//            statement.execute("DELETE FROM contacts where name='Kili'");
//            statement.execute("SELECT * from contacts");
//            ResultSet resultSet = statement.getResultSet();
            ResultSet resultSet = statement.executeQuery("SELECT * from "+TABLE_CONTACTS);
            while (resultSet.next()){
                System.out.println(resultSet.getString(COLUMN_NAME)+" "+
                                    resultSet.getInt(COLUMN_PHONE)+" "+
                                    resultSet.getString(COLUMN_EMAIL));
            }
            statement.close();
            conn.close();
        }catch (SQLException e){
            System.out.println("Something went wrong "+e.getMessage());
        }
    }
    public static void insertContact(Statement statement,String name,int phone,String email) throws SQLException{
        statement.execute("INSERT INTO "+TABLE_CONTACTS+
                        "("+COLUMN_NAME+", "+
                            COLUMN_PHONE+", "+
                            COLUMN_EMAIL+
                        ") "+
                        "VALUES('"+name+"', '"+phone+"', '"+email+"')");
    }
}
