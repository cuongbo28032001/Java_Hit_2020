package docghifile;

import java.io.*;

public class RunMain {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("CuongDZ.txt", false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            for(int i=0; i<3; i++)
            {
                printWriter.println("i = " + i);
            }

            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
