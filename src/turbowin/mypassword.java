package turbowin;


import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * mypassword.java
 *
 * Created on 28-nov-2008, 8:08:47
 */

/**
 *
 * @author Martin
 */
final public class mypassword extends javax.swing.JFrame {

    /** Creates new form mypassword */
    public mypassword() {
        initComponents();
        setLocation(main.x_pos_small_frame, main.y_pos_small_frame);
    }

    //mypassword(String mode) {
    //    //throw new UnsupportedOperationException("Not yet implemented");
    //    local_mode = mode;
    //}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPasswordField1 = new javax.swing.JPasswordField();
      jLabel1 = new javax.swing.JLabel();
      jButton1 = new javax.swing.JButton();
      jSeparator1 = new javax.swing.JSeparator();
      jButton2 = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setTitle("Password");
      setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
      setMinimumSize(new java.awt.Dimension(400, 300));

      jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            Enter_actionPerformed(evt);
         }
      });

      jLabel1.setText("password:");

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

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                  .addContainerGap())
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                  .addComponent(jLabel1)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(102, 102, 102))))
         .addGroup(layout.createSequentialGroup()
            .addGap(104, 104, 104)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(101, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(105, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel1))
            .addGap(88, 88, 88)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(15, 15, 15)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(15, 15, 15))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   
   
    private void OK_button_actionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OK_button_actionPerformed
        // TODO add your handling code here:

       /* first check passsword */
       char char_password[] = jPasswordField1.getPassword();
       String password = String.valueOf(char_password);                                           // char to string
       // NB eigenlijk is dit niet veilig om een String van char_password te maken zie Core Java...

       String dummy = "01";
       if (("TurboWin " + password.trim()).equals("TurboWin JWS" + dummy))
       {
          //JOptionPane.showMessageDialog(null, password, "password ok", JOptionPane.INFORMATION_MESSAGE);

          /* voor security direct op nul zetten */
          char_password = null;
          password = "";

          /* close password screen */
          setVisible(false);
          dispose();

          if (main.mode.equals(main.STATION_DATA))
          {
             /* open station data input page */
             mystationdata form = new mystationdata();
             form.setSize(800, 600);
             form.setVisible(true);
          }
          else if (main.mode.equals(main.EMAIL_SETTINGS))
          {
             /* open email settings input page */
             myemailsettings form = new myemailsettings();
             form.setSize(1000, 700);//form.setSize(800, 600);
             form.setVisible(true);
          }
          else if (main.mode.equals(main.LOG_FILES))
          {
             /* open log files (which dir for storage) input page */
             mylogfiles form = new mylogfiles();
             form.setSize(800, 600);
             form.setVisible(true);
          }
          else if (main.mode.equals(main.SERIAL_CONNECTION))     // or WiFi
          {
             /* open serial connection settings input page */
             RS232_settings form = new RS232_settings();
             form.setSize(800, 600);
             form.setVisible(true);
          }
          else if (main.mode.equals(main.SET_OBS_FORMAT))
          {
             /* open type of obs format input page */
             myobsformat form = new myobsformat();
             form.setSize(800, 600);
             form.setVisible(true);
          }
          else if (main.mode.equals(main.SET_WOW_APR_SETTINGS))
          {
             /* open WOW/APR settings input page */
             WOW_APR_settings form = new WOW_APR_settings();
             form.setSize(1000, 700);
             form.setVisible(true);
          }
          else if (main.mode.equals(main.SET_SERVER_SETTINGS))
          {
             /* open server settings (upload URL for Output -> Obs to server) input page */
             myserversettings form = new myserversettings();
             form.setSize(1000, 700);
             form.setVisible(true);
          }
          else if (main.mode.equals(main.MAINTENANCE_SHOW_DATA))
          {
             // open maintenance show data
             mymaintenancedata form = new mymaintenancedata();
             form.setExtendedState(MAXIMIZED_BOTH);                      // full screen
             form.setVisible(true);
          }
          else if (main.mode.equals(main.MAINTENANCE_IMPORT_DATA))
          {
             // open maintenance import data
             mymaintenancedata form = new mymaintenancedata();
             form.setExtendedState(MAXIMIZED_BOTH);                      // full screen
             form.setVisible(true);
          }
          else if (main.mode.equals(main.MAINTENANCE_EXPORT_DATA))
          {
             // open maintenance export data
             mymaintenancedata form = new mymaintenancedata();
             form.setExtendedState(MAXIMIZED_BOTH);                      // full screen
             form.setVisible(true);
          }
          else if (main.mode.equals(main.GUI_SETTINGS))
          {
             /* open GUI settings input page (light/full interface, Eumetnet/NOAA/SOT logo) */
             myguisettings form = new myguisettings();
             form.setSize(1000, 700);
             form.setVisible(true);
          }
          
       } // if (("TurboWin " + password.trim()).equals("TurboWin JWS" + dummy))
       else // thus password not correct
       {
          JOptionPane.showMessageDialog(null, "Password not valid", main.APPLICATION_NAME + " info", JOptionPane.ERROR_MESSAGE);
       } // else (password not correct)

    }//GEN-LAST:event_OK_button_actionPerformed

    
    
    private void Cancel_button_actionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancel_button_actionPerformed
        // TODO add your handling code here:
       /* close input page */
       setVisible(false);
       dispose();
    }//GEN-LAST:event_Cancel_button_actionPerformed

    
    
    private void Enter_actionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enter_actionPerformed
       // TODO add your handling code here:
       OK_button_actionPerformed(evt);
    }//GEN-LAST:event_Enter_actionPerformed

    
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new mypassword().setVisible(true);
            }
        });
    }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JPasswordField jPasswordField1;
   private javax.swing.JSeparator jSeparator1;
   // End of variables declaration//GEN-END:variables

   //private String local_mode;

}
