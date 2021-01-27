
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Principal {

    
    public static void crearArchivo(String nombre){
        
        try( /* TO DO ... */ ){

            Scanner sc = new Scanner(System.in);
            String s;    

            System.out.println("escriba [q]+[intro] para salir");
            
            /* 
               TO DO 
               ...
            */   
            
        }catch(Exception ex){
            System.out.println("EXCEPCIÓN");
            System.out.println(ex.toString());
        }       
    }

    public static void mostrarArchivo(String nombre){
        
        String s;

        try( BufferedReader f = BufferedReader f = new BufferedReader( /* TO DO ... */ ) ){
            
            /* 
               TO DO 
               ...
            */   
            
        }catch(Exception ex){
            System.out.println("EXCEPCIÓN");
            System.out.println(ex.toString());
        }       
    }    
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Introduzca el nombre de archivo que desea crear:");       
        String n = sc.nextLine();
        
        crearArchivo(n);

        System.out.println("\n\nContenido del archivo creado:");       

        mostrarArchivo(n);

    }
    
}
