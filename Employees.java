package PizzaStores;

import java.time.chrono.ChronoLocalDate;

public class Employees {
   private int id;
   private String fullName;
   private String adress;
   private int salary;
   private String startDate;
   private int pizzaRank;
   private String pizzaRankDate;
   private String pizzasSurpries;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getPizzaRank() {
        return pizzaRank;
    }

    public void setPizzaRank() {
        this.pizzaRank = pizzaRank;
    }

    public ChronoLocalDate getPizzaRankDate() {
        return getPizzaRankDate();
    }

    public void setPizzaRankDate(String pizzaRankDate) {
        this.pizzaRankDate = pizzaRankDate;
    }

    public String getPizzasSurpries() {
        return pizzasSurpries;
    }

    public void setPizzasSurpries(String pizzasSurpries) {
        this.pizzasSurpries = pizzasSurpries;
    }

    public Employees(int id, String fullName, String adress, int salary, String startDate, int pizzaRank, String pizzaRankDate, String pizzasSurpries) {
        this.id = id;
        this.fullName = fullName;
        this.adress = adress;
        this.salary = salary;
        this.startDate = startDate;
        this.pizzaRank = pizzaRank;
        this.pizzaRankDate = pizzaRankDate;
        this.pizzasSurpries = pizzasSurpries;


    }
}
