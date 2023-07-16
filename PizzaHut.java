package PizzaStores;

import java.time.LocalDate;
import java.util.ArrayList;

public class PizzaHut extends Pizzas{


    public PizzaHut(int id, String name, String adress, int numberOfEmployees, ArrayList<Employees> employees, int phoneNumber, int rank) {
        super(id, name, adress, numberOfEmployees, employees, phoneNumber, rank);
    }

    public void hutPrint() {
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
        if (super.getNumberOfEmployees() > 0) {
            Integer totalEmployeeRank = 0;
            Integer averageRank = 0;
            for (Employees employee : super.getEmployees()) {
                totalEmployeeRank += employee.getPizzaRank();
            }
            averageRank = totalEmployeeRank / super.getNumberOfEmployees();
            return averageRank;

        } else {
            return 0;
        }
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
