package turbowin;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martin
 */
public class DASHBOARD_view_AWS_digital extends javax.swing.JFrame {
   
   /* inner class popupListener */
   class PopupListener extends MouseAdapter 
   {
      @Override
      public void mousePressed(MouseEvent e) 
      {
         maybeShowPopup(e);
         //System.out.println("Popup menu will be visible!");
      }
      @Override
      public void mouseReleased(MouseEvent e) 
      {
         maybeShowPopup(e);
      }

      private void maybeShowPopup(MouseEvent e) 
      {
         if (e.isPopupTrigger()) 
         {
            popup.show(e.getComponent(), e.getX(), e.getY());
         }
      }
   }      

   
   
   /***********************************************************************************************/
   /*                                                                                             */
   /*                                                                                             */
   /*                                                                                             */
   /***********************************************************************************************/   
   private void initComponents1()
   {
      /* background color main panel (set by main menu theme option) */
      if (main.theme_mode.equals(main.THEME_NIMBUS_NIGHT))
      {
         night_vision = true;
         
         background_color_panel1 = jPanel1.getBackground();
         background_color_panel2 = Color.LIGHT_GRAY;
         background_color_panel3 = Color.LIGHT_GRAY;
         background_color_panel4 = Color.LIGHT_GRAY;
         background_color_panel5 = Color.LIGHT_GRAY;
              
         jPanel1.setBackground(Color.DARK_GRAY);
         jPanel2.setBackground(Color.BLACK);
         jPanel3.setBackground(Color.BLACK);
         jPanel4.setBackground(Color.BLACK);
         jPanel5.setBackground(Color.BLACK); 
      }
      else
      {
         night_vision = false;
         
         //background_color_panel1 = jPanel1.getBackground();
         background_color_panel1 = jPanel4.getBackground();    // jPanel4 = left panel (but could also be another (site)panel)
         jPanel1.setBackground(background_color_panel1); 
         
         background_color_panel2 = jPanel2.getBackground();
         background_color_panel3 = jPanel3.getBackground();
         background_color_panel4 = jPanel4.getBackground();
         background_color_panel5 = jPanel5.getBackground();
      } 
   
      
      /* background color main panel (set by popup menu option) */
      popup = new JPopupMenu();
      
      JMenuItem menuItem = new JMenuItem("night colours");
      menuItem.addActionListener(new java.awt.event.ActionListener() 
      {
         @Override
         public void actionPerformed(ActionEvent e) 
         {
            night_vision = true;
       
            jPanel1.setBackground(Color.DARK_GRAY); 
            jPanel2.setBackground(Color.BLACK);
            jPanel3.setBackground(Color.BLACK);
            jPanel4.setBackground(Color.BLACK);
            jPanel5.setBackground(Color.BLACK); 
         }
      });
      popup.add(menuItem);
      
      JMenuItem menuItem2 = new JMenuItem("day colours");
      menuItem2.addActionListener(new java.awt.event.ActionListener() 
      {
         @Override
         public void actionPerformed(ActionEvent e) 
         {
            night_vision = false;
            
            jPanel1.setBackground(background_color_panel1); 
            jPanel2.setBackground(background_color_panel2);
            jPanel3.setBackground(background_color_panel3);
            jPanel4.setBackground(background_color_panel4);
            jPanel5.setBackground(background_color_panel5); 
         }
      });
      popup.add(menuItem2);   
      
      
      MouseListener popupListener = new DASHBOARD_view_AWS_digital.PopupListener();
      addMouseListener(popupListener);
      
      
      // title
      setTitle(main.APPLICATION_NAME + " Automatic Weather Station Dashboard [digital]");
   
      // NB see below, otherwise if you select Dashboard -> AWS for the second, third or xth time it wil first display the situation 
      //    of the moment that the dasboard was closed, and after approx 1 minute it will be updated. 
      //    NOW it will update the dashboard immediately
      jPanel1.repaint();     
   }
     
   
 
