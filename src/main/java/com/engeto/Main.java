package com.engeto;

import java.sql.*;

import static java.time.chrono.JapaneseEra.values;


public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/flowershop", "olda", "mypassword");

        Statement statement = connection.createStatement();
        int resultSet;
        ///VYTVOŘ KVĚTINY
        //resultSet = statement.executeUpdate(
        //        "insert into flowers(name,color,description,poisonous) values ('zlaty dest','zluta','krovina',false)");

        /// VLOŽ KOPRETINU BLEDULI
        //resultSet = statement.executeUpdate(
        //        "insert into flowers(name) values ('kopretina')");

        ///DOPLŇ ÚDAJE
        //resultSet = statement.executeUpdate(
        //        "update flowers " +
        //        "set description =  'Pozor na cibulku - obsahuje největší koncentraci jedu!',poisonous = true where name = 'bledule'");

        /// VYMAŽ NEJEDOVATÉ
        //resultSet = statement.executeUpdate("delete from flowers where poisonous = false");


        /// VYPIŠ TABULKU
//        ResultSet resultSet1 = statement.executeQuery("select * from flowers");
//
//        while   (resultSet1.next()) {
//            System.out.print(resultSet1.getString("name") + " ");
//            System.out.print(resultSet1.getString("color") + " ");
//            System.out.print(resultSet1.getString("description") + " ");
//            System.out.println(resultSet1.getBoolean("poisonous"));

    }
}
