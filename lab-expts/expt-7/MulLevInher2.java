interface Sports{
    void play();
}
interface Academics{
    void study();
}
class student implements Sports, Academics{
    String name;
    int age;
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void play(){
        System.out.println(name+" is playing football");
    }
    public void study(){
        System.out.println(name+" is studying Computer Science");
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
} 
public class MulLevInher2 {
    public static void main(String[] args) {
        student s = new student("Ameer", 17);
        s.display();
        s.play();
        s.study();
    }
}
