package academic;
public class marks {
    double y1,y2,y3;
    String yr;
    public marks(String y,double total1, double total2, double total3){
        yr=y;
        y1=total1;
        y2=total2;
        y3=total3;
    }
    public void display(){
        if(yr=="1styear"){
            System.out.println("The student has not completed"+yr);
        }
        else if(yr=="2ndyear"){
            System.out.println("The student has" +y1+ "% in 1st year");
        }
        else if(yr=="3rdyear"){
            System.out.println("The student has Aggregate Percentage of "+((y1+y2+y3)/3)+"% till 2nd year");
        }
        else if(yr=="completed"){
            System.out.println("The student has Aggregate Percentage of "+((y1+y2+y3)/3)+"% in Diploma");
        }
    }
}
