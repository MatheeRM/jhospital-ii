/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jhospital.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author admin
 */
public class ConexaoJPA {
    
    public static EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.
                createEntityManagerFactory("JHospitalPU");
        EntityManager em = emf.createEntityManager();
        return em;
    }
    
}
