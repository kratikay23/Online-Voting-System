/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Election;

import Election.GetConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class candidates extends javax.swing.JFrame {

     Connection con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement st = null;
 

    public candidates() {
        initComponents();
        GetElections(); 
        Display();
        
    }
private void GetElections(){
try{
con =  GetConnection.getConnection();
st = con.createStatement();
String sql = "Select *from election";
Rs = st.executeQuery(sql);
while (Rs.next()){
String Eid =Rs.getString("Eid");
String Ename = Rs.getString("Ename");
Celect.addItem(Eid +" "+ Ename);
}
}
catch(Exception e){
e.printStackTrace();
}
}
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Cparty = new javax.swing.JTextField();
        CandName = new javax.swing.JTextField();
        Cage = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Celect = new javax.swing.JComboBox<>();
        Cgen = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        Main = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ctable = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0,80));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel3.setText("Name  :");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel4.setText("Party  :");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel5.setText("Gender  :");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel6.setText("Age  :");

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel8.setText("Election  :");

        Cparty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpartyActionPerformed(evt);
            }
        });

        Add.setBackground(new java.awt.Color(153, 153, 255));
        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(153, 153, 255));
        edit.setText("EDIT");
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(153, 153, 255));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setText("BACK");

        Celect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CelectActionPerformed(evt);
            }
        });

        Cgen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jButton4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Add)
                                .addGap(71, 71, 71)
                                .addComponent(edit)
                                .addGap(58, 58, 58)
                                .addComponent(delete))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(78, 78, 78)
                                .addComponent(CandName))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Cparty)
                                    .addComponent(Celect, 0, 215, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(66, 66, 66)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cage)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Cgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CandName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Cgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Celect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Cparty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete)
                    .addComponent(edit)
                    .addComponent(Add))
                .addGap(30, 30, 30)
                .addComponent(jButton4)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 430, 360));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0,80));

        Main.setBackground(new java.awt.Color(0, 0, 102));
        Main.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        Main.setForeground(new java.awt.Color(255, 255, 255));
        Main.setText("Main Menu");
        Main.setActionCommand("Candidates");
        Main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainMouseClicked(evt);
            }
        });
        Main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainActionPerformed(evt);
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

        jLabel7.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel7.setText("  MANAGE CANDIDATES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1040, 70));

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
                .addContainerGap(260, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel10)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 100));

        Ctable.setModel(new javax.swing.table.DefaultTableModel(
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
        Ctable.setSelectionBackground(new java.awt.Color(255, 153, 0));
        Ctable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Ctable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Ctable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 520, 379));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel13.setText("Candidate Table");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 102, 0));
        jLabel9.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ONLINE VOTING SYSTEM");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 650, 682, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void Display() {
    try {
        // Establish database connection
        con = GetConnection.getConnection();

        // Prepare the SQL query
        String sql = "SELECT * FROM candidate";
        pst = con.prepareStatement(sql);
        Rs = pst.executeQuery();

        // Set the result to the table model
        Ctable.setModel(DbUtils.resultSetToTableModel(Rs));
    } catch (Exception e) {
        // Display the exception in a dialog
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
    private void CpartyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpartyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CpartyActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
try{
    
         if (CandName.getText().isEmpty()|| Cage.getText().isEmpty()||Cparty.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Please fill all fields.");
                return;
            }           
             con =  GetConnection.getConnection();
             String query = "INSERT INTO candidate(Cname,age,Cgen,Party,Celect) VALUES(?,?,?,?,?)";
             PreparedStatement pst = con.prepareStatement(query);
             
             pst.setString(1,CandName.getText() );
             pst.setInt(2,Integer.parseInt(Cage.getText()) );
             pst.setString(3,Cgen.getSelectedItem().toString() );
             pst.setString(4,Cparty.getText() );
             pst.setString(5,Celect.getSelectedItem().toString());
           
             
             int r = pst.executeUpdate(); 
             if (r> 0) {
                 JOptionPane.showMessageDialog(null, "Record inserted successfully!");
             }
             Display();
        }catch(Exception e){
            JOptionPane. showMessageDialog(null, "Not Inserted!");
          e.printStackTrace();
        }finally{
            try{
                if(con!=null){
                    con.close();
                }
            } catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_AddActionPerformed
int key=-1;
    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
      
         if (key == -1 || CandName.getText().isEmpty() || Cage.getText().isEmpty() || Cparty.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Missing Information");
    } else {
        try {
            con =  GetConnection.getConnection();
            String sql = "UPDATE candidate SET Cname = ?, age = ?, Cgen = ?, Party = ?, Celect = ? WHERE Cid = ?";
            PreparedStatement Usql = con.prepareStatement(sql);
            Usql.setString(1, CandName.getText());
            Usql.setInt(2, Integer.parseInt(Cage.getText()));
            Usql.setString(3, Cgen.getSelectedItem().toString());
            Usql.setString(4, Cparty.getText());
            Usql.setString(5, Celect.getSelectedItem().toString());
            Usql.setInt(6, key); // Ensure 'key' corresponds to the primary key of the table
            int rowsUpdated = Usql.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Candidate Updated Successfully");
                Display();
            } else {
                JOptionPane.showMessageDialog(this, "No record found with the given ID.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error updating candidate: " + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    }//GEN-LAST:event_editActionPerformed

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
         if(key == -1){
            JOptionPane.showMessageDialog(this , "Select the Candidate to be Deleted");
        }else{
        try{
            
            con = GetConnection.getConnection();
            String sql ="Delete from candidate where Cid =  " +key;
            Statement del = con.createStatement();
            del.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"Election Deleted Successfully");
            Display();
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
        }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void MainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainMouseClicked
        // TODO add your handling code here:
        MainMenu m =new MainMenu();
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_MainMouseClicked

    private void MainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MainActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        home hpage = new home();
        hpage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CtableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model =(DefaultTableModel)Ctable.getModel();
        int myindex  = Ctable.getSelectedRow();
        key= Integer.valueOf(model.getValueAt(myindex, 0).toString());
        CandName.setText(model.getValueAt(myindex, 1).toString());
        Cage.setText(model.getValueAt(myindex, 2).toString());
        Cgen.setSelectedItem(model.getValueAt(myindex, 3).toString());
        Cparty.setText(model.getValueAt(myindex, 4).toString());
        Celect.setSelectedItem(model.getValueAt(myindex, 5).toString());

    }//GEN-LAST:event_CtableMouseClicked

    private void CelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CelectActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new candidates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField Cage;
    private javax.swing.JTextField CandName;
    private javax.swing.JComboBox<String> Celect;
    private javax.swing.JComboBox<String> Cgen;
    private javax.swing.JTextField Cparty;
    private javax.swing.JTable Ctable;
    private javax.swing.JButton Main;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
