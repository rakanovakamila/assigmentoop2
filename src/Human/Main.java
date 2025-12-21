package Human;
import java.util.Scanner;
public class Main {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Human human = new Human("Farkhat", 19);
        System.out.println("What do we know about employee?");
        System.out.print("Name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Age: ");
        int employeeAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Job name: ");
        String job = scanner.nextLine();

        System.out.print("Monthly income: ");
        float income = scanner.nextFloat();
        scanner.nextLine();

        Employee employee = new Employee(employeeName, employeeAge, job, income);

        Student student = new Student("Amir", 18, "Astana IT University", 3.2f);
        System.out.println("\nCharacteristics: ");
        human.getInfo();
        employee.getInfo();
        student.getInfo();

        System.out.println("\nSay Your Position: ");
        System.out.println(human.sayYourPosition());
        System.out.println(employee.sayYourPosition());
        System.out.println(student.sayYourPosition());

        System.out.println("\nChanges(setters,getters): ");
        student.setGpa(3.3f);
        System.out.println(student.getName() + " improved his GPA: " + student.getGpa());

        System.out.println("\nWhat do they do? ");
        employee.work();
        student.study();

        System.out.println("\nTotal employees: " + Employee.getTotalEmployees());


    }
}
