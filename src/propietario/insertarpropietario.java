/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propietario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertarpropietario {
    private Connection connection;

    public insertarpropietario(Connection connection) {
        this.connection = connection;
    }

    public void insertar(String nombre, String telefono, String direccion) {
        String query = "INSERT INTO propietarios (nombre, telefono, direccion) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, nombre);
            stmt.setString(2, telefono);
            stmt.setString(3, direccion);
            int filasAfectadas = stmt.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("✅ Propietario insertado correctamente.");
            } else {
                System.out.println("⚠ No se pudo insertar el propietario.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
