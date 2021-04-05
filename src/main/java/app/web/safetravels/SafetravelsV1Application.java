package app.web.safetravels;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import model.User;

@SpringBootApplication
public class SafetravelsV1Application {

	public static void main(String[] args) {
		SpringApplication.run(SafetravelsV1Application.class, args);
		//Configuramos el EMF a través de la unidad de persistencia
				
		/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("safetravels");

				//Generamos un EntityManager
				EntityManager em = emf.createEntityManager();

				//Iniciamos una transacción
				em.getTransaction().begin();

				// Construimos un objeto de tipo User
				User user1 = new User();
				user1.setName("Suso");
				user1.setEmail("suso@susomail.com");
				
				user1.setBirthDate(Date.valueOf("1982, 9, 18"));

				// Construimos otro objeto de tipo User
				User user2 = new User();
				user2.setName("Juan");
				user2.setBirthDate(Date.valueOf("1990, 5, 20"));
				
				//Persistimos los objetos
				em.persist(user1);
				em.persist(user2);

				//Commiteamos la transacción
				em.getTransaction().commit();
				
				//Cerramos el EntityManager
				em.close();*/
		
	}
}
