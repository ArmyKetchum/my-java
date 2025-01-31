package admin;

public class details {
    String name,pin,caste;
    int year;
    double income;
    int scholar=3000,c_fee=600,n_fee=3800;
    public details(String sname,String sno,String cst,int yr,double inc){
        name=sname;
        pin=sno;
        caste=cst;
        year=yr;
        income=inc;
        System.out.println("Student Name: "+name"With pin: "+pin "Studying in year: "+year);
    }
    public void scholar(){
        if(income<=100000&&caste!="oc"){
            System.out.println("The student is eligible for scholarship");
            if(year=1)
    }
}
