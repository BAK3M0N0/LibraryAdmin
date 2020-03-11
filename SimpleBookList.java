import java.util.ArrayList;
import java.io.*; //File,FileReader,FileNotFoundException,BufferedReader,IOException
public class SimpleBookList {
private ArrayList<SimpleBook> bookList;
public SimpleBookList() {
      bookList = new ArrayList<SimpleBook>();
}
public void add(SimpleBook sb) {
      bookList.add(sb);
}
public void readFromCSV(String filename) {
      File file = new File(filename);
      FileReader reader = null;
      try {
         reader = new FileReader(file);
      }
      catch (FileNotFoundException e) {
         e.printStackTrace();
         System.exit(1);
      }
      BufferedReader infile = new BufferedReader(reader);
      String line = "";
      try {
         boolean done = false;
         while (!done) {
            line = infile.readLine();
            if (line == null) {
               done = true;
            }
            else {
               String[] tokens = line.trim().split(",");
               String title = tokens[0].trim();
               String author = tokens[1].trim();
               String pub = tokens[2].trim();
               SimpleBook sb = new SimpleBook(title,author,pub);
               bookList.add(sb);
            }
         }
      }
      catch (IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
}
public Object[][] convert2Data() {
       Object[][] data = new Object[bookList.size()][3];
       for (int i = 0; i < bookList.size(); i++) {
          data[i][0] = bookList.get(i).getTitle();
          data[i][1] = bookList.get(i).getAuthor();
          data[i][2] = bookList.get(i).getPub();
       }
       return data;
   }
}