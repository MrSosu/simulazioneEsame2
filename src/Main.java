import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Mario Gialli", 0.5f, 20);
        Employee employee2 = new Employee("Gianni Fannulloni", 0.2f, 30);
        Employee employee3 = new Employee("Giorgia Lavoroni", 0.85f, 40);

        List<Employee> list1 = new ArrayList<>();
        list1.add(employee1);
        list1.add(employee2);
        list1.add(employee3);

        Employee employee4 = new Employee("Alessio Antichi", 0.55f, 20);
        Employee employee5 = new Employee("Marianna Figlidelcapo", 0.3f, 2);
        Employee employee6 = new Employee("Gianluigi Figlidelcapo", 0.3f, 4);

        List<Employee> list2 = new ArrayList<>();
        list2.add(employee4);
        list2.add(employee5);
        list2.add(employee6);

        // c) Stampare a schermo tutti gli impiegati che potrebbero essere promossi
        for (Employee e : list1) {
            if (e.canApplyForPromotion()) {
                System.out.println(e.getName());
            }
        }
        for (Employee e : list2) {
            if (e.canApplyForPromotion()) {
                System.out.println(e.getName());
            }
        }

        System.out.println("------------------------------");

       //d) Stampare a schermo tutti gli impiegati che potrebbero essere declassati
        for (Employee e : list1) {
            if (e.canBeDemoted()) {
                System.out.println(e.getName());
            }
        }
        for (Employee e : list2) {
            if (e.canBeDemoted()) {
                System.out.println(e.getName());
            }
        }

        // e) Creare una lista di oggetti Employee unendo le due liste precedentemente create
        list1.addAll(list2);

        // f) Stampare il nome e l’efficiencyIndex di ogni persona
        for (Employee e : list1) {
            System.out.println(e.getName() + " : " + e.getEfficiencyIndex());
        }
    }

}
