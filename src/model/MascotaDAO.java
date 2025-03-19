/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class MascotaDAO {
    private insertarmascota insertar;
    private consultarmascota consultar;
    private modificarmascota modificar;
    private eliminarmascota eliminar;

    public MascotaDAO() {
        this.insertar = new insertarmascota();
        this.consultar = new consultarmascota();
        this.modificar = new modificarmascota();
        this.eliminar = new eliminarmascota();
    }

    public void insertarMascota(String nombre, String especie, int edad) {
        insertar.insertar(nombre, especie, edad);
    }

    public void consultarMascotas() {
        consultar.consultar();
    }

    public void modificarMascota(int id, String nombre, String especie, int edad) {
        modificar.modificar(id, nombre, especie, edad);
    }

    public void eliminarMascota(int id) {
        eliminar.eliminar(id);
    }
}
