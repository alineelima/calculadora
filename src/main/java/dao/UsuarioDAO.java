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
        System.out.flush();
        
        try {
            System.out.println("Entou no create User");
            // inicia uma transação com o banco de dados
            System.out.println("begin");
            em.getTransaction().begin();
            // salva os dados do usuário
            System.out.println("persist");
            em.persist(user);
            // finalizando a transação
            System.out.println("commit");
            em.getTransaction().commit();
            
        } catch (final HibernateException e) {
            System.out.println("EU DISSE ALINE LIMA DE PAULA");
            System.err.println(e);
            System.out.println("VIU LININHA");
        } finally {
            em.close();
            emf.close();
        }
    }
}