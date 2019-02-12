/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Dao.PizzaManager;
import Model.Pizza;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author Nutcha
 */
@Named(value = "pizzaController")
@RequestScoped
public class PizzaController {

   @Inject
   PizzaManager pm;
   
   private String name;
   private Double price;
   private String Description;
   private List<Pizza> allPizzas;
   
    @PostConstruct
   public void fillArray(){
       this.allPizzas = pm.getAllPizzas();
   }
   
   
   public void submit(){
       Pizza p = new Pizza(name,price,Description);
       pm.addPizza(p);
       allPizzas = pm.getAllPizzas();
   }
  
   
    public PizzaController() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public List<Pizza> getAllPizzas() {
        return allPizzas;
    }

    public void setAllPizzas(List<Pizza> allPizzas) {
        this.allPizzas = allPizzas;
    }

    
    
    
}
