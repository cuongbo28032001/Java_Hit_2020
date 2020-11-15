package docghifile;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RunMain2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(Paths.get("CuongDZ.txt"));

            while (scanner.hasNext())
                System.out.println(scanner.nextLine());

            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
