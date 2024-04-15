/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.Pais;
import java.util.ArrayList;


/**
 *
 * @author Lab05pc15
 */
public class ListaPais {
    private ArrayList<Pais> myArray = new ArrayList<>();
    Pais pais = new Pais();
    public ListaPais() {
    }

    public ArrayList getMyArray() {
        return myArray;
    }

    public void setMyArray(ArrayList myArray) {
        this.myArray = myArray;
    }
    
    public void insertar(){
    this.myArray.add(pais);
        
    }

    @Override
    public String toString() {
        return "ListaPais{" + "myArray=" + myArray + '}';
    }
    
    public String getListado(int limite){
       
       
    return null;
    }
    
    
}
