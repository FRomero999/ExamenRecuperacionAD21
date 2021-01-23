
package com.paco.examenrecuperaciondatos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author paco
 */
public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s;


        DBManager db = new DBManager();
        db.startConnection();
        
        do{
            
            System.out.println("\n[p]restar, [d]evolver o [s]alir");
            s = sc.nextLine();

            if("s".equals(s)) {
                db.endConnection();            
                return;
            }
           
            if("p".equals(s)){
                ArrayList<models.Libro> libros = db.listarPorEstado("disponible");

                System.out.println("Contenido disponible de la biblioteca para prestar");
                for (models.Libro l : libros) {
                    System.out.println(l);
                }
                
                System.out.println("Selecciona el id del libro para prestar");
                db.prestar(Integer.parseInt(sc.nextLine()));
                
            }else if("d".equals(s)){

                ArrayList<models.Libro> libros = db.listarPorEstado("prestado");

                System.out.println("Libros pendientes de devolver");
                for (models.Libro l : libros) {
                    System.out.println(l);
                }
                
                System.out.println("Selecciona el id del libro para devolver");
                db.devolver(Integer.parseInt(sc.nextLine()));
                
            }

        }while(true);
        
    }
    
}
