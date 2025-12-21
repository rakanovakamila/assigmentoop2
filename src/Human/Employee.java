package Human;

public class Employee extends Human{
    private String jobName;
    private  float monthlyIncome;
    private static int totalEmployees = 0;
    public  Employee(String name, int age, String position, float monthlyIncome){
        super(name, age);
        this.jobName = position;
        this.monthlyIncome = monthlyIncome;
        totalEmployees++;
    }
    @Override
    public String sayYourPosition() {
        return "I am an employee";
    }
    public void work() {
        System.out.println(getName() + " is working as " + jobName);
    }

    public String getJobName(){return jobName;}
    public void setPosition(String position){this.jobName = jobName;}
    public float getMonthlyIncome(){return monthlyIncome;}
    public void setMonthlyIncome(float monthlyIncome){this.monthlyIncome = monthlyIncome;}
    public static int getTotalEmployees(){return totalEmployees;}
}
