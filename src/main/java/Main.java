import com.calculator.ManagarCalculator;
import com.models.Manager;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        ManagarCalculator managerCalculator = new ManagarCalculator();

        Manager manager1 = new Manager();
        manager1.setName("mehdi");
        manager1.setNational_id("0022803343");
        manager1.setSalary(9800000L);

        Manager  manager2 = new Manager();
        manager2.setName("ali");
        manager2.setNational_id("002280254");
        manager2.setSalary(21000000L);

        Manager manager3 = new Manager();
        manager3.setName("mohsen");
        manager3.setNational_id("0022803344");
        manager3.setSalary(4500000L);


        managerCalculator.calculateSalary(manager1);
        managerCalculator.calculateSalary(manager2);
        managerCalculator.calculateSalary(manager3);
        managerCalculator.doTask();

        System.out.println(manager1.getSalary());
        System.out.println(manager2.getSalary());
        System.out.println(manager3.getSalary());

        List<Manager> manage = new ArrayList<>();
        manage.add(manager1);
        manage.add(manager2);
        manage.add(manager3);

        System.out.println(managerCalculator.calculateSalary(manage));


    }
}
