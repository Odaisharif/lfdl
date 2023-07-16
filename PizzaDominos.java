package PizzaStores;

import java.time.LocalDate;
import java.util.ArrayList;

public class PizzaDominos extends Pizzas{

    public PizzaDominos(int id, String name, String adress, int numberOfEmployees, ArrayList<Employees> employees, int phoneNumber, int rank) {
        super(id, name, adress, numberOfEmployees, employees, phoneNumber, rank);
        super.setRank(calculateRank());

    }

//    @Override
//    public String getName() {
//        return super.getName();
//    }

    public void dominosPrint() {
            System.out.println("ID: " + this.getId());
            System.out.println("Name: " + this.getName());
            System.out.println("Address: " + this.getAdress());
            System.out.println("Number of Employees: " + this.getNumberOfEmployees());

            System.out.println("Employees:");
            ArrayList<Employees> employees = this.getEmployees();
            for (Employees employee : employees) {
                System.out.println("Employee ID: " + employee.getId());
                System.out.println("Employee Name: " + employee.getFullName());
                System.out.println("Employee adress: " + employee.getAdress());
                System.out.println("Employee salary: " + employee.getSalary());
                System.out.println("start date: " + employee.getStartDate());
                System.out.println("pizza rank: " + employee.getPizzaRank());
                System.out.println("pizza rank date: " + employee.getPizzaRankDate());
                System.out.println("surprise is: " + employee.getPizzasSurpries());



            }
            System.out.println("phone number is: " + this.getPhoneNumber() + " rank: " + this.getRank());
    }

    @Override
    public Integer calculateRank() {
        Integer totalEmployeeRank = 0;
        for(Employees employee : super.getEmployees()){
            totalEmployeeRank += employee.getPizzaRank();
        }
        return totalEmployeeRank;
    }

    @Override
    public Integer calculateRangedRank(Long range) {
        if(super.getNumberOfEmployees() > 0 ){
            LocalDate currentDate = LocalDate.now();
            LocalDate validateDate = currentDate.minusDays(range);

            for(Employees employee : super.getEmployees()){
                if(validateDate.isAfter(employee.getPizzaRankDate())){
                    employee.setPizzaRank();
                }
            }
            return calculateRank();
        } else {
            return 0;
        }
    }

    }




//    public void dominosStore() {
//        ArrayList<Employees> employees = this.getEmployees();
//        System.out.println("List of employees:");
//        for (Employees employee : employees) {
//            System.out.println("ID: " + employee.getId());
//            System.out.println("Name: " + employee.getFullName());
//            System.out.println("Salary: " + employee.getSalary());
//            System.out.println("--------------------------");
//        }




