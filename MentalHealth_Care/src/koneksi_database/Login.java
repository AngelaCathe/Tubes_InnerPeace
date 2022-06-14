package koneksi_database;
import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Login {
    
    private static Connection koneksi_database;
    public static Connection GetConnection()throws SQLException{
        if (koneksi_database==null){
            new Driver();
            koneksi_database = DriverManager.getConnection("jdbc:mysql://localhost:3306/laporan_tubes","root","");
        }
        return koneksi_database;
    }

   

    
}
