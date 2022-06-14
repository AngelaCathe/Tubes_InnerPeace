package koneksi_database;
import java.sql.DriverManager;
import java.sql.SQLException;
import  java.sql.Connection;


public class koneksi {
    
    private static Connection koneksi_database;
    public static Connection configDB()throws SQLException{ 
        try{
            String url = "jdbc:mysql://localhost:3306/laporan_tubes";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            koneksi_database = DriverManager.getConnection(url,user,pass);
            System.out.println("Koneksi Berhasil");
        }catch(SQLException e){
            System.out.println("Koneksi Gagal");
        }
        return koneksi_database;
    }
    
}
