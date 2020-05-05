package pl.kfrak;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    static void close(){
        if(sessionFactory != null){
            sessionFactory.close();
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    private static SessionFactory buildSessionFactory(){
        final StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder()
                .configure() //ustawienia z resources/hibernate.cfg.xml
                .build();
        try {
            return new MetadataSources(standardServiceRegistry)
                    .buildMetadata()
                    .buildSessionFactory();
        } catch (Exception e) {
            StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
            throw e;
        }
    }

    private HibernateUtil() {
    }

}
