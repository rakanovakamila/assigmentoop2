package Human;

public class Student extends Human{
    private String university;
    private float gpa;
    public Student(String name, int age, String university, float gpa){
        super(name, age);
        this.university = university;
        this.gpa = gpa;
    }
    @Override
    public String sayYourPosition() {
        return "I am a student";
    }
    public void study() {
        System.out.println(getName() + " is studying at " + university);
    }
    public String getUniversity(){return university;}
    public void setUniversity(String university){this.university = university;}
    public float getGpa(){return gpa;}
    public void setGpa(float gpa){this.gpa = gpa;}
}
