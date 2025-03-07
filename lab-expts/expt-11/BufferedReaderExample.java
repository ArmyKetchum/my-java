import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        int phno;
        char data;
        float avg;
        double num;
        long lg;
        boolean x;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Reading integer data:");
        phno = Integer.parseInt(obj.readLine());
        System.out.println("Enter character data:");
        data = (char) obj.read();
        obj.readLine();
        System.out.println("Enter float data:");
        avg = Float.parseFloat(obj.readLine());
        System.out.println("Enter Double data:");
        num = Double.parseDouble(obj.readLine());
        System.out.println("Enter Long data");
        lg = Long.parseLong(obj.readLine());
        System.out.println("Enter boolean data:");
        x = Boolean.parseBoolean(obj.readLine());
        System.out.println("Integer Data: " + phno);
        System.out.println("Character Data: " + data);
        System.out.println("Float Data: " + avg);
        System.out.println("Double Data: " + num);
        System.out.println("Long Data: " + lg);
        System.out.println("Boolean Data: " + x);
    }
}