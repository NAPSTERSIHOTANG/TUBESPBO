/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.DbConnection;
import java.sql.Connection; 
import java.sql.ResultSet; 
import java.sql.Statement; 
import java.util.ArrayList; 
import java.util.List;
import model.*;
public class EmployeeDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertCostumer(Customer c){
         con = dbCon.makeConnection();       
         String sql;
     
            sql = "INSERT INTO customer(id, nama, ktp, no_telepon)" + 
                        "VALUES ('"+ c.getId() +"', '"+ c.getNama() +"', '"+ c.getKtp() +"','"+ c.getNo_telpon() +"')";
         
                    try{
                       Statement statement = con.createStatement(); 
                       int result = statement.executeUpdate(sql); //executeUpdate digunakna untuk insert,update,delete dengan mengembalikan tipe data yang berbeda
                       System.out.println("Added " + result + " Costumer"); 

                       statement.close(); 

                  }catch(Exception e){
                          System.out.println("Error adding Costumer...");
                          System.out.println(e);
                  }
                     //dalam tanda kurung tersebut menggunakan ' karena merupakan bagian dari string, jika value seperti tidak perlu membungkusnya dengan '
        
        System.out.println("Adding Costumer ... ");
          

        dbCon.closeConnection();
    }
}
