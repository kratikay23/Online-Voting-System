
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Election;
import Election.GetConnection;
import Election.candidates;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class voting extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement st = null;
    public voting() {
        initComponents();
        Display();
        VOTED.setVisible(false);
   }
    int VotingId;
    public voting(int VoterId){ 
        initComponents();
        Display();
        VOTED.setVisible(false);
        VotingId = VoterId;
        JOptionPane.showMessageDialog( this, VotingId);
    }
    
    int Vnum;
   private void Vcheck() {
    try {
        con = GetConnection.getConnection(); // Reopen the connection
        st = con.createStatement();
        Rs = st.executeQuery("SELECT * FROM voteCount WHERE VoterId = " + VotingId);
        if (Rs.next()) {
            Vnum = 1;
        } else {
            Vnum = 0;
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    } finally {
        try {
            if (Rs != null) Rs.close();
            if (st != null) st.close();
            if (con != null) con.close(); 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        VOTED = new javax.swing.JLabel();
        VoteCount = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        VotingTb = new javax.swing.JTable();
        CandiName = new javax.swing.JTextField();
        PartyName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel2.setText("Party Name :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        VOTED.setFont(new java.awt.Font("Baskerville Old Face", 3, 24)); // NOI18N
        VOTED.setForeground(new java.awt.Color(51, 204, 0));
        VOTED.setText("VOTE COUNTED!!");
        getContentPane().add(VOTED, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 240, 40));

        VoteCount.setBackground(new java.awt.Color(153, 153, 255));
        VoteCount.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        VoteCount.setText("VOTE");
        VoteCount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoteCountMouseClicked(evt);
            }
        });
        VoteCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoteCountActionPerformed(evt);
            }
        });
        getContentPane().add(VoteCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 110, 40));

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel7.setText(" Condidate List");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, -1, -1));

        VotingTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        VotingTb.setRowHeight(25);
        VotingTb.setSelectionBackground(new java.awt.Color(255, 153, 51));
        VotingTb.setSelectionForeground(new java.awt.Color(255, 255, 255));
        VotingTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VotingTbMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(VotingTb);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 550, 440));

        CandiName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CandiNameActionPerformed(evt);
            }
        });
        getContentPane().add(CandiName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 190, 40));

        PartyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartyNameActionPerformed(evt);
            }
        });
        getContentPane().add(PartyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 190, 40));

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel9.setText("Candidate Name :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 190, 40));

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));

        jLabel10.setBackground(new java.awt.Color(255, 102, 0));
        jLabel10.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ONLINE VOTING SYSTEM");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 100));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0,80));

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Home");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 0), new java.awt.Color(255, 153, 0)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel1.setText("VOTING PANEL");

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158)
                .addComponent(jLabel1)
                .addContainerGap(338, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1040, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Display() {
    try {
        con = GetConnection.getConnection();
        String sql = "SELECT * FROM candidate";
        pst = con.prepareStatement(sql);
        Rs = pst.executeQuery();
        VotingTb.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(Rs));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    } finally {
        try {
            // Close ResultSet and PreparedStatement
            if (Rs != null) Rs.close();
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
int key =-1;
int Celect;     
    private void VotingTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VotingTbMouseClicked

        DefaultTableModel model =(DefaultTableModel)VotingTb.getModel();
        int myindex  = VotingTb.getSelectedRow();
        key= Integer.valueOf(model.getValueAt(myindex, 0).toString());
        CandiName.setText(model.getValueAt(myindex, 1).toString());
        PartyName.setText(model.getValueAt(myindex, 4).toString());
        Celect= Integer.valueOf(model.getValueAt(myindex, 5).toString());     
    }//GEN-LAST:event_VotingTbMouseClicked

    private void CandiNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CandiNameActionPerformed

    }//GEN-LAST:event_CandiNameActionPerformed

    private void PartyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PartyNameActionPerformed

    private void VoteCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoteCountActionPerformed
    
    }//GEN-LAST:event_VoteCountActionPerformed

    private void VoteCountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoteCountMouseClicked
        Vcheck();
        if(key == -1){
            JOptionPane.showMessageDialog(null, "Select your Candidate");
        }else if(Vnum>0){
            JOptionPane.showMessageDialog(null, "You can not vote twice!!!");
        }
        else{
        try{
            con =  GetConnection.getConnection();
            String sql = "INSERT INTO voteCount  (VoterId, ElectID, CandId)VALUES( ?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1,VotingId);
            pst.setInt(2,Celect);
            pst.setInt(3,key);
            int r = pst.executeUpdate(); 
            VOTED.setVisible(true);
            Display();
            VoteCount.setVisible(false);
            JOptionPane.showMessageDialog(null, "Vote Counted!!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
        }finally{
            try{
                if(con!=null){
                    con.close();
                }
            } catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }
    }//GEN-LAST:event_VoteCountMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
        login l = new login();
        l.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        home hpage = new home();
        hpage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        login log =new login();
        log.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
  public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new voting().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CandiName;
    private javax.swing.JTextField PartyName;
    private javax.swing.JLabel VOTED;
    private javax.swing.JButton VoteCount;
    private javax.swing.JTable VotingTb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}


