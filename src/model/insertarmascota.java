/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import database.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertarmascota {
    public void insertar(String nombre, String especie, int edad) {
        String sql = "INSERT INTO mascotas (nombre, especie, edad) VALUES (?, ?, ?)";

        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombre);
            stmt.setString(2, especie);
            stmt.setInt(3, edad);

            int filas = stmt.executeUpdate();
            System.out.println("✅ Mascota insertada correctamente (" + filas + " fila(s) afectada(s)).");

        } catch (SQLException e) {
            System.out.println("❌ Error al insertar: " + e.getMessage());
        }
    }
}
