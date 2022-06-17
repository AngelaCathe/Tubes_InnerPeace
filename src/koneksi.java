
import com.mysql.cj.jdbc.Driver;
import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class koneksi {
    private static Connection koneksi;
    public static Connection GetConnection()throws SQLException {
        if (koneksi==null){
            new Driver();
            koneksi =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/laporan_tubes","root","");
        }
        return koneksi;
    }
}
