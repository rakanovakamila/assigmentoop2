package Human;

public class Student extends Human implements Istudy{
    private final int studentBarcode;
    private String university;
    private float gpa;
    public Student(String name, int age, String university, float gpa, int studentBarcode){
        super(name, age);
        this.university = university;
        this.gpa = gpa;
        this.studentBarcode = studentBarcode;
    }

    @Override
    public void tellSomething() {
        System.out.println(name + " :What do you think abt my gpa? " + gpa);
    }
    public final void studentIDCard(){
        System.out.println("===============");
        System.out.println("Student: " + name);
        System.out.println("Barcode: " + studentBarcode);
        System.out.println("University: " + university);
        System.out.println("STUDENT ID CARD");
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
    public int getStudentBarcode() {return studentBarcode;}

    @Override
    public void haveAssignments() {
        System.out.println("I will do assignments at the " + university);
    }

    @Override
    public void favoriteCourse(String courseName) {
        System.out.println(name + "'s favorite course at " + university + "is" + courseName);
    }
}