   /***********************************************************************************************/
   /*                                                                                             */
   /*                                                                                             */
   /*                                                                                             */
   /***********************************************************************************************/   
/*   
   private int copy_digital_font_file()
   {
      int format_101_module_status = 0;
      boolean doorgaan = true;
      String info = "";
     
      
      // NB the complete instantiation of class format_101 is already done in a swingworker! so not necessary to use a swingworker here for file copying etc.
      
      // NB in offline_mode:  logs_dir = user_dir + java.io.File.separator + OFFLINE_LOGS_DIR;
      // NB in logs_dir always 'user_dir' already present (so a complete path)
      
      
      // check if logs folder exists (because this will be the root folder of all the format_101 dirs and files)
      if (main.logs_dir.trim().equals("") == true || main.logs_dir.trim().length() < 2)
      {
         doorgaan = false;
         info = "logs folder unknown, select: Maintenance -> Log files settings and retry";
         JOptionPane.showMessageDialog(null, info, main.APPLICATION_NAME + " error", JOptionPane.WARNING_MESSAGE);
      }
      
      
      // check if compression exe exists, if not create all format 101 dirs (again) and copy all the necessary format 101 fiies
      if (doorgaan == true)
      {
         // NB e.g. exeFile = "C:\Program Files (x86)\TurboWin+\logs\format_101\teste_hc_TW.exe"
         final File exeFile = new File(main.logs_dir + java.io.File.separator + DASHBOARD_grafiek_AWS_digital.DIGITAL_FONT_DIR + java.io.File.separator + DASHBOARD_grafiek_AWS_digital.digital_font);
         if (exeFile.exists() == false)
         {
            // create format 101 (sub)dirs and copy all the necessary files from the turbowin_jws.jar resource to the newly created dirs
            //
            //info = "--- start copying complete format 101 module from jar to: " + main.logs_dir;
            //System.out.println(info);   
            main.log_turbowin_system_message("[DASHBOARD] start copying digital font file from jar to: " + main.logs_dir + java.io.File.separator + DASHBOARD_grafiek_AWS_digital.DIGITAL_FONT_DIR);
            
            // message (because it could be that virus scanner is complaining about compression exe (teste_hc_TW.exe))
            //String info_message = "format 101 module will be copied from source to destination\n note: in case you get a warning of your virus scanner, " + COMPRESSION_EXE + " and " + DECOMPRESSION_EXE + " are essential parts of " + main.APPLICATION_NAME + " !";
            //JOptionPane.showMessageDialog(null, info_message, main.APPLICATION_NAME + " info", JOptionPane.WARNING_MESSAGE);
            // note veplaatst naar obsformat.java (i.v.m messagebox niet goed in APR mode)
            
            // create dir "digital_font" (e.g. "C:\Program Files (x86)\TurboWin+\logs\digital_font")
            //
            String digital_font_dir = main.logs_dir + java.io.File.separator + DASHBOARD_grafiek_AWS_digital.DIGITAL_FONT_DIR;
            final File dir_digital_font = new File(digital_font_dir);   
            dir_digital_font.mkdir();
                    
            // create sub dir "format_101\config" (e.g. "C:\Program Files (x86)\TurboWin+\logs\format_101\config")
            //
            String format_101_config_dir = main.logs_dir + java.io.File.separator + main.FORMAT_101_ROOT_DIR + java.io.File.separator + FORMAT_101_CONFIG_DIR;
            final File dir_format_101_config = new File(format_101_config_dir);  
            dir_format_101_config.mkdir();
                    
            // create sub dir "format_101\log" (e.g. "C:\Program Files (x86)\TurboWin+\logs\format_101\log")  
            //
            String format_101_log_dir = main.logs_dir + java.io.File.separator + main.FORMAT_101_ROOT_DIR + java.io.File.separator + FORMAT_101_LOG_DIR;
            final File dir_format_101_log = new File(format_101_log_dir);            
            dir_format_101_log.mkdir();
            
            // create sub dir "format_101\temp" (e.g. "C:\Program Files (x86)\TurboWin+\logs\format_101\temp")
            //
            String format_101_temp_dir = main.logs_dir + java.io.File.separator + main.FORMAT_101_ROOT_DIR + java.io.File.separator + main.FORMAT_101_TEMP_DIR;
            final File dir_format_101_temp = new File(format_101_temp_dir);            
            dir_format_101_temp.mkdir();
                    

            // copy compression exe file (e.g teste_hc_TW.exe or teste_hc_TW_64)
            //
            try (InputStream is = getClass().getResourceAsStream(main.FORMAT_101_ROOT_DIR + "/" + compression_exe);  // NB in jar file: java.io.File.separator DO NOT WORK UNDER WINDOWS, MUST BE "/" !!!!!
                 OutputStream os = new FileOutputStream(main.logs_dir + java.io.File.separator + main.FORMAT_101_ROOT_DIR + java.io.File.separator + compression_exe)   
                ) 
            {
               // NB try-with-resource; resources (is and os) will be closed automatically when execution leaves the try block.
               
               int readBytes;
               byte[] buffer = new byte[4096];

               while ((readBytes = is.read(buffer)) > 0) 
               {
                  os.write(buffer, 0, readBytes);
               }
               
                    
               //info = "--- success when copying " + COMPRESSION_EXE + " from jar to: " + main.logs_dir + java.io.File.separator + main.FORMAT_101_ROOT_DIR + java.io.File.separator + COMPRESSION_EXE;
               //System.out.println(info);
               main.log_turbowin_system_message("[FORMAT-101] success when copying " + compression_exe + " from jar to: " + main.logs_dir + java.io.File.separator + main.FORMAT_101_ROOT_DIR + java.io.File.separator + compression_exe);
            }
            catch (IOException ex) 
            {
               //info = "+++ error when copying " + COMPRESSION_EXE + " from jar to: " + main.logs_dir + java.io.File.separator + main.FORMAT_101_ROOT_DIR + java.io.File.separator + COMPRESSION_EXE;
               //System.out.println(info);
               main.log_turbowin_system_message("[FORMAT-101] error when copying " + compression_exe + " from jar to: " + main.logs_dir + java.io.File.separator + main.FORMAT_101_ROOT_DIR + java.io.File.separator + compression_exe);
            } 
*/   
   
   
   
