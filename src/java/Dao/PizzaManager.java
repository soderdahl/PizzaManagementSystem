/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Pizza;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Nutcha
 */
@Stateless
public class PizzaManager {

   @PersistenceContext
   EntityManager em;
   
   public void addPizza(Pizza p){
       em.persist(p);
   }
   
   public List<Pizza> getAllPizzas(){
    Query q = em.createQuery("SELECT p FROM Pizza p");
    return q.getResultList();
   }
}
