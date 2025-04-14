import java.sql.*;

public class DodawanieDanych {

    public static void dodajZamowienie(Connection conn) {
        String sql = "INSERT INTO Zamowienie (NrZamowienia, Klient, Koszt, CentrumId) VALUES (?, ?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "ZAM-003");
            pstmt.setString(2, "Nowy Klient Sp. z o.o.");
            pstmt.setBigDecimal(3, new java.math.BigDecimal("9999.99"));
            pstmt.setInt(4, 1); // Zakładamy, że CentrumId=1 istnieje

            int rows = pstmt.executeUpdate();
            System.out.println("✅ Dodano nowe zamówienie! Wiersze: " + rows);
        } catch (SQLException e) {
            System.err.println("❌ Błąd podczas dodawania zamówienia: " + e.getMessage());
        }
    }

    public static void wyswietlTabele(Connection conn, String nazwaTabeli) {
        String sql = "SELECT * FROM " + nazwaTabeli;

        try (
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)
        ) {
            ResultSetMetaData meta = rs.getMetaData();
            int kolumny = meta.getColumnCount();

            System.out.println("📋 Wyniki z tabeli: " + nazwaTabeli);
            System.out.println("------------------------------------------");

            // Wypisz nagłówki kolumn
            for (int i = 1; i <= kolumny; i++) {
                System.out.print(meta.getColumnName(i) + "\t");
            }
            System.out.println();

            // Wypisz wiersze
            while (rs.next()) {
                for (int i = 1; i <= kolumny; i++) {
                    System.out.print(rs.getString(i) + "\t");
                }
                System.out.println();
            }

        } catch (SQLException e) {
            System.err.println("❌ Błąd podczas SELECT z tabeli '" + nazwaTabeli + "': " + e.getMessage());
        }
    }
}