   /**
    * Creates new form DASHBOARD_view_AWS_digital
    */
   public DASHBOARD_view_AWS_digital() 
   {
      initComponents();
      initComponents1();
      init_dasboard_AWS_digital_timer();
      
      if (main.theme_mode.equals(main.THEME_TRANSPARENT))   
      {
         setOpacity(0.75f);
      } // else if (theme_mode.equals(THEME_TRANSPARENT))  
   }

   
   
   /**
    * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form
    * Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel5 = new javax.swing.JPanel();
      jPanel4 = new javax.swing.JPanel();
      jPanel3 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jButton1 = new javax.swing.JButton();
      jPanel2 = new javax.swing.JPanel();
      jLabel2 = new javax.swing.JLabel();
      /*
      jPanel1 = new javax.swing.JPanel();
      */jPanel1 = new DASHBOARD_grafiek_AWS_digital();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      addWindowListener(new java.awt.event.WindowAdapter() {
         public void windowClosed(java.awt.event.WindowEvent evt) {
            Dashboard_view_AWS_digital_windowClosed(evt);
         }
         public void windowDeiconified(java.awt.event.WindowEvent evt) {
            Dashboard_view_AWS_digital_windowDeiconified(evt);
         }
      });

      jPanel5.setPreferredSize(new java.awt.Dimension(10, 620));

      javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
      jPanel5.setLayout(jPanel5Layout);
      jPanel5Layout.setHorizontalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 10, Short.MAX_VALUE)
      );
      jPanel5Layout.setVerticalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 620, Short.MAX_VALUE)
      );

      getContentPane().add(jPanel5, java.awt.BorderLayout.EAST);

      jPanel4.setPreferredSize(new java.awt.Dimension(10, 620));

      javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
      jPanel4.setLayout(jPanel4Layout);
      jPanel4Layout.setHorizontalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 10, Short.MAX_VALUE)
      );
      jPanel4Layout.setVerticalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 620, Short.MAX_VALUE)
      );

      getContentPane().add(jPanel4, java.awt.BorderLayout.WEST);

      jPanel3.setPreferredSize(new java.awt.Dimension(1124, 40));

      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
      jLabel1.setText("--- right click for night colors ---");

      jLabel3.setText("--- meters updated every minute ---");

      jButton1.setText("make visual observation");
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            make_observation_actionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(260, 260, 260)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
            .addGap(260, 260, 260)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel1)
               .addComponent(jLabel3)
               .addComponent(jButton1))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

      jPanel2.setPreferredSize(new java.awt.Dimension(1124, 40));

      jLabel2.setText("--- Pressure MSL = 1 min average at MSL. Pressure read, Temp, RH and SST = 1 min average at sensor height. Wind speed and dir = 10 min average at sensor height. Wind gust = max wind in last 10 min at sensor height ---");
      jLabel2.setToolTipText("");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1175, Short.MAX_VALUE)
            .addContainerGap())
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addContainerGap(15, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
      );

      getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

      jPanel1.setBackground(new java.awt.Color(255, 250, 240));
      jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
      jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
         public void componentResized(java.awt.event.ComponentEvent evt) {
            Dashboard_AWS_digital_componentResizedHandler(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 1175, Short.MAX_VALUE)
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 620, Short.MAX_VALUE)
      );

      getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

      pack();
   }// </editor-fold>//GEN-END:initComponents

   
   
/***********************************************************************************************/
/*                                                                                             */
/*                                                                                             */
/*                                                                                             */
/***********************************************************************************************/   
   private void Dashboard_AWS_digital_componentResizedHandler(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_Dashboard_AWS_digital_componentResizedHandler
      // TODO add your handling code here:
      
      System.out.println("--- AWS Dashboard digital (jPanel1) size = " + DASHBOARD_view_AWS_digital.jPanel1.getSize());
      width_AWS_digital_dashboard = jPanel1.getWidth();
      height_AWS_digital_dashboard = jPanel1.getHeight();
      
      jPanel1.repaint();  
   }//GEN-LAST:event_Dashboard_AWS_digital_componentResizedHandler

   
   
   /***********************************************************************************************/
   /*                                                                                             */
   /*                                                                                             */
   /*                                                                                             */
   /***********************************************************************************************/      
   private void make_observation_actionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_make_observation_actionPerformed
      // TODO add your handling code here:
      if (main.mainClass != null)
      {   
          if ((turbowin.main.ICONIFIED & main.mainClass.getExtendedState()) == turbowin.main.ICONIFIED)
         {
            if (turbowin.main.trayIcon != null)
            {
               main.mainClass.tray.remove(turbowin.main.trayIcon) ; 
               //System.out.println("remove icon");
            }
         }
         
         main.mainClass.setExtendedState(NORMAL);
         main.mainClass.setVisible(true); 
         
      } // if (main.mainClass != null)      
      
   }//GEN-LAST:event_make_observation_actionPerformed

   
   
   /***********************************************************************************************/
   /*                                                                                             */
   /*                                                                                             */
   /*                                                                                             */
   /***********************************************************************************************/    
   private void Dashboard_view_AWS_digital_windowDeiconified(java.awt.event.WindowEvent evt)//GEN-FIRST:event_Dashboard_view_AWS_digital_windowDeiconified
   {//GEN-HEADEREND:event_Dashboard_view_AWS_digital_windowDeiconified
      // TODO add your handling code here:
      
      System.out.println("--- AWS Dashboard digital (jPanel1) deiconified");
      jPanel1.repaint();       
   }//GEN-LAST:event_Dashboard_view_AWS_digital_windowDeiconified

   
   
   /***********************************************************************************************/
   /*                                                                                             */
   /*                                                                                             */
   /*                                                                                             */
   /***********************************************************************************************/   
   private void Dashboard_view_AWS_digital_windowClosed(java.awt.event.WindowEvent evt) {                                                 
      // TODO add your handling code here:
      
      if (dashboard_update_AWS_digital_timer_is_gecreeerd == true)  
      {
         if (dashboard_update_AWS_digital_timer.isRunning())
         {
            dashboard_update_AWS_digital_timer.stop();
         }
      }
      
      dashboard_update_AWS_digital_timer = null;
      
      dashboard_update_AWS_digital_timer_is_gecreeerd = false;         
   }       
   
   
   
