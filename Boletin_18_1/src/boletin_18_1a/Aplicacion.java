/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_18_1a;

import boletin_18_1b.Persoal;

/**
 *
 * @author Gabriel
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Academica a1 = new Academica("Pepo",5,new Persoal(666111000,"correo@gmail.com"));
        System.out.println(a1.toString());
        
        Academica a2 = new Academica("Lara",7,new Persoal(123456789,"correo@hotmail.com"));
        System.out.println(a2.toString());
    }
    
}
