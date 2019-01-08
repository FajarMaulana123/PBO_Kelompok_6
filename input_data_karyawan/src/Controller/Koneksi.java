/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kel6
 */
public class Koneksi {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        //cek apakah koneksi null
        if(koneksi==null){
            try{
                 DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                 koneksi =(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/data_karyawan", "root", "");
               
   
            }catch (SQLException t){
                JOptionPane.showMessageDialog(null,"Error Membuat Koneksi");
            }
            
            
        }
        return koneksi;
    }
    static Object getConnection(){
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
