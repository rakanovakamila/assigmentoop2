package Human;
import java.util.Scanner;
public class Main {
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
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

        System.out.println("Polymorphism");

        Employee employee = new Employee(employeeName, employeeAge, job, income);
        Student student = new Student("Amir", 18, "Astana IT University", 3.2f, 251067);

        Human humanAsEmp = new Employee("Sana", 30, "Designer", 40000f);
        Human humanAsStud = new Student("Esmira", 19, "NU", 3.6f, 523015);

        Iwork worker = new Employee("El", 41, "Manager", 560000f);
        Istudy studentStudent = new Student("Pororo", 287, "KBTU", 3.1f, 251076);
        Istudy employeeStudent = new Employee("Erasyl", 26, "Doctor", 345000f);

        Human huHuman = new Student("Farkhat", 19, "Astana IT University", 3.4f, 256010);

        System.out.println("Characteristics: ");
        huHuman.getInfo();
        employee.getInfo();
        student.getInfo();

        System.out.println("Say Your Position: ");
        System.out.println(huHuman.sayYourPosition());
        System.out.println(employee.sayYourPosition());
        System.out.println(student.sayYourPosition());

        System.out.println("Changes(setters,getters): ");
        student.setGpa(3.3f);
        System.out.println(student.getName() + " improved his GPA: " + student.getGpa());

        System.out.println("What do they do? ");
        employee.work();
        student.study();

        System.out.println("Total employees: " + Employee.getTotalEmployees());

        System.out.println("8");

        employee.tellSomething();
        student.tellSomething();

        worker.takeBreak();
        worker.sayYourMood();

        studentStudent.haveAssignments();
        studentStudent.favoriteCourse("Sociology");
        employeeStudent.haveAssignments();
        employeeStudent.favoriteCourse("Psychology");

        student.studentIDCard();


    }
}
