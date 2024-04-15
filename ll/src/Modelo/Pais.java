/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Objects;

/**
 *
 * @author Lab05pc15
 */
public class Pais implements comparableTo<Pais> {

    private String nombre;
    private int cantidad_Mujeres;
    private int cantidad_Hombres;
    private int cantidad_Niños;

    public Pais() {
    }

    public Pais(String nombre, int cantidad_Mujeres, int cantidad_Hombres, int cantidad_Niños) {
        this.nombre = nombre;
        this.cantidad_Mujeres = cantidad_Mujeres;
        this.cantidad_Hombres = cantidad_Hombres;
        this.cantidad_Niños = cantidad_Niños;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad_Mujeres() {
        return cantidad_Mujeres;
    }

    public void setCantidad_Mujeres(int cantidad_Mujeres) {
        this.cantidad_Mujeres = cantidad_Mujeres;
    }

    public int getCantidad_Hombres() {
        return cantidad_Hombres;
    }

    public void setCantidad_Hombres(int cantidad_Hombres) {
        this.cantidad_Hombres = cantidad_Hombres;
    }

    public int getCantidad_Niños() {
        return cantidad_Niños;
    }

    public void setCantidad_Niños(int cantidad_Niños) {
        this.cantidad_Niños = cantidad_Niños;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nombre);
        hash = 79 * hash + this.cantidad_Mujeres;
        hash = 79 * hash + this.cantidad_Hombres;
        hash = 79 * hash + this.cantidad_Niños;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        float hashMio = this.getHash();
        float hashOtro = other.getHash();

        if (hashMio == hashOtro) {
            return true;
        }
        return false;

    }

    public int comparableTo() {
        int personasTotalesPais = this.cantidadTotal();
        int personasTotalesPais2 = this.cantidadTotal();
        int RestaPersonas = personasTotalesPais - personasTotalesPais2;

        if (RestaPersonas == 0) {
            return 0;
        } else if (RestaPersonas < 0) {
            return -1;

        }
        return 1;

    }

    public int cantidadTotal() {

        int resultado = this.cantidad_Hombres + this.cantidad_Mujeres + this.cantidad_Niños;
        return resultado;

    }

    public int getHash() {

        int primo = 31;

        int hashSolucion;

        hashSolucion = primo * this.cantidad_Hombres + this.cantidad_Mujeres * this.cantidad_Niños;

        return hashSolucion;

    }

}
