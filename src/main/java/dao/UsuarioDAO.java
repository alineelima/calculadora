package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.HibernateException;
import model.Usuario;

public class UsuarioDAO {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("calculadora");
    EntityManager em = emf.createEntityManager();
    
    public void createUser(Usuario user) {
        System.out.println("Entrou no createUser");
        
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
        emf.close();

        System.out.println("fim usuario dao");
    }

    public boolean findUserByEmail(String email, String password){
        em.getTransaction().begin();
        Usuario user = em.find(Usuario.class, email);
        System.out.println(user.getNome());
        em.close();
        emf.close();
        return true;
    }
}