package com.sandbox.ultimate;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.sandbox.ultimate.model.IdCard;
import com.sandbox.ultimate.model.Person;
import com.sandbox.ultimate.model.Phone;

/**
 * Hello world!
 *
 */
public class App {

    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main( String[] args ) {
        new App().go();
    }

    private void go() {
        EntityManagerFactory factory = null;
        EntityManager entityManager = null;

        try {
             factory = Persistence.createEntityManagerFactory("PU");
             entityManager = factory.createEntityManager();

            EntityTransaction transaction = entityManager.getTransaction();

            try {
                transaction.begin();
                persistPerson(entityManager);
                transaction.commit();
                System.out.println("1 =====================");
                getPersonByAge(entityManager, 39);
                System.out.println("2 =====================");
                getChildren(entityManager);
            } catch (Exception e) {
                if(transaction.isActive()) {
                    transaction.rollback();
                }
                throw e;
            }
        }
        catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
            e.printStackTrace();
        }
        finally {
            if(entityManager != null) {
                entityManager.close();
            }

            if(factory != null) {
                factory.close();
            }
        }
    }

    private void getChildren(EntityManager entityManager) {
        TypedQuery<Person> query = entityManager.createQuery("SELECT distinct children FROM Person p INNER JOIN p.children children WHERE p.parent is not null", Person.class);
        List<Person> people = query.getResultList();
        people.forEach(System.out::println);
    }

    private void getPersonByAge(EntityManager entityManager, int age) {
        TypedQuery<Person> query = entityManager.createQuery("SELECT p FROM Person p WHERE p.age >= :age", Person.class);
        query.setParameter("age", age);
        List<Person> people = query.getResultList();
        people.forEach(System.out::println);

    }

    private void persistPerson(EntityManager entityManager) {
        Person p = new Person();
        p.setName("Ricardo");
        p.setAge(39);

        IdCard idCard = new IdCard();
        idCard.setIdNumber("11208985AZ");
        idCard.setTimestamp(new Date(Instant.now().toEpochMilli()));

        p.setIdCard(idCard);

        Phone phone = new Phone();
        phone.setNumber("969223474");
        phone.setPerson(p);

        p.addPhone(phone);

        List<Person> children = new ArrayList<>(2);
        Person ines = new Person();
        ines.setName("Inês");
        ines.setAge(3);
        ines.setParent(p);

        Person carolina = new Person();
        carolina.setName("Carolina");
        carolina.setAge(7);
        carolina.setParent(p);

        children.add(ines);
        children.add(carolina);
        p.setChildren(children);

        entityManager.persist(ines);
        entityManager.persist(carolina);
        entityManager.persist(p);
    }
}
