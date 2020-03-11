import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.*;
import java.awt.EventQueue.*;
import javax.swing.JTable.*;
import java.awt.event.*;
import javax.swing.RowFilter;
public class BasicJTable extends JFrame implements ActionListener {
   private Object[][] data;
   private String[] columnNames = {"Title","Author","Publisher"};
   private DefaultTableModel tableModel;
   private JTable table;
   private SimpleBookList myList;
   TextField search = new TextField();
    
   public BasicJTable(String title) {
      super(title);
      setBounds(800,100,500,600);
      
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myList = new SimpleBookList();
      myList.readFromCSV("D:\\Java Project Data\\books.csv");
      data = myList.convert2Data();
      tableModel = new DefaultTableModel(data, columnNames);
      table = new JTable(tableModel);
      table.setAutoCreateRowSorter(true);
      JScrollPane scrollPane = new JScrollPane(table);
      scrollPane.setPreferredSize(new Dimension(480,480));
      JPanel panel = new JPanel();
      panel.add(scrollPane);
      add(panel,BorderLayout.CENTER);
   }
   

    /**
     *
     * @param ae
     */
    @Override
   public void actionPerformed(ActionEvent ae) {
          
   }
   public static void main(String[] args) {
           new BasicJTable("Book Database").setVisible(true);
   }
}