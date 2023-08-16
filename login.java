import java.awt.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.colorchooser.AbstractColorChooserPanel;

public class Frame1 extends JFrame{
    JLabel idLabel;
    JLabel passLabel;
	JLabel background;
	JLabel headerLabel;
	JLabel devInfo;
    JTextField id;
    JPasswordField pass;
    JButton submit;

   public Frame1(){
		setTitle("Restaurant Management System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true)
		
		this.background = new JLabel(new ImageIcon("restaurant.jpg"));
		this.init();

		add(background);
		background.setVisible(true);  
        this.pack();
		this.setSize(700,400);
		this.setLocationRelativeTo(null);
    }

    public void init(){
		headerLabel = new JLabel();
		this.headerLabel.setText("Restaurant Management System");
		this.headerLabel.setBounds(270,1,200,100);
		this.headerLabel.setFont(new Font("Geomanist", Font.BOLD, 25));
		headerLabel.setForeground(Color.white);
		add(headerLabel);
		idLabel = new JLabel();
		
		this.idLabel.setText("Username");
		this.idLabel.setBounds(190,110,100,50);
		this.idLabel.setFont(new Font(null, Font.BOLD, 20));
		idLabel.setForeground(Color.white);
		add(idLabel);
		
        passLabel=new JLabel("Password");
		this.passLabel.setBounds(190,165,100,50);
		this.passLabel.setFont(new Font(null, Font.BOLD, 20));
		passLabel.setForeground(Color.white);
		add(passLabel);
		
		devInfo = new JLabel();
		this.devInfo.setBounds(130,300,1000,30);
		this.devInfo.setFont(new Font("Geomanist", Font.PLAIN, 15));
		devInfo.setForeground(Color.white);
		add(devInfo);
		id=new JTextField();
		this.id.setBounds(300,125,200,30);
		add(id);
		
		pass=new JPasswordField();
		this.add(pass);
		this.pass.setBounds(300,175,200,30);
		this.id.setVisible(true);
		
       this.submit=new JButton("Login");
	   this.submit.setBounds(400,230,100,25);
	   add(submit);
       submit.addActionListener(this::submitActionPerformed);
    } 

   public void submitActionPerformed(java.awt.event.ActionEvent evt){
   if(id.getText().equals("admin") && pass.getText().equals("admin")){
     this.hide();
     Frame2new fn=new Frame2new();
     fn.showButtonDemo();
   }
   else{
    JOptionPane.showMessageDialog(null, "Invalid password!");
   }
   }
}
class MyGui{
	public static void main(String[] a){
		Frame1 f = new Frame1();
		f.setVisible(true);
	}
}
