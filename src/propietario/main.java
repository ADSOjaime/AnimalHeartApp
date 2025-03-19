/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propietario;

import database.Conexion;
import java.sql.Connection;

public class main {
    public static void main(String[] args) {
        try (Connection conn = Conexion.conectar()) {
            
            insertarpropietario insertar = new insertarpropietario(conn);
            insertar.insertar("Juan Pérez", "1234567890", "juan@example.com");

            
            consultarpropietario consultar = new consultarpropietario(conn);
            consultar.consultar();

            
            modificarpropietario modificar = new modificarpropietario(conn);
            modificar.modificar(1, "Juan Gómez", "0987654321", "gomez@example.com");

            
            consultar.consultar();

           
            eliminarpropietario eliminar = new eliminarpropietario(conn);
            eliminar.eliminar(1);

            
            consultar.consultar();

        } catch (Exception e) {
            System.out.println("❌ Error en la conexión: " + e.getMessage());
        }
    }
}
