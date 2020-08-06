/*
   NAME : NURMUNIRAH BINTI ASRI
   MATRIC NO : BI19110077
   PROJECT 2 : CALCULATOR (GUI)
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
//required for border
import javax.swing.BorderFactory;
import javax.swing.border.Border;
//required for exception
import java.io.IOException;

public class Project2_Calculator extends JFrame {
    private ButtonGroup buttonGroup1;
    private JButton jButton1;
    private JButton jButton10;
    private JButton jButton11;
    private JButton jButton12;
    private JButton jButton13;
    private JButton jButton14;
    private JButton jButton15;
    private JButton jButton16;
    private JButton jButton17;
    private JButton jButton18;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JLabel jLabel1;
    private JRadioButton jRadioButton1;
    private JRadioButton jRadioButton2;
    private JTextField jTextField2;
   
    double num, ans;
    int calculation;

    public Project2_Calculator() {
        initComponents();
        jRadioButton2.setEnabled(true); //ON button disable
        jRadioButton1.setEnabled(false); //OFF button enable
        
    }
                              
    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();
        jButton9 = new JButton();
        jButton10 = new JButton();
        jButton11 = new JButton();
        jButton12 = new JButton();
        jButton13 = new JButton();
        jButton14 = new JButton();
        jButton15 = new JButton();
        jButton16 = new JButton();
        jButton17 = new JButton();
        jButton18 = new JButton();
        jTextField2 = new JTextField();
        jLabel1 = new JLabel();

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("ON");
        jRadioButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("OFF");
        jRadioButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("C");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("<-");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("4");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("5");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("6");
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("-");
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("1");
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("2");
        jButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("3");
        jButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("+");
        jButton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("7");
        jButton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("8");
        jButton12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText("9");
        jButton13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText("*");
        jButton14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText("=");
        jButton15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setText("/");
        jButton16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setText("0");
        jButton17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setText(".");
        jButton18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(JTextField.RIGHT);

        javax.swing.GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 61,GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton11,GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton17,GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton18, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton15, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton16, GroupLayout.PREFERRED_SIZE, 69,GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 73,GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1,GroupLayout.PREFERRED_SIZE, 22,GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }                        

    private void jButton4ActionPerformed(ActionEvent evt) {                                         
        jTextField2.setText( jTextField2.getText()+ "5");
    }                                        

    private void jButton8ActionPerformed(ActionEvent evt) {                                         
        jTextField2.setText( jTextField2.getText()+ "2");
    }                                        

    private void jButton12ActionPerformed(ActionEvent evt) {                                          
       jTextField2.setText( jTextField2.getText()+ "8");
    }                                         

    private void jButton18ActionPerformed(ActionEvent evt) {                                          
       jTextField2.setText( jTextField2.getText()+ ".");
    }                                         

    private void jButton13ActionPerformed(ActionEvent evt) {                                          
        jTextField2.setText( jTextField2.getText()+ "9");
    }                                         

    private void jRadioButton2ActionPerformed(ActionEvent evt) {   //Off button                                           
        disabled(); //call disable method
    }                                             

    private void jButton7ActionPerformed(ActionEvent evt) {                                         
        jTextField2.setText( jTextField2.getText()+ "1");
    }                                        

    private void jButton9ActionPerformed(ActionEvent evt) {                                         
        jTextField2.setText( jTextField2.getText()+ "3");
    }                                        

    private void jButton3ActionPerformed(ActionEvent evt) {                                         
        jTextField2.setText( jTextField2.getText()+ "4");
    }                                        

    private void jButton5ActionPerformed(ActionEvent evt) {                                         
        jTextField2.setText( jTextField2.getText()+ "6");
    }                                        

    private void jButton11ActionPerformed(ActionEvent evt) {                                          
        jTextField2.setText( jTextField2.getText()+ "7");
    }                                         

    private void jButton17ActionPerformed(ActionEvent evt) {                                          
        jTextField2.setText( jTextField2.getText()+ "0");
    }                                         

    private void jButton15ActionPerformed(ActionEvent evt) {                                          
    math_operation();
    jLabel1.setText("");
    }                                         

    private void jButton10ActionPerformed(ActionEvent evt) {    //addition button                                      
        num = Double.parseDouble(jTextField2.getText());
        calculation = 1;
        jTextField2.setText("");
        jLabel1.setText(num + "+");
        
    }                                         

    private void jButton6ActionPerformed(ActionEvent evt) {   //subtraction button                                      
        num = Double.parseDouble(jTextField2.getText());
        calculation = 2;
        jTextField2.setText("");
        jLabel1.setText(num + "-");
    }                                        

    private void jButton14ActionPerformed(ActionEvent evt) {     //multiplication button                                     
        num = Double.parseDouble(jTextField2.getText());
        calculation = 3;
        jTextField2.setText("");
        jLabel1.setText(num + "*");
    }                                         

    private void jButton16ActionPerformed(ActionEvent evt) {    //divide button                                      
        num = Double.parseDouble(jTextField2.getText());
        calculation = 4;
        jTextField2.setText("");
        jLabel1.setText(num + "/");
    }                                         

    private void jButton1ActionPerformed(ActionEvent evt) { //button clear                                        
        jTextField2.setText("");
    }                                        

    private void jRadioButton1ActionPerformed(ActionEvent evt) {      //on button                                        
        enable(); //call method for enable
    }                                             

    private void jButton2ActionPerformed(ActionEvent evt) {                                         
        
        int length = jTextField2.getText().length();
        int number = jTextField2.getText().length() - 1;
        String store;
        
        if (length > 0){
            
            StringBuilder back = new StringBuilder (jTextField2.getText());
            back.deleteCharAt(number);
            store = back.toString();
            jTextField2.setText(store);
            
        }
            
    }                                        

    
    public void math_operation(){
        
        
        switch (calculation)
        {
            case 1 : //addition
                ans = num + Double.parseDouble(jTextField2.getText());
                jTextField2.setText(Double.toString(ans));
                break;
            case 2 : //subtaction
                ans = num - Double.parseDouble(jTextField2.getText());
                jTextField2.setText(Double.toString(ans));
                break;
            case 3 : //multiplication
                ans = num * Double.parseDouble(jTextField2.getText());
                jTextField2.setText(Double.toString(ans));
                break;
            case 4 : //division
                ans = num / Double.parseDouble(jTextField2.getText());
                jTextField2.setText(Double.toString(ans));
                break;    
        }
    }
    public void disabled(){ //OFF button
        jTextField2.setEnabled(false);
        jTextField2.setText("");
        jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(false);
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButton9.setEnabled(false);
        jButton10.setEnabled(false);
        jButton11.setEnabled(false);
        jButton12.setEnabled(false);
        jButton13.setEnabled(false);
        jButton14.setEnabled(false);
        jButton15.setEnabled(false);
        jButton16.setEnabled(false);
        jButton17.setEnabled(false);
        jButton18.setEnabled(false);
        
    }
    
    public void enable(){ // ON button
        jTextField2.setEnabled(true);
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        jButton10.setEnabled(true);
        jButton11.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);
        jButton14.setEnabled(true);
        jButton15.setEnabled(true);
        jButton16.setEnabled(true);
        jButton17.setEnabled(true);
        jButton18.setEnabled(true);
        
    }
    
    public static void main(String args[]) {
    
        JFrame f = new JFrame ("Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Project2_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Project2_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Project2_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Project2_Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


       EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project2_Calculator().setVisible(true);
            }
        });
        
        
      //add panels to frame
      f.setVisible(true);
    }
                     
                     
}
