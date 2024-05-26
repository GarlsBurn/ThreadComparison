import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class ThreadOptmzTest {
    public static void main (String[] args) throws IOException {
        Date date = new Date();


        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\User\\Desktop\\test.txt");

        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);

        int i;

        while ((i = bufferedInputStream.read()) != -1){
            System.out.print((char) i);
        }

        Date date1 = new Date();
        System.out.println((date1.getTime() - date.getTime()));

    }
}
