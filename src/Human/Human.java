package Human;

public abstract class Human {
    protected String name;
    protected int age;
    protected boolean isAdult;
    public Human(String name, int age){
        this.name = name;
        this.age = age;
        this.isAdult = age >= 18;
    }
    public abstract void tellSomething();

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
