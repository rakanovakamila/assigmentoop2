package Human;

public class Employee extends Human implements Iwork, Istudy{
    private String jobName;
    private float monthlyIncome;
    private static int totalEmployees = 0;
    public  Employee(String name, int age, String jobName, float monthlyIncome){
        super(name, age);
        this.jobName = jobName;
        this.monthlyIncome = monthlyIncome;
        totalEmployees++;
    }
    @Override
    public void tellSomething() {
        System.out.println(name + " :What do you think abt my salary? " + monthlyIncome);
    }
    @Override
    public void takeBreak(){ System.out.println(name + " is taking a break,because tired from being " + jobName);}
    @Override
    public void sayYourMood() { System.out.println("I'm happy(no) to work as " + jobName);}
    @Override
    public void haveAssignments() {System.out.println(name + " has work projects");}
    @Override
    public void favoriteCourse(String courseName) {System.out.println(name + "'s favorite course for job: " + courseName);}
    @Override
    public String sayYourPosition() {
        return "I am an employee";
    }
    public void work() {
        System.out.println(name + " is working as " + jobName);
    }

    public String getJobName(){return jobName;}
    public void setPosition(String position){this.jobName = jobName;}
    public float getMonthlyIncome(){return monthlyIncome;}
    public void setMonthlyIncome(float monthlyIncome){this.monthlyIncome = monthlyIncome;}
    public static int getTotalEmployees(){return totalEmployees;}
}
