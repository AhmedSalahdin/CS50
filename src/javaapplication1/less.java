/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author mostafa
 */
public class less extends javax.swing.JFrame {

    /**
     * Creates new form less
     */
    public less() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        build = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        le = new javax.swing.JTextField();
        jl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        build.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        build.setText("build");
        build.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buildActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("                     less.Mario");

        le.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leActionPerformed(evt);
            }
        });

        jl.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(le)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addComponent(build, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(le, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(build, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buildActionPerformed
        try{
        int n=Integer.parseInt(le.getText());
         if(n==0)
            jl.setText("");
         else  if(n==1)
            jl.setText("##");
         else  if(n==2)
            jl.setText("<HTML>##<br>###<HTML>");
         else  if(n==3)
            jl.setText("<HTML>##<br>###<br>####<HTML>");
         else  if(n==4)
            jl.setText("<HTML>##<br>###<br>####<br>#####<HTML>");
         else  if(n==5)
            jl.setText("<HTML>##<br>###<br>####<br>#####<br>######<HTML>");
         else  if(n==6)
            jl.setText("<HTML>##<br>###<br>####<br>#####<br>######<br>#######<HTML>");
         else  if(n==7)
            jl.setText("<HTML>##<br>###<br>####<br>#####<br>######<br>#######<br>########<HTML>");
         else  if(n==8)
            jl.setText("<HTML>##<br>###<br>####<br>#####<br>######<br>#######<br>########<br>#########<HTML>");
         else  if(n==9)
            jl.setText("<HTML>##<br>###<br>####<br>#####<br>######<br>#######<br>########<br>#########<br>##########<HTML>");
         else  if(n==10)
            jl.setText("<HTML>##<br>###<br>####<br>#####<br>######<br>#######<br>########<br>#########<br>##########<br>###########<HTML>");
         else  if(n==11)
            jl.setText("<HTML>##<br>###<br>####<br>#####<br>######<br>#######<br>########<br>#########<br>##########<br>###########<br>############<HTML>");
         else  if(n==12)
            jl.setText("<HTML>##<br>###<br>####<br>#####<br>######<br>#######<br>########<br>#########<br>##########<br>###########<br>############<br>#############<HTML>");
         else  if(n==13)
            jl.setText("<HTML>##<br>###<br>####<br>#####<br>######<br>#######<br>########<br>#########<br>##########<br>###########<br>############<br>#############<br>##############<HTML>");
         else  if(n==14)
            jl.setText("<HTML>##<br>###<br>####<br>#####<br>######<br>#######<br>########<br>#########<br>##########<br>###########<br>############<br>#############<br>##############<br>###############<HTML>");
         else  if(n==15)
            jl.setText("<HTML>##<br>###<br>####<br>#####<br>######<br>#######<br>########<br>#########<br>##########<br>###########<br>############<br>#############<br>##############<br>###############<br>################<HTML>");
          else if(n==16)
            jl.setText("<HTML>##<br>###<br>####<br>#####<br>######<br>#######<br>########<br>#########<br>##########<br>###########<br>############<br>#############<br>##############<br>###############<br>################<br>#################<HTML>");
         else  if(n==17)
            jl.setText("<HTML>##<br>###<br>####<br>#####<br>######<br>#######<br>########<br>#########<br>##########<br>###########<br>############<br>#############<br>##############<br>###############<br>################<br>#################<br>##################<HTML>");
         else  if(n==18)
            jl.setText("<HTML>##<br>###<br>####<br>#####<br>######<br>#######<br>########<br>#########<br>##########<br>###########<br>############<br>#############<br>##############<br>###############<br>################<br>#################<br>##################<br>###################<HTML>");
         else  if(n==19)
            jl.setText("<HTML>##<br>###<br>####<br>#####<br>######<br>#######<br>########<br>#########<br>##########<br>###########<br>############<br>#############<br>##############<br>###############<br>################<br>#################<br>##################<br>###################<br>####################<HTML>");
         else  if(n==20)
            jl.setText("<HTML>##<br>###<br>####<br>#####<br>######<br>#######<br>########<br>#########<br>##########<br>###########<br>############<br>#############<br>##############<br>###############<br>################<br>#################<br>##################<br>###################<br>####################<br>#####################<HTML>");
         else  if(n==21)
            jl.setText("<HTML>##<br>###<br>####<br>#####<br>######<br>#######<br>########<br>#########<br>##########<br>###########<br>############<br>#############<br>##############<br>###############<br>################<br>#################<br>##################<br>###################<br>####################<br>#####################<br>######################<HTML>");
         else  if(n==22)
            jl.setText("<HTML>##<br>###<br>####<br>#####<br>######<br>#######<br>########<br>#########<br>##########<br>###########<br>############<br>#############<br>##############<br>###############<br>################<br>#################<br>##################<br>###################<br>####################<br>#####################<br>######################<br>#######################<HTML>");
         else  if(n==23)
            jl.setText("<HTML>##<br>###<br>####<br>#####<br>######<br>#######<br>########<br>#########<br>##########<br>###########<br>############<br>#############<br>##############<br>###############<br>################<br>#################<br>##################<br>###################<br>####################<br>#####################<br>######################<br>#######################<br>########################<HTML>");
         else if(n<0)
         {JOptionPane.showMessageDialog(null,"Check your Input","Error",JOptionPane.ERROR_MESSAGE);
         jl.setText(""); 
         le.setText("");
         }
        le.setText("");
        }
        catch(Exception e){
         JOptionPane.showMessageDialog(null,"Check your Input","Error",JOptionPane.ERROR_MESSAGE);
         jl.setText(""); 
         le.setText("");
        }     
    }//GEN-LAST:event_buildActionPerformed

    private void leActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leActionPerformed

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
            java.util.logging.Logger.getLogger(less.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(less.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(less.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(less.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new less().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton build;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jl;
    private javax.swing.JTextField le;
    // End of variables declaration//GEN-END:variables
}
