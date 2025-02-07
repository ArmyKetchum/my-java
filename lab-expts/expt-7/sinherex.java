class student{
    String name;
    int rollno;
    student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Rollno: "+rollno);
    }
    class marks extends student{
        int m1,m2,m3;
        marks(String name, int rollno, int m1, int m2, int m3){
            super(name, rollno);
            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
        }
        int calctotal(){
            return m1+m2+m3;
        }
        double calcavg(){
            return calctotal()/3.0;
        }
        void dismarks(){
            System.out.println("Marks= "+m1+" "+m2+" "+m3);
            System.out.println("Total= "+calctotal());
            System.out.println("Average= "+calcavg());
        }
    }
}
public class sinherex {
    public static void main(String[] args) {
        marks s1 = new marks("Ameer", 029, 90, 80, 70);
        s1.display();
        s1.dismarks();
    }
    
}
