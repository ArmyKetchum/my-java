public class student {
    int id;
    String name;

    student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }  

    public static void main(String[] args) {
        student s1 = new student(101, "Rama");
        student s2 = new student(102, "Sita");
        s1.display();
        s2.display();
    }
}