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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

public class Election_Manage extends javax.swing.JFrame {
    private static void setModel(TableModel resultSetToTableModel) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement st1 =null;
    ResultSet Rs1=null;
    public Election_Manage() {
        initComponents();
        DisplayElection();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Elist = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Edate = new com.toedter.calendar.JDateChooser();
        Ename = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Etable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Elist.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        Elist.setText("Election List");
        getContentPane().add(Elist, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 240, 50));

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel7.setText("Election Date :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 150, 40));
        getContentPane().add(Edate, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, 200, 50));
        getContentPane().add(Ename, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 280, 50));

        add.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(255, 102, 0));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 80, 40));

        edit.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 102, 0));
        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 80, 40));

        delete.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 102, 0));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 90, 40));

        Etable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Election ID", "Election Name", "Election Date"
            }
        ));
        Etable.setRowHeight(25);
        Etable.setSelectionBackground(new java.awt.Color(255, 153, 51));
        Etable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        Etable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Etable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 1000, 280));

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        jLabel8.setText("Election Name :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 160, 40));

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        jLabel3.setBackground(new java.awt.Color(255, 102, 0));
        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ONLINE VOTING SYSTEM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(276, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel2.setText("  MANAGE ELECTION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addContainerGap(329, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int Eid =0;
    
    private void ElecCount(){
    try
    {
        st1 =con.createStatement();
        Rs1 = st1.executeQuery("select Max(Eid) from election");
        Rs1.next();
        Eid =Rs1.getInt(1)+1;
    }catch(Exception e)
    {
    }
    }
    private void DisplayElection() {
    try {
        con = GetConnection.getConnection();
        String sql = "SELECT * FROM election";
        pst = con.prepareStatement(sql);
        Rs = pst.executeQuery();
        Etable.setModel(DbUtils.resultSetToTableModel(Rs));
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    } finally {
        try {
            if (Rs != null) Rs.close();
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        
        if(Ename.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please fill all fields.");
        }else{
            try
            {
            con =  GetConnection.getConnection();
            String sql = "INSERT INTO election(Eid ,Ename, Edate) VALUES( ?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            ElecCount();
            pst.setInt(1,Eid);
            pst.setString(2, Ename.getText()); 
            java.util.Date selectedDate = Edate.getDate();
            if (selectedDate == null) 
            {
                JOptionPane.showMessageDialog(null, "Please select a valid date.");
                return;
            }
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
            String formattedDate = sdf.format(selectedDate);
            pst.setString(3, formattedDate);
            int r = pst.executeUpdate(); 
            if (r> 0) 
            {
                JOptionPane.showMessageDialog(null, "Record inserted successfully!");
            }
            DisplayElection();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,e);
            }finally{
                try{
                if(con!=null){
                    con.close();
                }
            } catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
    
        }
    }//GEN-LAST:event_addActionPerformed
int key = -1;
    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
         if(key == -1 || Edate.getDate().toString().isEmpty()){
            JOptionPane.showMessageDialog(this , "Missing Information");
        }else{
        try{
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voterproject?UseSSL=false", "root", "Kratik@23");
            String sql ="Update election set Ename=?,Edate=? where Eid =? " ;
            PreparedStatement Usql = con.prepareStatement(sql);
            Usql.setString(1,Ename.getText());
               java.util.Date selectedDate = Edate.getDate();
if (selectedDate == null) {
    JOptionPane.showMessageDialog(null, "Please select a valid date.");
    return;
}
java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
String formattedDate = sdf.format(selectedDate);
Usql.setString(2, formattedDate);
Usql.setInt(3,key);
Usql.executeUpdate();

//Usql.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"Election Updated Successfully");
            DisplayElection();
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
        }
        }
    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        
        if(key == -1){
            JOptionPane.showMessageDialog(this , "Select the Election to be Deleted");
        }else{
        try{                                     
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/voterproject", "root", "Kratik@23");
            String sql ="Delete from election where Eid =  " +key;
            Statement del = con.createStatement();
            del.executeUpdate(sql);
            JOptionPane.showMessageDialog(this,"Election Deleted Successfully");    
//            con = GetConnection.getConnection();
//            st1=con.executeQuery("SET @new_sid = 0;");
//            st1.executeUpdate("UPDATE spendings SET sid = (@new_sid := @new_sid + 1) ORDER BY sid;");
//            st1.execute("ALTER TABLE spendings AUTO_INCREMENT = 1;");
//            getEntries();
               DisplayElection();
            }
         
        catch(Exception e){
        JOptionPane.showMessageDialog(this, e);
        }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void EtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EtableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model =(DefaultTableModel)Etable.getModel();
        int myindex  = Etable.getSelectedRow();
        key= Integer.valueOf(model.getValueAt(myindex, 0).toString());
        Ename.setText(model.getValueAt(myindex, 1).toString());
        
    }//GEN-LAST:event_EtableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           MainMenu m =new MainMenu();
        m.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        home hpage = new home();
        hpage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Election_Manage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Edate;
    private javax.swing.JLabel Elist;
    private javax.swing.JTextField Ename;
    private javax.swing.JTable Etable;
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
