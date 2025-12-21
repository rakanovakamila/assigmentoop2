package Human;

public class Human {
    private String name;
    private int age;
    private boolean isAdult;
    public Human(String name, int age){
        this.name = name;
        this.age = age;
        this.isAdult = age >= 18;
    }
    public void getInfo(){
        System.out.println("Name: " + name + ", Age: " + age + ", Adult: " + isAdult);
    }
    public String sayYourPosition(){
        return "I am a human";
    }
    public String getName(){return this.name;}
    public void setName(String name){this.name = name;}
    public int getAge(){return this.age;}
    public void setAge(int age) {
        this.age = age;
        this.isAdult = age >= 18; // обновляем при изменении возраста
    }

    public boolean isAdult() { return isAdult; }
}
