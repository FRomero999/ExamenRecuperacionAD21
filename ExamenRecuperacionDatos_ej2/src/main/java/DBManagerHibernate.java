
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DBManagerHibernate {
    
    private SessionFactory sessionFactory;
    private Session s;

    public DBManagerHibernate() {
        try {
            sessionFactory = /*   TO DO ... */ ;
        } catch (HibernateException ex) {
            System.err.println("Initial SessionFactory creation failed. " + ex);
            throw new ExceptionInInitializerError(ex);
        }

        s = sessionFactory.openSession();
        System.out.println("Conexión realizada con éxito.");        
    }

    
    public void mostrarListadoCompleto() {
        /* Muestra todos los libros por pantalla con System.out.println() */
        
        List result =  /* 
        
           TO DO 
           ...
           
        */    

    }

    public void añadirLibro(models.Libro l) {

        Transaction t = s.beginTransaction();
        /* 
           TO DO 
           ...
        */    
        
    }    
    
    public void endConnection() {
        s.close();
    }    
}
