package PizzaStores;

import java.util.ArrayList;

public abstract class Pizzas implements Rankable {
  private int id;
  private String name;
  private String adress;
  private int numberOfEmployees;
  private ArrayList<Employees> employees;
  private int phoneNumber;
  private int rank;

    public Pizzas(int id, String name, String adress, int numberOfEmployees, ArrayList<Employees> employees, int phoneNumber, int rank) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.numberOfEmployees = numberOfEmployees;
        this.employees = employees;
        this.phoneNumber = phoneNumber;
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public ArrayList<Employees> getEmployees() {
        return employees;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getRank() {
        return rank;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setEmployees(ArrayList<Employees> employees) {
        this.employees = employees;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Integer calculateEmployeeExpenses(){
        Integer totalEmployeeSalary = 0;
        for(Employees employee : this.employees){
            totalEmployeeSalary += employee.getSalary();
        }
        return totalEmployeeSalary;
    }
    public void hireEmployee(Employees employee){
        if(!this.employees.contains(employee)){
            this.employees.add(employee);
        }
    }

    public void fireEmployee(Employees employee){
        if(this.employees.contains(employee)){
            this.employees.remove(employee);
        }
    }

    public abstract Integer calculateRank();
}
