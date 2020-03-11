import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;


public class BookSearch {

public static void main(String[] args)
{
}

public String Bookfind(String x){
    String csvFile = "D:\\Java Project Data\\books\\books.csv";
    int count=1;
    String bookname="";
    try {
         File file = new File(csvFile);
         FileReader fr = new FileReader(file);
         BufferedReader br = new BufferedReader(fr);
         String line = "";
         String[] tempArr;
         while((line = br.readLine()) != null) {
             if(count==Integer.parseInt(x)){
                tempArr = line.split(",");
                for(String tempStr : tempArr) {
                   bookname+=tempStr + "\n ";
                }
                break;
             }
             count++;
         }
         br.close();
         } catch(IOException ioe) {
            ioe.printStackTrace();
         }
    return bookname;
}

public String Studfind(String x){
    String csvFile = "D:\\Java Project Data\\us-500.csv";
    int count=1;
    String bookname="";
    try {
         File file = new File(csvFile);
         FileReader fr = new FileReader(file);
         BufferedReader br = new BufferedReader(fr);
         String line = "";
         String[] tempArr;
         while((line = br.readLine()) != null) {
             if(count==Integer.parseInt(x)){
                tempArr = line.split(",");
                for(String tempStr : tempArr) {
                   bookname+=tempStr + "\n ";
                }
                break;
             }
             count++;
         }
         br.close();
         } catch(IOException ioe) {
            ioe.printStackTrace();
         }
    return bookname;
}
}