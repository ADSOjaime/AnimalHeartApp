/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propietario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class consultarpropietario {
    private Connection connection;

    public consultarpropietario(Connection connection) {
        this.connection = connection;
    }

    public void consultar() {
        String query = "SELECT * FROM propietarios";

        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("📋 Lista de Propietarios:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");

                System.out.println("ID: " + id + " | Nombre: " + nombre + " | Teléfono: " + telefono + " | Dirección: " + direccion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
