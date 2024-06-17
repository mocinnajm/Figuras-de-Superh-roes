/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figurasdesuperheroes;

import ClasesFiguras.*;


/**
 *
 * @author mosin
 */
public class Principal {

    public static void main(String[] args) {
        Superheroe sup1 = new Superheroe("Spiderman");
        //metodos set
        sup1.setNombre("Nombre araña");
        sup1.setDescripcion("Lanza tela de araña y viste de rojo");
        
         // metdos get
         System.out.println(sup1.getNombre());
         System.out.println(sup1.getDescripcion());
         System.out.println(sup1);
         
         Superheroe sup2 = new Superheroe("Batman");
         sup2.setCapa(true);
         sup2.setDescripcion("Tiene los poderes de un murcielago");
         System.out.println(sup2.toString());
         
         Dimension dimpeq = new Dimension();
         Dimension dimGra = new Dimension (70,20,20);
         dimpeq.setAlto(20);
         dimpeq.setAncho(40);
         dimpeq.setProfundidad(5);
         System.out.println(dimpeq);
         System.out.println(dimGra);
         System.out.println("Volumen de dimencion pequeña:"+dimpeq.getVolumen());
         Figura figspi= new Figura("spid001", 30, sup2, dimpeq);
         System.out.println(figspi.toString());
         figspi.subirprecio(10);
         System.out.println(figspi.toString());
         Coleccion col = new Coleccion(" coleccion super");
         col.añadirFIgura(figspi);
         Figura figbat = new Figura("bat-002", 60, sup2, dimpeq);
         
         col.añadirFIgura(figbat);
           Superheroe sup3 = new Superheroe("Ironman");
           sup3.setDescripcion("Superhoroe con traje de metal y capaz de volar");
          Figura figIron = new Figura("iron-03", 70, sup3, new Dimension(6,3,4));
          col.añadirFIgura(figIron);
          System.out.println(col);
          System.out.println(col.conCapa());
          Figura fmasValiosa=col.masValiosa();
          System.out.println("Figura de mas valor:"+fmasValiosa);
          System.out.println("Valor de la coleccion:"+col.getValorColeccion()+ " euros");
          System.out.println("volumen de la coleccion:" + col.getVolumenColeccion() + " metros cubicos");
          
    } 
    
       
}
