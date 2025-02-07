class Student {
    String name;
    int age;
    int rollNo;
    String course;

    Student(String name, int age, int rollNo, String course) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.course = course;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class ExamResult extends Student {
    int m1, m2, m3;

    ExamResult(String name, int age, int rollNo, String course, int m1, int m2, int m3) {
        super(name, age, rollNo, course);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    int calctotal() {
        return m1 + m2 + m3;
    }

    double calcavg() {
        return calctotal() / 3.0;
    }

    void display() {
        super.display();
        System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total Marks: " + calctotal());
        System.out.println("Average Marks: " + calcavg());
    }
}

public class MulLevInher {
    public static void main(String[] args) {
        ExamResult result = new ExamResult("John Doe", 20, 101, "Computer Science", 85, 90, 88);
        result.display();
    }
}