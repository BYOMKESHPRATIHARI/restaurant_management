import java.awt.*;
import java.awt.event.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;

public class ItemInfo {
   private JFrame mainFrame;
   private JLabel headerLabel;
   //private JLabel statusLabel;
   private JPanel controlPanel;
    ItemInfo (){
      prepareGUI();
   }

   public static void main(String[] args) throws SQLException{
      ItemInfo  swingControlDemo = new ItemInfo();
      swingControlDemo.showButtonDemo();
   }

   private void prepareGUI(){
      mainFrame = new JFrame("Showing all items");
      mainFrame.setSize(700,400);
	  mainFrame.getContentPane().setBackground(Color.pink);
     // mainFrame.setLayout(new GridLayout(4, 1));
      mainFrame.setLayout(new FlowLayout());
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            //System.exit(0);
         }
      });
      headerLabel = new JLabel("", JLabel.CENTER);
     // statusLabel = new JLabel("",JLabel.CENTER);
     // statusLabel.setSize(450,200);
      controlPanel = new JPanel();
      controlPanel.setSize(700,400);
      controlPanel.setLayout(new FlowLayout());
      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      //mainFrame.add(statusLabel);
      mainFrame.setVisible(true);
   }

   public void showButtonDemo() throws SQLException{
      headerLabel.setText("Restaurant Management System");
	  headerLabel.setFont(new Font(null, Font.BOLD, 25));
      String[] columnNames = {"ID","Food Name",
                        "Price",
                        "Quantity"
                        };
      Object[][] data = new Object[100][4];
     PreparedStatement pst;
       ResultSet rs;
            DBConnection con = new DBConnection();
            try{
                pst = con.mkDataBase().prepareStatement("select * from canteenmanagement.food");
                rs = pst.executeQuery();
                int i=0;
                while(rs.next()){
                    data[i][0] = rs.getInt("f_id");
                    data[i][1] = rs.getString("f_name");
                    data[i][2] = rs.getDouble("f_prize");
                    data[i][3] =  rs.getInt("f_quantity");
                    i++;
                }
                mainFrame.setVisible(false);
            }catch(Exception ex){
                System.out.println(ex);
                System.out.println("Error");
                JOptionPane.showMessageDialog(null, "Error !");
            }

        JTable table = new JTable(data, columnNames);
        table.setSize(400, 400);
		table.setVisible(true);
	  //  table.setEnabled(false);
      controlPanel.add(new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER));
      //controlPanel.add(table);
      mainFrame.setVisible(true);
	  mainFrame.setLocationRelativeTo(null);
   }
}
