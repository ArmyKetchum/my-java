import java.io.FileWriter;
import java.io.IOException;
public class cmdfile {
    public static void main(String[] args) throws IOException {
    String data=args[0];
        try {
            FileWriter output=new FileWriter("output.txt");
            output.write(data);
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
