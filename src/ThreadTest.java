import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class ThreadTest {
    public static void main(String[] args) throws IOException {
        Date date = new Date();

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\User\\Desktop\\test.txt");

        int i;

        while ((i = fileInputStream.read()) != -1){
            System.out.print((char) i);
        }

        Date date1 = new Date();

        System.out.println((date1.getTime() - date.getTime()));
    }
}
