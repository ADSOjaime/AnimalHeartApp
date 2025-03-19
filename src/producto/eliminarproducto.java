/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package producto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class eliminarproducto {
    private Connection connection;

    public eliminarproducto(Connection connection) {
        this.connection = connection;
    }

    public void eliminar(int id) {
        String query = "DELETE FROM productos WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, id);

            int filasAfectadas = stmt.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("✅ Producto eliminado correctamente.");
            } else {
                System.out.println("⚠ No se encontró el producto con ID: " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
