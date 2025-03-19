/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class main {
    public static void main(String[] args) {
        
        insertarmascota insertar = new insertarmascota();
        insertar.insertar("Firulais", "Perro", 5);

       
        consultarmascota consultar = new consultarmascota();
        consultar.consultar();
    }
}
