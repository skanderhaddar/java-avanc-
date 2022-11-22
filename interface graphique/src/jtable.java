import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class jtable {
    // frame
    JFrame f;
    // Table
    JTable j;
 
    // Constructor
    jtable()
    {
        // Frame initialization
        f = new JFrame();
 
        // Frame Title
        f.setTitle("JTable Example");
 
        // Data to be displayed in the JTable
        String[][] data = {
                { "1", "4031", "CSE" },
                { "Anand Jha", "6014", "IT" } , 
                {"Anand Jha", "6014", "IT"},  {"Anand Jha", "6014", "IT"} ,
                { "1", "4031", "CSE" },
                { "Anand Jha", "6014", "IT" } , 
                {"Anand Jha", "6014", "IT"},  {"Anand Jha", "6014", "IT"} ,
                { "1", "4031", "CSE" },
                { "Anand Jha", "6014", "IT" } , 
                {"Anand Jha", "6014", "IT"},  {"Anand Jha", "6014", "IT"} ,
                { "1", "4031", "CSE" },
                
            
        };
 
        // Column Names
        String[] columnNames = { "Name", "Roll Number", "Department" };
 
        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);
 
        // adding it to JScrollPane
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        f.setSize(500, 200);
        // Frame Visible = true
        f.setVisible(true);
    }
 
    // Driver  method
    public static void main(String[] args)
    {
        new jtable();
    }
}

