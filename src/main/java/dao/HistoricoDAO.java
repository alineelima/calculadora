package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Historico;

public class HistoricoDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
    EntityManager em = emf.createEntityManager();
    
    public void saveHistory(Historico historico) {
        System.out.println("Entrou no createUser");
        
        em.getTransaction().begin();
        em.persist(historico);
        em.getTransaction().commit();
        em.close();
        emf.close();

        System.out.println("fim historico dao");
    }
    
}