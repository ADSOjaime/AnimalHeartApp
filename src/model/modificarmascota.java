/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import database.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class modificarmascota {
    public void modificar(int id, String nombre, String especie, int edad) {
        String sql = "UPDATE mascotas SET nombre = ?, especie = ?, edad = ? WHERE id = ?";

        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombre);
            stmt.setString(2, especie);
            stmt.setInt(3, edad);
            stmt.setInt(4, id);

            int filas = stmt.executeUpdate();
            if (filas > 0) {
                System.out.println("✅ Mascota modificada correctamente.");
            } else {
                System.out.println("⚠ No se encontró la mascota con ID: " + id);
            }

        } catch (SQLException e) {
            System.out.println("❌ Error al modificar: " + e.getMessage());
        }
    }
}
