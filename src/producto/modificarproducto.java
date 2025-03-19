/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class modificarproducto {
    private Connection connection;

    public modificarproducto(Connection connection) {
        this.connection = connection;
    }

    public void modificar(int id, String nombre, double precio, int cantidad) {
        String query = "UPDATE productos SET nombre = ?, precio = ?, cantidad = ? WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, nombre);
            stmt.setDouble(2, precio);
            stmt.setInt(3, cantidad);
            stmt.setInt(4, id);

            int filasAfectadas = stmt.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("✅ Producto actualizado correctamente.");
            } else {
                System.out.println("⚠ No se encontró el producto con ID: " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
