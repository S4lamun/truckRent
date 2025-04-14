import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=truckRent;encrypt=true;trustServerCertificate=true;";
        String user = "Pracownik1";
        String password = "Pracownik1";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Połączenie z MS SQL nawiązane!");


            DodawanieDanych.dodajZamowienie(conn);
            DodawanieDanych.wyswietlTabele(conn, "Zamowienie");





        } catch (SQLException e) {
            System.err.println("Błąd SQL: " + e.getMessage());
        }





    }


}