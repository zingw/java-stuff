package org.example;


public class Teacher extends Human{

    private int age;
    private String name;

    public Teacher(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Teacher() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void jump() {
        System.out.println("Teacher jump");
    }


    @Override
    public void speak(){
        System.out.println("Teacher speak");
    }

    @Override
    public void run() {
        System.out.println("Teacher run !");
    }
}
