/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Modelo.Pais;
import Modelo.ListaPais;


/**
 *
 * @author Lab05pc15
 */
public class TestPais {
    public static void main(String[] args){
    
        Pais pais1 = new Pais("colombia", 200, 300, 400);
        Pais pais2 = new Pais("España", 500, 366, 700);
        Pais pais3 = new Pais("colombia", 1000, 5600, 900);
        Pais pais4 = new Pais("colombia", 1000, 3890, 2890);
        
        ListaPais myLista = new ListaPais();
        
        myLista.insertar(pais1);
        myLista.insertar(pais2);
        myLista.insertar(pais3);
        myLista.insertar(pais4);
        
        System.out.print("EL LISTADO DE PAISES ES: " + myLista.toString());
        System.out.print("EL getListado SERA: " + myLista.getListado(900));
    }
}
