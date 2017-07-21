package com.rdhaese.commons.utils.test.database;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created on 19/07/2017.
 * <p>
 * Simple DAO that can be used for tests on the entity layer where no DAO is available.
 * Should be used together with CDI or Spring.
 *
 * @author Robin D'Haese
 */
public class TestDao {

    /**
     * The entity manager used in the DAO. Injected by CDI or Spring.
     */
    @PersistenceContext
    private EntityManager em;

    /**
     * Method to persist an object. The object also gets flushed.
     * The utilizing test method does not has to be @Transacional, but this one is.
     *
     * @param o Object to persist.
     */
    @Transactional
    public void persist(Object o) {
        em.persist(o);
        em.flush();
    }

    /**
     * Method to find an Object on it's primary key. You do not have to cast the object yourself, it is resolved using generics.
     * Test method must be @Transactional, or else you don't have a session and cannot create a lazy initialisation proxy
     *
     * @param clazz      of entity to find.
     * @param primaryKey of entity to find.
     * @param <T>        Type that should be returned
     * @return null if no entity found, or the entity, already casted to the correct type.
     * @throws ClassCastException if there is an inconsistensy between the return type and the given clazz.
     */
    @Transactional
    public <T> T find(Class clazz, Object primaryKey) {
        Object o = em.find(clazz, primaryKey);
        if (o == null) {
            return null;
        }
        return (T) o;
    }
}
