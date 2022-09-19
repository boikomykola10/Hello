import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String args[] ) throws IOException {
        FileWriter fw = new FileWriter("file.txt");
        String text = "Nick";
        fw.write(text);
        fw.close();

        FileReader fr = new FileReader("file.txt");
        Scanner scan = new Scanner(fr);
        System.out.println(scan.nextLine());
        fr.close();
        }
    }

