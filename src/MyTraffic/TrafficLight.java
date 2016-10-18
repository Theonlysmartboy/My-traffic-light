
package MyTraffic;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.io.*;
import sun.audio.*;
//import javax.swing.ActionListener;
/**
 *
 * @author Maseno
 */
public class TrafficLight extends javax.swing.JFrame {

    private final int nRed = 10;
    private final int nYellow = 5;
    private final int nGreen = 10;
    private Timer timer;
    private int r,y,g,speed;
    /**
     * Creates new form TrafficLight
     */
    public TrafficLight() {
        initComponents();
        start();
    }

    
    private void start(){
         speed = 500; // The speed of the timer 60 second
         r = nRed; 
         y = nYellow;
         g = nGreen;
        ActionListener action = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                if(r>=0){
                red.setText(String.valueOf(r) + ":00");
                r--;
                }
                else if(y>=0){
                    red.setEnabled(false);
                    yellow.setEnabled(true);
                    yellow.setText(String.valueOf(y) + ":00");
                    y--;
                }
                else if(g>=0){
                    
                    yellow.setEnabled(false);
                    green.setEnabled(true);
                    green.setText(String.valueOf(g) + ":00");
                    g--;
                }
                else if(y>=0){
                    green.setEnabled(false);
                    red.setEnabled(false);
                    yellow.setEnabled(true);
                    yellow.setText(String.valueOf(y) + ":00");
                    y--;
                }
                else{
                    red.setEnabled(true);
                    yellow.setEnabled(false);
                    green.setEnabled(false);
                    
                    r = nRed;
                    y = nYellow;
                    g = nGreen;
                }
            }

        };
        timer = new Timer(speed, action);
        timer.start();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        green = new javax.swing.JLabel();
        red = new javax.swing.JLabel();
        yellow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 0, 0));
        setResizable(false);

        green.setBackground(new java.awt.Color(0, 0, 0));
        green.setFont(new java.awt.Font("Digital-7", 1, 36)); // NOI18N
        green.setForeground(new java.awt.Color(255, 204, 51));
        green.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Go.png"))); // NOI18N
        green.setText("00:00");
        green.setEnabled(false);
        green.setFocusable(false);

        red.setBackground(new java.awt.Color(0, 0, 0));
        red.setFont(new java.awt.Font("Digital-7", 1, 36)); // NOI18N
        red.setForeground(new java.awt.Color(255, 204, 51));
        red.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Stop.png"))); // NOI18N
        red.setText("00:00");
        red.setFocusable(false);

        yellow.setBackground(new java.awt.Color(0, 0, 0));
        yellow.setFont(new java.awt.Font("Digital-7", 1, 36)); // NOI18N
        yellow.setForeground(new java.awt.Color(255, 204, 51));
        yellow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ready.png"))); // NOI18N
        yellow.setText("00:00");
        yellow.setEnabled(false);
        yellow.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(red)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yellow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(green)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {green, red, yellow});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(red)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(yellow)
                        .addComponent(green)))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {green, red, yellow});

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TrafficLight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrafficLight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrafficLight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrafficLight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrafficLight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel green;
    private javax.swing.JLabel red;
    private javax.swing.JLabel yellow;
    // End of variables declaration//GEN-END:variables
}
