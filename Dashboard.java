package travel.management.system;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    
    Dashboard() {
          //setBounds(0,0,1600,1000);
          setExtendedState(JFrame.MAXIMIZED_BOTH);
          setLayout(null);
          
          JPanel p1 = new JPanel ();
          p1.setLayout(null);
          p1.setBackground(new Color(0, 0, 102));
          p1.setBounds(0, 0, 1600, 65);
          add(p1);
          
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70, 70,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon  = new JLabel(i3);
        icon.setBounds(5, 0, 70,70);
        p1.add(icon);
        
        
        JLabel heading = new JLabel("DashBoard");
        heading.setBounds(80,10,300,40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Tahoma",Font.BOLD, 30));
        p1.add( heading);
        
        
        JPanel p2 = new JPanel ();
          p2.setLayout(null);
          p2.setBackground(new Color(0, 0, 102));
          p2.setBounds(0, 65, 300, 900);
          add(p2);
        
          JButton addPersonalDetails = new JButton("Add Personal Details");
          addPersonalDetails.setBounds(0, 0,  300, 50);
          addPersonalDetails.setBackground(new Color(0, 0, 102));
          addPersonalDetails.setForeground( Color.WHITE);
          addPersonalDetails.setFont( new Font("Tahoma",Font.PLAIN,20));
          addPersonalDetails.setMargin( new Insets(0,0,0,60));
          p2.add(addPersonalDetails);
          
          
          JButton updatePersonalDetails = new JButton("Update Personal Details");
          updatePersonalDetails.setBounds(0, 50,  300, 50);
          updatePersonalDetails.setBackground(new Color(0, 0, 102));
          updatePersonalDetails.setForeground( Color.WHITE);
          updatePersonalDetails.setFont( new Font("Tahoma",Font.PLAIN,20));
          updatePersonalDetails.setMargin( new Insets(0,0,0,30));
          p2.add(updatePersonalDetails);
          
          
          JButton viewPersonalDetails = new JButton("View Details");
          viewPersonalDetails.setBounds(0, 100,  300, 50);
          viewPersonalDetails.setBackground(new Color(0, 0, 102));
          viewPersonalDetails.setForeground( Color.WHITE);
          viewPersonalDetails.setFont( new Font("Tahoma",Font.PLAIN,20));
          viewPersonalDetails.setMargin( new Insets(0,0,0,130));
          p2.add(viewPersonalDetails);
          
          JButton deletePersonalDetails = new JButton("Delete Personal Details");
          deletePersonalDetails.setBounds(0, 150,  300, 50);
          deletePersonalDetails.setBackground(new Color(0, 0, 102));
          deletePersonalDetails.setForeground( Color.WHITE);
          deletePersonalDetails.setFont( new Font("Tahoma",Font.PLAIN,20));
          deletePersonalDetails.setMargin( new Insets(0,0,0,40));
          p2.add(deletePersonalDetails);
          
          JButton CheckPackage = new JButton(" Check Package");
          CheckPackage .setBounds(0, 200,  300, 50);
          CheckPackage .setBackground(new Color(0, 0, 102));
          CheckPackage .setForeground( Color.WHITE);
          CheckPackage .setFont( new Font("Tahoma",Font.PLAIN,20));
          CheckPackage .setMargin( new Insets(0,0,0,110));
          p2.add(CheckPackage );
           
          
          JButton bookPackage = new JButton(" book Package");
          bookPackage .setBounds(0, 250,  300, 50);
          bookPackage .setBackground(new Color(0, 0, 102));
          bookPackage .setForeground( Color.WHITE);
          bookPackage .setFont( new Font("Tahoma",Font.PLAIN,20));
          bookPackage.setMargin( new Insets(0,0,0,120));
          p2.add( bookPackage );
          
          JButton viewPackage = new JButton(" view Package");
          viewPackage .setBounds(0, 300,  300, 50);
          viewPackage .setBackground(new Color(0, 0, 102));
          viewPackage .setForeground( Color.WHITE);
          viewPackage .setFont( new Font("Tahoma",Font.PLAIN,20));
          viewPackage.setMargin( new Insets(0,0,0,120));
          p2.add( viewPackage );
          
          
           
           JButton viewhotels = new JButton(" view Hotels");
          viewhotels .setBounds(0, 350,  300, 50);
          viewhotels .setBackground(new Color(0, 0, 102));
          viewhotels .setForeground( Color.WHITE);
          viewhotels .setFont( new Font("Tahoma",Font.PLAIN,20));
          viewhotels.setMargin( new Insets(0,0,0,130));
          p2.add( viewhotels );
          
          
          JButton bookhotel = new JButton(" Book Hotel");
          bookhotel .setBounds(0, 400,  300, 50);
          bookhotel .setBackground(new Color(0, 0, 102));
          bookhotel .setForeground( Color.WHITE);
          bookhotel .setFont( new Font("Tahoma",Font.PLAIN,20));
          bookhotel.setMargin( new Insets(0,0,0,130));
          p2.add(bookhotel );
          
          JButton viewbookedhotel = new JButton(" View Booked Hotel");
          viewbookedhotel.setBounds(0, 450,  300, 50);
          viewbookedhotel.setBackground(new Color(0, 0, 102));
          viewbookedhotel .setForeground( Color.WHITE);
          viewbookedhotel .setFont( new Font("Tahoma",Font.PLAIN,20));
          viewbookedhotel .setMargin( new Insets(0,0,0, 70));
          p2.add(viewbookedhotel);
          
          
          JButton destinations = new JButton(" Destinations");
          destinations.setBounds(0, 500,  300, 50);
          destinations.setBackground(new Color(0, 0, 102));
          destinations .setForeground( Color.WHITE);
          destinations.setFont( new Font("Tahoma",Font.PLAIN,20));
          destinations.setMargin( new Insets(0,0,0, 125));
          p2.add(destinations);
          
           
          JButton payments = new JButton(" Payments");
          payments .setBounds(0, 550,  300, 50);
          payments .setBackground(new Color(0, 0, 102));
          payments .setForeground( Color.WHITE);
          payments .setFont( new Font("Tahoma",Font.PLAIN,20));
          payments.setMargin( new Insets(0,0,0,155));
          p2.add(payments );
          
          
          JButton Calculators = new JButton(" Calculator");
          Calculators .setBounds(0, 600,  300, 50);
          Calculators .setBackground(new Color(0, 0, 102));
          Calculators .setForeground( Color.WHITE);
          Calculators .setFont( new Font("Tahoma",Font.PLAIN,20));
          Calculators.setMargin( new Insets(0,0,0,145));
          p2.add(Calculators );
          
          
          JButton notepad = new JButton(" Notepad");
          notepad .setBounds(0, 650,  300, 50);
          notepad .setBackground(new Color(0, 0, 102));
          notepad .setForeground( Color.WHITE);
          notepad .setFont( new Font("Tahoma",Font.PLAIN,20));
          notepad.setMargin( new Insets(0,0,0,155));
          p2.add(notepad );
          
          
          JButton about = new JButton("About");
          about .setBounds(0, 700,  200, 50);
          about .setBackground(new Color(0, 0, 102));
          about .setForeground( Color.WHITE);
          about .setFont( new Font("Tahoma",Font.PLAIN,20));
          about .setMargin( new Insets(0,0,0,175));
          p2.add(about );
          
          ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650, 1000,Image.SCALE_DEFAULT);
        ImageIcon i6= new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0, 0, 1650, 1000);
        add(image);
          
          
          
          
          setVisible(true);
          
    
}
      
public static void main(String[] args) {
      new Dashboard();

}
}