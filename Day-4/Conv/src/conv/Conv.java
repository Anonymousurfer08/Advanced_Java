/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conv;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author kayas
 */
public class Conv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        EntityManager em;
        EntityManagerFactory emf;
        emf = Persistence.createEntityManagerFactory("ConvPU");
        em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        Employee ep = new Employee();
        ep.setId(7);
        ep.setName("Ravi");
        em.persist(ep);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
    }
    
}