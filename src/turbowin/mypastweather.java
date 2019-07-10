package turbowin;

/*
 * mypastweather.java
 *
 * Created on 28 mei 2008, 8:16
 */



/**
 *
 * @author  Martin
 */
final public class mypastweather extends javax.swing.JFrame {
    
    /** Creates new form mypastweather */
    public mypastweather() {
        initComponents();
        initComponents2();
        initSynopparameters();
        setLocation(main.x_pos_frame, main.y_pos_frame);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jButton1 = new javax.swing.JButton();
      jButton2 = new javax.swing.JButton();
      jButton3 = new javax.swing.JButton();
      jSeparator1 = new javax.swing.JSeparator();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jLabel6 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jPanel1 = new javax.swing.JPanel();
      jCheckBox1 = new javax.swing.JCheckBox();
      jCheckBox2 = new javax.swing.JCheckBox();
      jCheckBox3 = new javax.swing.JCheckBox();
      jCheckBox4 = new javax.swing.JCheckBox();
      jCheckBox5 = new javax.swing.JCheckBox();
      jCheckBox6 = new javax.swing.JCheckBox();
      jCheckBox7 = new javax.swing.JCheckBox();
      jCheckBox8 = new javax.swing.JCheckBox();
      jCheckBox9 = new javax.swing.JCheckBox();
      jCheckBox10 = new javax.swing.JCheckBox();
      jButton4 = new javax.swing.JButton();
      jButton5 = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setTitle("Past weather");
      setMinimumSize(new java.awt.Dimension(800, 600));
      setResizable(false);

      jButton1.setText("OK");
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            OK_button_actionPerformed(evt);
         }
      });

      jButton2.setText("Cancel");
      jButton2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            Cancel_buton_actionPerformed(evt);
         }
      });

      jButton3.setText("Internet");
      jButton3.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            Internet_button_actionPerformed(evt);
         }
      });

      jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(0, 0, 255));
      jLabel1.setText("Past weather shall be selected in such way thet Past weather and Present weather together give as complete a description as possible  of the weather in the");

      jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
      jLabel2.setForeground(new java.awt.Color(0, 0, 255));
      jLabel2.setText("time interval concerned. For example if the type of weather undergoes a complete change during the time interval concerned, Past weather shall describe");

      jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
      jLabel3.setForeground(new java.awt.Color(0, 0, 255));
      jLabel3.setText("the weather prevailing before the type of weather indicated by Present weather");

      jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
      jLabel5.setForeground(new java.awt.Color(0, 0, 255));
      jLabel5.setText("The period covered by Past weather shall be: six hours for observations at 0000, 0600, 1200 1800 UTC; three hours for observations at 0300, 0900, 1500, ");

      jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
      jLabel6.setForeground(new java.awt.Color(0, 0, 255));
      jLabel6.setText("2100 UTC; one hour for observations at 0100, 0200, 0400, 0500, 0700, 0800, 1000, 1100, 1300, 1400, 1600, 1700, 1900, 2000, 2200, 2300 UTC");

      jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel4.setText("--- please check all applicable weather conditions ---");

      jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

      jCheckBox1.setText("thunderstorm(s), with or without precipitation");

      jCheckBox2.setText("shower(s)");

      jCheckBox3.setText("snow, or rain and snow mixed");

      jCheckBox4.setText("rain");

      jCheckBox5.setText("drizzle");

      jCheckBox6.setText("fog or ice fog or thick haze (visibility < 0.5 nm)");

      jCheckBox7.setText("sandstorm, duststorm or blowing snow");

      jCheckBox8.setText("sky covering > 0.5 throughout period");

      jCheckBox9.setText("sky covering > 0.5 and <= 0.5 during parts of period");

      jCheckBox10.setText("sky covering <= 0.5 throughout period");

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jCheckBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jCheckBox4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jCheckBox5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jCheckBox10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jCheckBox7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jCheckBox8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jCheckBox6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(120, 120, 120))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addContainerGap())))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jCheckBox1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCheckBox2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCheckBox3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCheckBox4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCheckBox5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCheckBox7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCheckBox8)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCheckBox9)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCheckBox10)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      jButton4.setText("Back");
      jButton4.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            Back_button_actionPerformed(evt);
         }
      });

      jButton5.setText("Stop");
      jButton5.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            Stop_button_actionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                           .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                           .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                     .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addGap(0, 0, Short.MAX_VALUE))
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
                     .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE))))
            .addContainerGap())
         .addGroup(layout.createSequentialGroup()
            .addGap(163, 163, 163)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel3)
            .addGap(20, 20, 20)
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel6)
            .addGap(62, 62, 62)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(15, 15, 15)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(15, 15, 15))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents



   /***********************************************************************************************/
   /*                                                                                             */
   /*                                                                                             */
   /*                                                                                             */
   /***********************************************************************************************/
   private void initComponents2()
   {
       // hide Back/Stop buttons if not in next_screen_mode
       if (main.in_next_sequence == false)
       {
          jButton4.setEnabled(false);                         // back button
          jButton5.setEnabled(false);                         // stop button
       }


      if (main.offline_mode == true)
      {
         jButton3.setText("Help");
      }
   }



    /***********************************************************************************************/
    /*                                                                                             */
    /*                                                                                             */
    /*                                                                                             */
    /***********************************************************************************************/
    private void initSynopparameters() 
    {

       // past weather 1 (prim. phenomena)
       // 
       if (past_weather_1.compareTo("") != 0)
       {
          if (past_weather_1.equals(W1W2_9))
             jCheckBox1.setSelected(true);
          else if (past_weather_1.equals(W1W2_8))
             jCheckBox2.setSelected(true);
          else if (past_weather_1.equals(W1W2_7))
             jCheckBox3.setSelected(true);
          else if (past_weather_1.equals(W1W2_6))
             jCheckBox4.setSelected(true);
          else if (past_weather_1.equals(W1W2_5))
             jCheckBox5.setSelected(true);
          else if (past_weather_1.equals(W1W2_4))
             jCheckBox6.setSelected(true);
          else if (past_weather_1.equals(W1W2_3))
             jCheckBox7.setSelected(true);
          else if (past_weather_1.equals(W1W2_2))
             jCheckBox8.setSelected(true);
          else if (past_weather_1.equals(W1W2_1))
             jCheckBox9.setSelected(true);
          else if (past_weather_1.equals(W1W2_0))
             jCheckBox10.setSelected(true);
       } // if (past_weather_1.compareTo("") != 0)
       
       
       // past weather 2 (sec. phenomena)
       // 
       if ((past_weather_2.compareTo("") != 0) && (past_weather_2.compareTo(past_weather_1) != 0))
       {
          if (past_weather_2.equals(W1W2_9))
             jCheckBox1.setSelected(true);
          else if (past_weather_2.equals(W1W2_8))
             jCheckBox2.setSelected(true);
          else if (past_weather_2.equals(W1W2_7))
             jCheckBox3.setSelected(true);
          else if (past_weather_2.equals(W1W2_6))
             jCheckBox4.setSelected(true);
          else if (past_weather_2.equals(W1W2_5))
             jCheckBox5.setSelected(true);
          else if (past_weather_2.equals(W1W2_4))
             jCheckBox6.setSelected(true);
          else if (past_weather_2.equals(W1W2_3))
             jCheckBox7.setSelected(true);
          else if (past_weather_2.equals(W1W2_2))
             jCheckBox8.setSelected(true);
          else if (past_weather_2.equals(W1W2_1))
             jCheckBox9.setSelected(true);
          else if (past_weather_2.equals(W1W2_0))
             jCheckBox10.setSelected(true);
       } // if ((past_weather_2.compareTo("") != 0) && (past_weather_2.compareTo(past_weather_1) != 0))
    }


    /***********************************************************************************************/
    /*                                                                                             */
    /*                                                                                             */
    /*                                                                                             */
    /***********************************************************************************************/
    private void OK_button_actionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OK_button_actionPerformed
       // TODO add your handling code here:
       
       /* initialisation  */
       Reset_All_PastWeather_Vars();
 
       if (jCheckBox1.isSelected() == true)
       {    
          W1_code = "9";
          past_weather_1 = W1W2_9;
       } // if (jCheckBox1.isSelected() == true)  
       if (jCheckBox2.isSelected() == true)
       {    
          if (W1_code.equals("") == true) 
          {
             W1_code = "8"; 
             past_weather_1 = W1W2_8;
          }
          else
          {
             W2_code = "8"; 
             past_weather_2 = W1W2_8;
          }    
       } // else if (jCheckBox2.isSelected() == true)  
       if (jCheckBox3.isSelected() == true)
       {    
          if (W1_code.equals("") == true) 
          {
             W1_code = "7"; 
             past_weather_1 = W1W2_7;
          }
          else if (W2_code.equals("") == true) 
          {
             W2_code = "7"; 
             past_weather_2 = W1W2_7;
          }    
       } //else if (jCheckBox3.isSelected() == true)  
       if (jCheckBox4.isSelected() == true)
       {    
          if (W1_code.equals("") == true) 
          {
             W1_code = "6"; 
             past_weather_1 = W1W2_6;
          }
          else if (W2_code.equals("") == true) 
          {
             W2_code = "6"; 
             past_weather_2 = W1W2_6;
          }    
       }   
       if (jCheckBox5.isSelected() == true)
       {
          if (W1_code.equals("") == true) 
          {
             W1_code = "5"; 
             past_weather_1 = W1W2_5;
          }
          else if (W2_code.equals("") == true) 
          {
             W2_code = "5"; 
             past_weather_2 = W1W2_5;
          }    
       }
       if (jCheckBox6.isSelected() == true)
       {
          if (W1_code.equals("") == true) 
          {
             W1_code = "4"; 
             past_weather_1 = W1W2_4;
          }
          else if (W2_code.equals("") == true) 
          {
             W2_code = "4"; 
             past_weather_2 = W1W2_4;
          }    
       }
       if (jCheckBox7.isSelected() == true)
       {
          if (W1_code.equals("") == true) 
          {
             W1_code = "3"; 
             past_weather_1 = W1W2_3;
          }
          else if (W2_code.equals("") == true) 
          {
             W2_code = "3"; 
             past_weather_2 = W1W2_3;
          }    
       }
       if (jCheckBox8.isSelected() == true)
       {
          if (W1_code.equals("") == true) 
          {
             W1_code = "2"; 
             past_weather_1 = W1W2_2;
          }
          else if (W2_code.equals("") == true) 
          {
             W2_code = "2"; 
             past_weather_2 = W1W2_2;
          }    
       }
       if (jCheckBox9.isSelected() == true)
       {
          if (W1_code.equals("") == true) 
          {
             W1_code = "1"; 
             past_weather_1 = W1W2_1;
          }
          else if (W2_code.equals("") == true) 
          {
             W2_code = "1"; 
             past_weather_2 = W1W2_1;
          }    
       }
       if (jCheckBox10.isSelected() == true)
       {
          if (W1_code.equals("") == true) 
          {
             W1_code = "0"; 
             past_weather_1 = W1W2_0;
          }
          else if (W2_code.equals("") == true) 
          {
             W2_code = "0"; 
             past_weather_2 = W1W2_0;
          }    
       } // else if (jCheckBox10.isSelected() == true)
        
       
       /* if only one phenomena checked -> give sec. phenomena the same value */
       if ((past_weather_1.compareTo("") != 0) && (past_weather_2.equals("") == true))
       {
          W2_code        = W1_code; 
          past_weather_2 = past_weather_1;
       }
       
       /* update past weather field on main screen progress */
       main.past_weather_fields_update();
        
       /* close input page */
       setVisible(false);
       dispose();

       /* next screen if in_next_screen mode */
       if (main.in_next_sequence == true)
       {
          next_screen();
       }

    }//GEN-LAST:event_OK_button_actionPerformed


   /***********************************************************************************************/
   /*                                                                                             */
   /*                                                                                             */
   /*                                                                                             */
   /***********************************************************************************************/
   private void Reset_All_PastWeather_Vars()   
   {
      // scope this module + myturbowin.java main module (all of type: static) 
      W1_code             = "";
      W2_code             = "";
      past_weather_1      = "";
      past_weather_2      = "";
      
      // local (scope only this file, no static) 
      //checks_ok           = false;   

       /* update past weather field on main screen progress */
       main.past_weather_fields_update();
   }
     
    
    /***********************************************************************************************/
    /*                                                                                             */
    /*                                                                                             */
    /*                                                                                             */
    /***********************************************************************************************/
    private void Cancel_buton_actionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_buton_actionPerformed
       // TODO add your handling code here:
       
       /* close input page */
       setVisible(false);
       dispose();

       /* next screen in in next sequence mode */
       if (main.in_next_sequence == true)
       {
          next_screen();
       }
    }//GEN-LAST:event_Cancel_buton_actionPerformed


    /***********************************************************************************************/
    /*                                                                                             */
    /*                                                                                             */
    /*                                                                                             */
    /***********************************************************************************************/
    private void Internet_button_actionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Internet_button_actionPerformed
       // TODO add your handling code here:
       main.internet_mouseClicked(PASTWEATHER_HELP_DIR);
    }//GEN-LAST:event_Internet_button_actionPerformed


    /***********************************************************************************************/
    /*                                                                                             */
    /*                                                                                             */
    /*                                                                                             */
    /***********************************************************************************************/
    private void Back_button_actionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_button_actionPerformed
       // TODO add your handling code here:
       setVisible(false);
       dispose();

       previous_screen();
    }//GEN-LAST:event_Back_button_actionPerformed


    /***********************************************************************************************/
    /*                                                                                             */
    /*                                                                                             */
    /*                                                                                             */
    /***********************************************************************************************/
    private void Stop_button_actionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop_button_actionPerformed
       // TODO add your handling code here:
       setVisible(false);
       dispose();

       main.in_next_sequence = false;
    }//GEN-LAST:event_Stop_button_actionPerformed


   /***********************************************************************************************/
   /*                                                                                             */
   /*                                                                                             */
   /*                                                                                             */
   /***********************************************************************************************/
   private void previous_screen()
   {
      mypresentweather form = new mypresentweather();
      form.setSize(800, 600);
      form.setVisible(true);
   }



   /***********************************************************************************************/
   /*                                                                                             */
   /*                                                                                             */
   /*                                                                                             */
   /***********************************************************************************************/
   private void next_screen()
   {
      mycl form = new mycl();
      form.setSize(800, 600);
      form.setVisible(true);
   }


    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
         @Override
            public void run() {
                new mypastweather().setVisible(true);
            }
        });
    }
    
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JButton jButton4;
   private javax.swing.JButton jButton5;
   private javax.swing.JCheckBox jCheckBox1;
   private javax.swing.JCheckBox jCheckBox10;
   private javax.swing.JCheckBox jCheckBox2;
   private javax.swing.JCheckBox jCheckBox3;
   private javax.swing.JCheckBox jCheckBox4;
   private javax.swing.JCheckBox jCheckBox5;
   private javax.swing.JCheckBox jCheckBox6;
   private javax.swing.JCheckBox jCheckBox7;
   private javax.swing.JCheckBox jCheckBox8;
   private javax.swing.JCheckBox jCheckBox9;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JSeparator jSeparator1;
   // End of variables declaration//GEN-END:variables
    
    /* constants global */
    public static final String W1W2_9           = "thunderstorm(s), with or without precipitation";
    public static final String W1W2_8           = "shower(s)";
    public static final String W1W2_7           = "snow, or rain and snow mixed";
    public static final String W1W2_6           = "rain";
    public static final String W1W2_5           = "drizzle";        
    public static final String W1W2_4           = "fog or ice fog of thick haze (visibility < 0.5 nm)";        
    public static final String W1W2_3           = "sandstorm, duststorm or blowing snow"; 
    public static final String W1W2_2           = "sky covering > 0.5 throughout period";        
    public static final String W1W2_1           = "sky covering > 0.5 and <= 0.5 during parts period";
    public static final String W1W2_0           = "sky covering <= 0.5 throughout period"; 
    
    /* constants local */
    private final String PASTWEATHER_HELP_DIR    = "weather.html";

    // scope this module + myturbowin.java main module (all of type: static) 
    public static String W1_code                = "";
    public static String W2_code                = "";
    public static String past_weather_1         = "";
    public static String past_weather_2         = "";
    
}
