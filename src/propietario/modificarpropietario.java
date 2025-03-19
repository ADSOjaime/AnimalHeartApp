/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propietario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class modificarpropietario {
    private Connection connection;

    public modificarpropietario(Connection connection) {
        this.connection = connection;
    }

    public void modificar(int id, String nombre, String telefono, String direccion) {
        String query = "UPDATE propietarios SET nombre = ?, telefono = ?, direccion = ? WHERE id = ?";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, nombre);
            stmt.setString(2, telefono);
            stmt.setString(3, direccion);
            stmt.setInt(4, id);

            int filasAfectadas = stmt.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("✅ Propietario actualizado correctamente.");
            } else {
                System.out.println("⚠ No se encontró el propietario con ID: " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
