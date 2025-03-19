/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertarproducto {
    private Connection connection;

    public insertarproducto(Connection connection) {
        this.connection = connection;
    }

    public void insertar(String nombre, double precio, int cantidad) {
        String query = "INSERT INTO productos (nombre, precio, cantidad) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, nombre);
            stmt.setDouble(2, precio);
            stmt.setInt(3, cantidad);
            int filasAfectadas = stmt.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("✅ Producto insertado correctamente.");
            } else {
                System.out.println("⚠ No se pudo insertar el producto.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
