
import java.util.Scanner;

/**
 *
 * @author paco
 */
public class Principal {

    private static DBManagerHibernate db;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        db = new DBManagerHibernate();
        Scanner sc = new Scanner(System.in);
        String s;
        
        do{
            
            System.out.println("Nuevo libro a insertar");
            
            models.Libro l = new models.Libro();
            
            System.out.println("Nombre: (intro para terminar)");
            s = sc.nextLine();
            
            if("".equals(s)) return;
            
            l.setNombre(s);           
            System.out.println("Autor:");
            l.setAutor(sc.nextLine());
            System.out.println("Categoria:");
            l.setCategoria(sc.nextLine());
            System.out.println("Año:");
            l.setAño(Integer.parseInt(sc.nextLine()));
            
            System.out.println("ISBN:");
            l.setISBN(sc.nextLine());
            
            l.setEstado("disponible");
            
            System.out.println("¿Desea insertarlo: "+l.toString()+" ? [s/n]");
            s = sc.nextLine();
            
            if("s".equals(s)) {
                db.añadirLibro(l);
                System.out.println("¡Libro añadido con éxito!");
            };
    
            db.mostrarListadoCompleto();
            
        }while(true);
            
         
        
        
        


    }
    
}
