
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private Connection koneksi;

    public static void main(String[] args) {
        Connection conn = new Koneksi().Connect();
    }

    public Connection Connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Koneksi Driver Berhasil");
        } catch (ClassNotFoundException e) {
            System.out.println("Koneksi Driver Gagal " + e);
        }

        String url = "jdbc:mysql://localhost:3306/db_laundry";
        try {
            koneksi = DriverManager.getConnection(url, "root", "");
            System.out.println("Koneksi database berhasil");
        } catch (SQLException e) {
            System.out.println("Koneksi database gagal "+e);
        }

        return koneksi;
    }
}
