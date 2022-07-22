package Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import config.Conexion;

public class CoffeePersistence {

    private Conexion conexion;

    public CoffeePersistence(Conexion conexion) {
        this.conexion = conexion;
    }

    public void getCofees() {
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Connection conn = conexion.getConnect();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM coffee_shops";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.print(rs.getString(2) + "\n");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}

