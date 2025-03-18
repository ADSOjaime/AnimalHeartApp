/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main; // Asegúrate de que el paquete sea correcto

import model.MascotaDAO; // Importa MascotaDAO

public class Main {
    public static void main(String[] args) {
        MascotaDAO dao = new MascotaDAO();
        dao.insertarMascota("Firulais", "Perro", 5);
        dao.listarMascotas();
    }
}
