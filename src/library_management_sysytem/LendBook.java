/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_management_sysytem;

import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author rohit
 */
public class LendBook extends javax.swing.JFrame {

    /**
     * Creates new form LendBook
     */
    User user;
    
    public JTable returntable() {
        return this.allbooktable;
    }
    
    public LendBook(User user) {
        this.user = user;
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allbooktable = new javax.swing.JTable();
        bid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        lend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(60, 60, 60));
        setMaximumSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(60, 60, 60));

        allbooktable.setBackground(new java.awt.Color(255, 255, 255));
        allbooktable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "bookId", "bookName", "authorName", "noOfPages", "dateOfPublish", "bookCopiesCount"
            }
        ));
        jScrollPane1.setViewportView(allbooktable);

        jLabel1.setBackground(new java.awt.Color(60, 60, 60));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BOOK ID");

        back.setBackground(new java.awt.Color(125, 112, 152));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("BACK");
        back.setActionCommand("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        lend.setBackground(new java.awt.Color(125, 112, 152));
        lend.setForeground(new java.awt.Color(255, 255, 255));
        lend.setText("LEND");
        lend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(73, 73, 73)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(bid, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bid, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lend, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void lendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lendActionPerformed
        LibraryDatabase db = new LibraryDatabase();
        String id = bid.getText().trim();
        bid.setText("");
        if (id.length() == 0) {
            JOptionPane.showMessageDialog(null, "Please Enter Book id to lend a book !");
        } else if (db.isBookListcontainsId(Integer.parseInt(id))) {
            if (db.isBookBorrowedByUser(Integer.parseInt(id), user.getId())) {
                JOptionPane.showMessageDialog(null, "Book Already lent !");
                return;
            }
            if (db.isBoolAvailableToBorrow(Integer.parseInt(id))) {
                Calendar calendar = Calendar.getInstance();
                String issueDate = new Library().getDateFormatString(calendar);
                calendar.add(Calendar.DATE, 7);
                String deadlineDate = new Library().getDateFormatString(calendar);
                int issueId = db.addToBookBorrowInfoTable(user.getId(), Integer.parseInt(id), issueDate, deadlineDate);
                if (issueId == -1) {
                    JOptionPane.showMessageDialog(null, "DATABASE ERROR !");
                } else {
                    System.out.println();
                    System.out.println();
                    String message = new Library().printBookIssueDetails(new BookBorrowInfo(issueId, user.getId(), Integer.parseInt(id)));
                    
                    JOptionPane.showMessageDialog(null, "Book successfully issued to you !\n" + "Issue Details are as follows :\n" + message);
                }
            } else {
                int reply = JOptionPane.showConfirmDialog(null, "Would you like to be added into the waitlist of the book", "Book Not Avaialable", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    LibraryDatabase database = new LibraryDatabase();
                    int checkPriorWaitListindex = database.getWaitListposition(user.getId(), Integer.parseInt(id));
                    if (checkPriorWaitListindex != -1) {
                        JOptionPane.showMessageDialog(null, "You are already in the waitlist at : " + checkPriorWaitListindex);
                        return;
                    }
                    database.addToWaitList(user.getId(), Integer.parseInt(id), database.getPriorityLevelFromUserTable(user.getId()));
                    int position = database.getWaitListposition(user.getId(), Integer.parseInt(id));
                    JOptionPane.showMessageDialog(null, "successfully added to book waitlist !\n" + "Your waitlist Number is : " + position);
                    
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Book with that id does not exist !");
        }

    }//GEN-LAST:event_lendActionPerformed

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
            java.util.logging.Logger.getLogger(LendBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LendBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LendBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LendBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LendBook().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allbooktable;
    private javax.swing.JButton back;
    private javax.swing.JTextField bid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lend;
    // End of variables declaration//GEN-END:variables
}
