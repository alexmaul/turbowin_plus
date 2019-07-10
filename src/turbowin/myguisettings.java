/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turbowin;

import javax.swing.JOptionPane;

/**
 *
 * @author marti
 */
public class myguisettings extends javax.swing.JFrame {

   /**
    * Creates new form myguisettings
    */
   public myguisettings() {
      initComponents();
      initComponents2();
      setLocation(main.x_pos_main_frame, main.y_pos_main_frame);
   }

   /**
    * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form
    * Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      buttonGroup1 = new javax.swing.ButtonGroup();
      buttonGroup2 = new javax.swing.ButtonGroup();
      jPanel1 = new javax.swing.JPanel();
      jRadioButton1 = new javax.swing.JRadioButton();
      jRadioButton2 = new javax.swing.JRadioButton();
      jPanel2 = new javax.swing.JPanel();
      jRadioButton3 = new javax.swing.JRadioButton();
      jRadioButton4 = new javax.swing.JRadioButton();
      jRadioButton5 = new javax.swing.JRadioButton();
      jSeparator1 = new javax.swing.JSeparator();
      jButton1 = new javax.swing.JButton();
      jButton2 = new javax.swing.JButton();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setTitle("GUI settings");

      jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

      buttonGroup1.add(jRadioButton1);
      jRadioButton1.setText("Light");

      buttonGroup1.add(jRadioButton2);
      jRadioButton2.setText("Full");

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jRadioButton1)
               .addComponent(jRadioButton2))
            .addContainerGap(392, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addComponent(jRadioButton1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jRadioButton2)
            .addContainerGap(10, Short.MAX_VALUE))
      );

      jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

      buttonGroup2.add(jRadioButton3);
      jRadioButton3.setText("Eumetnet");

      buttonGroup2.add(jRadioButton4);
      jRadioButton4.setText("NOAA");

      buttonGroup2.add(jRadioButton5);
      jRadioButton5.setText("SOT");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jRadioButton5)
               .addComponent(jRadioButton4)
               .addComponent(jRadioButton3))
            .addContainerGap(368, Short.MAX_VALUE))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(10, 10, 10)
            .addComponent(jRadioButton3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jRadioButton4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jRadioButton5)
            .addContainerGap(10, Short.MAX_VALUE))
      );

      jButton1.setText("OK");
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            OK_button_actionPerformed(evt);
         }
      });

      jButton2.setText("Cancel");
      jButton2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            Cancel_button_actionPerformed(evt);
         }
      });

      jLabel1.setText("GUI mode");

      jLabel2.setText("GUI logo");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(400, 400, 400)
                  .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(0, 0, Short.MAX_VALUE))
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jSeparator1)))
            .addContainerGap())
         .addGroup(layout.createSequentialGroup()
            .addGap(266, 266, 266)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel1)
               .addComponent(jLabel2)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(274, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(98, 98, 98)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(127, 127, 127)
            .addComponent(jLabel2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(15, 15, 15)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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
      // GUI mode
      //
      if (main.GUI_mode.equals(main.GUI_LIGHT))
      {
         jRadioButton1.setSelected(true);   
         jRadioButton2.setSelected(false); 
      }
      else if (main.GUI_mode.equals(main.GUI_FULL))
      {
         jRadioButton1.setSelected(false);  
         jRadioButton2.setSelected(true);        
      }
      else // default = full GUI
      {
         jRadioButton1.setSelected(false);  
         jRadioButton2.setSelected(true);        
      }
      
      
      // GUI logo
      //
      if (main.GUI_logo.equals(main.LOGO_EUMETNET))
      {
         jRadioButton3.setSelected(true);   
         jRadioButton4.setSelected(false); 
         jRadioButton5.setSelected(false); 
      }
      else if (main.GUI_logo.equals(main.LOGO_NOAA))
      {
         jRadioButton3.setSelected(false);   
         jRadioButton4.setSelected(true); 
         jRadioButton5.setSelected(false); 
      }
      else if (main.GUI_logo.equals(main.LOGO_SOT))
      {
         jRadioButton3.setSelected(false);   
         jRadioButton4.setSelected(false); 
         jRadioButton5.setSelected(true); 
      }
      else // default = EUMETNET logo
      {
         jRadioButton3.setSelected(true);   
         jRadioButton4.setSelected(false); 
         jRadioButton5.setSelected(false); 
      }
      
   }
   
   
   
   /***********************************************************************************************/
   /*                                                                                             */
   /*                                                                                             */
   /*                                                                                             */
   /***********************************************************************************************/  
   private void Cancel_button_actionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_button_actionPerformed
      // TODO add your handling code here:
      
      setVisible(false);
      dispose();  
   }//GEN-LAST:event_Cancel_button_actionPerformed

   
   
   /***********************************************************************************************/
   /*                                                                                             */
   /*                                                                                             */
   /*                                                                                             */
   /***********************************************************************************************/
   private void OK_button_actionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OK_button_actionPerformed
      // TODO add your handling code here:
      
    
      // GUI mode
      //
      if (jRadioButton1.isSelected() == true)             
      {
         main.GUI_mode = main.GUI_LIGHT;
      }
      else if (jRadioButton2.isSelected() == true)  
      {
         main.GUI_mode = main.GUI_FULL;
      }
      
      // GUI logo
      //
      if (jRadioButton3.isSelected() == true)              
      {
         main.GUI_logo = main.LOGO_EUMETNET;
      }
      else if (jRadioButton4.isSelected() == true)              
      {
         main.GUI_logo = main.LOGO_NOAA;
      }
      if (jRadioButton5.isSelected() == true)              
      {
         main.GUI_logo = main.LOGO_SOT;
      }
      
      
      // save new setting
      //
      if (main.offline_mode_via_cmd == true)
      {
         main.schrijf_configuratie_regels();          
      }
      else // so offline_via_jnlp mode or online (webstart) mode
      {
         main.set_muffin();
         main.schrijf_configuratie_regels(); 
      }   
      
      // message 
      String info = "Changes will take full effect after a " + main.APPLICATION_NAME + " restart";
      JOptionPane.showMessageDialog(null, info, main.APPLICATION_NAME + " info", JOptionPane.INFORMATION_MESSAGE);            
      
      // close this GUI settings input page 
      setVisible(false);
      dispose();               
   }//GEN-LAST:event_OK_button_actionPerformed

   
   
   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      /* Set the Nimbus look and feel */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */
      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(myguisettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(myguisettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(myguisettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(myguisettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new myguisettings().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.ButtonGroup buttonGroup1;
   private javax.swing.ButtonGroup buttonGroup2;
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JRadioButton jRadioButton1;
   private javax.swing.JRadioButton jRadioButton2;
   private javax.swing.JRadioButton jRadioButton3;
   private javax.swing.JRadioButton jRadioButton4;
   private javax.swing.JRadioButton jRadioButton5;
   private javax.swing.JSeparator jSeparator1;
   // End of variables declaration//GEN-END:variables
}
