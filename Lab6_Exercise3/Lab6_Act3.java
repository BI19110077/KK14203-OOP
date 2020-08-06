//NAME : NURMUNIRAH BINTI ASRI
// MATRIC NO : BI19110077
// LAB 6 : GUI


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
//required for border
import javax.swing.BorderFactory;
import javax.swing.border.Border;
//required for file IO
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
//required for exception
import java.io.IOException;

//Header panel
class HeaderPanel extends JPanel{
   private JLabel header;
   public HeaderPanel(){
      	header = new JLabel("Cake Menu");
      	add(header);
   }
}

//Form Panel
class FormPanel extends JPanel implements ActionListener, ItemListener{
   //list all UI components for the panel
   JLabel blackforest;
   JLabel chocolate;
   JLabel cherries;
   JLabel whippedcream;
   JLabel price;
   JLabel small;
   JLabel medium;
   JLabel large;
   JLabel Topping;
   JCheckBox c1;
   JCheckBox c2;
   JCheckBox c3;
   JLabel size;
   JLabel cakeorder;
   JButton b_submit;
   JButton b_clear;
   JLabel lbl_output; 
   JScrollPane jsp;
   Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
   
      //global variable  
   String output = "";
   String cb_Size = "";
   String rb_selection = "";
   String cb_selection = "";
   String filePath = "data.txt"; //in the same directory
   
      public FormPanel(){   
      setLayout(new FlowLayout(FlowLayout.LEFT));     
      
      blackforest = new JLabel ("BlackForest with available Topping");
      chocolate = new JLabel ("1) Chocolate");
      cherries = new JLabel ("2) Cherries");
      whippedcream = new JLabel ("3) Whipped Cream");
      price = new JLabel ("Price");
      small = new JLabel ("[1] Small      : RM45.00");
      medium = new JLabel ("[2] Medium : RM65.00");
      large = new JLabel ("[3] Large     : RM80.00");
      cakeorder = new JLabel ("Cake Order Detail : ");
      Topping = new JLabel ("Topping : ");
      
      //adjust size and set layout
        setPreferredSize (new Dimension (667, 563));
        setLayout (null);

        //add components
        add (blackforest);
        add (chocolate);
        add (cherries);
        add (whippedcream);
        add (price);
        add (small);
        add (medium);
        add (large);
        add (cakeorder);
        add (Topping);
        
      
      //checkbox and  item listener
      c1 = new JCheckBox("Chocolate");
      c1.addItemListener(this);
      c2 = new JCheckBox("Cherries");
      c2.addItemListener(this);
      c3 = new JCheckBox ("Whipped Cream");
      add(c1);
      add(c2);
      add(c3);

      size = new JLabel ("Size : ");
      //Radio buttons and action listener
      JRadioButton rb1 = new JRadioButton("Small");
      rb1.addActionListener(this);
      JRadioButton rb2 = new JRadioButton("Medium");
      rb2.addActionListener(this);
      JRadioButton rb3 = new JRadioButton("Large");
      rb3.addActionListener(this);
      add(rb1);
      add(rb2);
      add(rb3);
      
      //define button group
      ButtonGroup bg = new ButtonGroup();
      bg.add(rb1);
      bg.add(rb2);
      bg.add(rb3);
      
      b_submit = new JButton("Submit");
      add(b_submit);
      b_clear = new JButton("Clear");
      add(b_clear);
      
      //handle button submit action listener
      //view the input to output label
      //and write to file
      b_submit.addActionListener(new ActionListener(){  
         public void actionPerformed(ActionEvent e){  
            //call method              
            if(printOutput())
               writeInput();     
         }  
      });
      
      //handle button clear action listener
      b_clear.addActionListener(new ActionListener(){  
         public void actionPerformed(ActionEvent e){  
            lbl_output.setText("Output");   
            bg.clearSelection();
            c1.setSelected(false);
            c2.setSelected(false);
            c3.setSelected(false);

         }  
      });
      
      lbl_output = new JLabel("Output");
      lbl_output.setBorder(border);
      lbl_output.setVerticalAlignment(JLabel.TOP);
      
      //add output label to scrollpane
      jsp = new JScrollPane(lbl_output);
      jsp.setPreferredSize(new Dimension(410,120));
      add(jsp);     
   }

      //handle radio button selection
   public void actionPerformed(ActionEvent ae) {
      rb_selection = ae.getActionCommand();    	   
   }
      //handle item listener for checkbox
   public void itemStateChanged(ItemEvent ie) {
      JCheckBox check = (JCheckBox)ie.getSource();
      cb_selection += check.getText() + " ";   
   }
   
   //method to print output to lbl_output
   public boolean printOutput(){
      output = "<html>";
      output += "Thank you for your order <br><br>"; 
      output += "Topping : " + cb_selection + "<br>";
      output += "Size : " + rb_selection + "<br>";
      output += "Total Price :  <br>";
      output += "</html>";          
      lbl_output.setText(output);
      jsp.getViewport().revalidate();
      return true;
    }
   
   //write to file
    public void writeInput(){
      File file = new File(filePath);
		FileWriter fr = null;
		BufferedWriter br = null;
		PrintWriter pr = null;
      
      String input =  rb_selection + ", " + cb_selection;
      
      //exception implementation
		try {
			// to append to file, you need to initialize FileWriter using below constructor
			fr = new FileWriter(file, true);
			br = new BufferedWriter(fr);
			pr = new PrintWriter(br);
			pr.println(input);
		} catch (IOException e) {			
         lbl_output.setText(e.toString());
		} finally {
			try {
				pr.close();
				br.close();
				fr.close();
			} catch (IOException e) {
				lbl_output.setText(e.toString());
			}
		}
    }
}
class MenuActionListener implements ActionListener {
   FormPanel fp;
   //receive FormPanel class to this constructor
   public MenuActionListener(FormPanel p){
      fp = p;
   }
   
   }
//run the application using this main
public class Lab6_Act3 {  
   public static void main(String[] 	args) {  
      JFrame f = new JFrame("Lab6 Activity 3");
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      //load panels
      HeaderPanel h = new 	HeaderPanel();
      HeaderPanel h2 = new 	HeaderPanel();
      FormPanel fp = new FormPanel();
      
      JMenuBar mb = new JMenuBar(); 
      // create a menu 
      JMenu x = new JMenu("Menu"); 
      
      // create menuitems 
      JMenuItem m1 = new JMenuItem("View Data"); 
      // attach listener and send FormPanel class
      m1.addActionListener(new MenuActionListener(fp));
      
      JMenuItem m2 = new JMenuItem("Exit");  
      m2.addActionListener((event) -> System.exit(0));
      // add menu items to menu 
      x.add(m1); 
      x.add(m2);
     
      // add menu to menu bar 
      mb.add(x); 
      // add menubar to frame 
      f.setJMenuBar(mb);  
               
      //add panels to frame       
      f.add(h,BorderLayout.NORTH);
      f.add(fp, BorderLayout.CENTER);
      f.setSize(460,400);
      f.setVisible(true);
   }  
}
