/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class consultarproducto {
    private Connection connection;

    public consultarproducto(Connection connection) {
        this.connection = connection;
    }

    public void consultar() {
        String query = "SELECT * FROM productos";

        try (PreparedStatement stmt = connection.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("📋 Lista de Productos:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                int cantidad = rs.getInt("cantidad");

                System.out.println("ID: " + id + " | Nombre: " + nombre + " | Precio: " + precio + " | Cantidad: " + cantidad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
