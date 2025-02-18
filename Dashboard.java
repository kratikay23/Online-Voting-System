/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Election;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement st = null;
    int WinnerId, Votes;

    public Dashboard() {
        initComponents();
        Display();
        GetWinner();
        GetWinnerData();
        GetVotes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        votes = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        result = new javax.swing.JTable();
        winner = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        votes.setFont(new java.awt.Font("Arial Narrow", 3, 48)); // NOI18N
        votes.setForeground(new java.awt.Color(0, 102, 0));
        votes.setText("Votes ");
        getContentPane().add(votes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel7.setText(" Election List");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, -1, -1));

        result.setModel(new javax.swing.table.DefaultTableModel(
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
        result.setRowHeight(25);
        result.setSelectionBackground(new java.awt.Color(255, 153, 51));
        result.setSelectionForeground(new java.awt.Color(255, 255, 255));
        result.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(result);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, 550, 450));

        winner.setFont(new java.awt.Font("Arial Narrow", 3, 48)); // NOI18N
        winner.setForeground(new java.awt.Color(0, 102, 0));
        winner.setText("Winner ");
        getContentPane().add(winner, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 330, 40));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0,80));

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Main Menu");
        jButton2.setActionCommand("Candidates");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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
        jLabel1.setText("DASHBOARD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(jLabel1)
                .addContainerGap(394, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1040, 70));

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel2.setBackground(new java.awt.Color(255, 102, 0));
        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ONLINE VOTING SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void Display() {
        try {
            con = GetConnection.getConnection();
            String sql = "SELECT * FROM election";
            pst = con.prepareStatement(sql);
            Rs = pst.executeQuery();
            result.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        } finally {
            try {
                if (Rs != null) {
                    Rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Dislayed");
    }

    public void GetWinner() {
        try {
            con = GetConnection.getConnection();
            System.out.println("Final ElectID used: " + key);

            String query = "SELECT CandId FROM voteCount WHERE ElectID = ? GROUP BY CandId ORDER BY COUNT(CandId) DESC LIMIT 1";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, key);
            Rs = pst.executeQuery();

            if (Rs.next()) {
                WinnerId = Rs.getInt(1);
                //System.out.println("Winner ID found: " + WinnerId);
                //JOptionPane.showMessageDialog(this, "Winner ID: " + WinnerId);
            } else {
                System.out.println("No winner found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void GetVotes() {
        try {
            con = GetConnection.getConnection();
            System.out.println("Final ElectID used: " + key);
            System.out.println("Winner Id: " + WinnerId);
            String query = "SELECT COUNT(CandId) AS CandId FROM voteCount WHERE CandId=" + WinnerId;
            PreparedStatement pst = con.prepareStatement(query);

            Rs = pst.executeQuery();

            if (Rs.next()) {
                Votes = Rs.getInt(1);
                System.out.println("total votes: " + Votes);
                votes.setText(Votes + "Votes");
            } else {
                System.out.println("No winner found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void GetWinnerData() {
        String Query = "select  Cname from candidate where Cid=" + WinnerId;
        Statement St;

        try {
            con = GetConnection.getConnection();
            st = con.createStatement();
            Rs = st.executeQuery(Query);

            if (Rs.next()) {
                winner.setText(Rs.getString("Cname"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        } finally {
            try {
                if (Rs != null) {
                    Rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    int key = 0;
    private void resultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultMouseClicked
        DefaultTableModel model = (DefaultTableModel) result.getModel();
        int myindex = result.getSelectedRow();

        if (myindex != -1) {
            key = Integer.parseInt(model.getValueAt(myindex, 0).toString()); // Get correct election ID
            System.out.println("Selected Election ID: " + key); // Debugging purpose
            GetWinner();
            GetWinnerData();
            GetVotes();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a valid election row.");
        }

    }//GEN-LAST:event_resultMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MainMenu m = new MainMenu();
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        home hpage = new home();
        hpage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable result;
    private javax.swing.JLabel votes;
    private javax.swing.JLabel winner;
    // End of variables declaration//GEN-END:variables
}