/***********************************************************************************************/
/*                                                                                             */
/*                                                                                             */
/*                                                                                             */
/***********************************************************************************************/
private void init_dasboard_AWS_digital_timer()
{
   // updating/displaying received AWS sensor data (not from file), timer scheduled
   //
   // called from: DASHBOARD_view_AWS_digital() [DASHBOARD_view_AWS_digital.java]
   
   ActionListener update_dashboard_AWS_digital_action = new ActionListener()
   {
      @Override
      public void actionPerformed(ActionEvent e)
      {
         jPanel1.repaint();                                                        // main panel
      } 
   };  


   // main loop for updating AWS digital dashboard
   dashboard_update_AWS_digital_timer = new Timer(DELAY_UPDATE_AWS_DIGITAL_SENSOR_LOOP, update_dashboard_AWS_digital_action);
   dashboard_update_AWS_digital_timer.setRepeats(true);                                               // false = only one action
   dashboard_update_AWS_digital_timer.setInitialDelay(INITIAL_DELAY_UPDATE_AWS_DIGITAL_SENSOR_LOOP);  // time in millisec to wait after timer is started to fire first event
   dashboard_update_AWS_digital_timer.setCoalesce(true);                                              // by default true, but to be certain
   dashboard_update_AWS_digital_timer.restart();
   dashboard_update_AWS_digital_timer_is_gecreeerd = true;
}   
   
 
   
   
   
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
      } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(DASHBOARD_view_AWS_digital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      
        //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         @Override
         public void run() {
            new DASHBOARD_view_AWS_digital().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   public static javax.swing.JButton jButton1;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   public static javax.swing.JLabel jLabel3;
   /*
   private static javax.swing.JPanel jPanel1;
   */private static DASHBOARD_grafiek_AWS_digital jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JPanel jPanel4;
   private javax.swing.JPanel jPanel5;
   // End of variables declaration//GEN-END:variables



  // Martin var's
   private final int DELAY_UPDATE_AWS_DIGITAL_SENSOR_LOOP                 = 60000; // 1 min                          // time in millisec to wait after timer is started to fire first event (10 min = 10 * 1000 * 60 * 10 = 600000)
   private final int INITIAL_DELAY_UPDATE_AWS_DIGITAL_SENSOR_LOOP         = 0; // 1000 = 1 sec              // time in millisec to wait after timer is started to fire first event
   public static Timer dashboard_update_AWS_digital_timer;
   public static boolean dashboard_update_AWS_digital_timer_is_gecreeerd;

   //public static Timer dashboard_update_timer_AWS_digital;
   //public static boolean dashboard_update_timer_AWS_digital_is_gecreeerd;
   public static boolean night_vision;
   private JPopupMenu popup;
   private static Color background_color_panel1;
   private static Color background_color_panel2;
   private static Color background_color_panel3;
   private static Color background_color_panel4;
   private static Color background_color_panel5;
   
   public static int width_AWS_digital_dashboard;
   public static int height_AWS_digital_dashboard;


}
