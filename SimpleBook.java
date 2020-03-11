public class SimpleBook {
   private String title;
   private String author;
   private String publisher;
   public SimpleBook(String t, String a, String pub1) {
      title = t.trim();
      author = a.trim();
      publisher=pub1.trim();
   }
   public String getTitle() {
      return title;
   }
   public String getAuthor() {
      return author;
   }
   public String getPub(){
       return publisher;
   }
}