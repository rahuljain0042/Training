package Tutorial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
public class CSVReader {
 
    public static final String delimiter = ",";
 
    public static void read(String csvFile) {
        try {
            File file = new File(csvFile);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
 
            String line = "";
 
            String[] tempArr;
            while ((line = br.readLine()) != null) {
                tempArr = line.split(delimiter);
                for (String tempStr : tempArr) {
                    System.out.print(tempStr + " ");
                }
                System.out.println();
            }
            br.close();
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
 
    }
 
    public static void main(String[] args) {
        // csv file to read
        String csvFile = "C:/Users/Training/Rahul/Bootcamp/airport_list.csv";
        CSVReader.read(csvFile);
    }
 
}

