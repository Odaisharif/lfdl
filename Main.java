package PizzaStores;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Employees firstEmployee = new Employees(1, "ibrahim", "jerusalem", 200, "11/2", 12,
                "13/2", null);
        Employees secondEmployee = new Employees(2, "alex", "california", 300, "11/2", 12,
                "16/2", null);
        Employees thirdEmployee = new Employees(3, "fares", "holon", 400, "11/2", 12,
                "17/2", null);
        Employees fourthEmployee = new Employees(4, "lilo", "natanya", 400, "11/2", 12,
                "20/2", null);

        Employees fifthEmployee = new Employees(4, "david", "tel-aviv", 400, "29/2", 18,
                "5/2", null);

        ArrayList<Employees> dominoseEmployees = new ArrayList<>();
        ArrayList<Employees> pizzaHutEmployees = new ArrayList<>();
        dominoseEmployees.add(firstEmployee);
        dominoseEmployees.add(secondEmployee);
        pizzaHutEmployees.add(thirdEmployee);
        pizzaHutEmployees.add(fourthEmployee);


        PizzaHut hutPizza = new PizzaHut(33, "Pizza Hutt", "Natanya", 2, pizzaHutEmployees,
                999, 4);

        PizzaDominos dominosPizza = new PizzaDominos(12, "Dominos pizza", "jerusalem", 122,
                dominoseEmployees, 123, 5);

        //==============================================================================================================
        //chaking everything--->:

//        System.out.println(hutPizza.getName());
//        hutPizza.fireEmployee(thirdEmployee);
//        hutPizza.fireEmployee(fourthEmployee);
//        hutPizza.hireEmployee(fifthEmployee);
        hutPizza.hutPrint();

//        System.out.println(hutPizza.calculateEmployeeExpenses());
        System.out.println("*****************************");
//        dominosPizza.dominosPrint();
//        System.out.println(dominosPizza.getName());
//        System.out.println(dominosPizza.calculateEmployeeExpenses());

    }



    }

