

package co.com.poli.credito.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JPAFactory {
    
    private static final EntityManagerFactory FACTORY;
    private static final String UP = "APPCreditosPU";  //este es el nombre de la unidad de persistencia

    static {
        FACTORY = Persistence.createEntityManagerFactory(UP);
    }

    public static EntityManagerFactory getFACTORY() {
        return FACTORY;
    }    
}
