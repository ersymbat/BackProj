package org.example;

public class Student {

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
        private int age;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void displayInfo(Student student) {
            System.out.println("Student: " + student.getName() + ", Age: " + student.getAge());
        }


}
