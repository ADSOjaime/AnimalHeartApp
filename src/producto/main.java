/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package producto;

import database.Conexion;
import java.sql.Connection;

public class main {
    public static void main(String[] args) {
        try (Connection conn = Conexion.conectar()) {
            insertarproducto insertar = new insertarproducto(conn);
            insertar.insertar("Croquetas", 15000, 20);
        } catch (Exception e) {
            System.out.println("Error en la conexión: " + e.getMessage());
        }
    }
}
