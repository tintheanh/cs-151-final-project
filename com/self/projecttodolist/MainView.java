/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.self.projecttodolist;

import com.self.projecttodolist.model.MyDateTimeRenderer;
import com.self.projecttodolist.model.Task;
import com.self.projecttodolist.model.TaskComponent;
import com.self.projecttodolist.model.TaskGroup;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.util.Date;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anhnguyen
 */
public class MainView extends javax.swing.JFrame {

    private TaskComponent allTask, homeTask, schoolTask, otherTask, removedTasks, doneTasks, urgentTasks;

    private final String[] tableColumnNames = new String[]{"Title", "Date", "Status", "Category"};

    public MainView() {
        allTask = new TaskGroup("All Task", "Contains all tasks");

        homeTask = new TaskGroup("Home Task", "Tasks at Home");
        schoolTask = new TaskGroup("School Task", "Tasks at School");
        otherTask = new TaskGroup("Other Task", "Other");
        removedTasks = new TaskGroup("Removed Task", "Tasks are removed");
        doneTasks = new TaskGroup("Done Task", "Tasks are done");
        urgentTasks = new TaskGroup("Urgent Task", "Tasks are urgent");

        initComponents();
        allTask.add(homeTask);
        allTask.add(schoolTask);
        allTask.add(otherTask);
        allTask.add(urgentTasks);

        undoneBtn.setVisible(false);

        String taskType = (String) taskTypeSpinner.getSelectedItem();

        tableLabel.setText(taskType);
        
        // Set window appears on middle of screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        homeTask.add(new Task("test", new Date(1574991000000L), new Date(), "Undone", "Home Task", "This is my note"));
        taskTable = new javax.swing.JTable();
        taskTypeSpinner = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        doneBtn = new javax.swing.JButton();
        undoneBtn = new javax.swing.JButton();
        tableLabel = new javax.swing.JLabel();
        seeNoteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        taskTable.setModel(new javax.swing.table.DefaultTableModel(
            homeTask.toTaskGroupArray(),
            tableColumnNames
        ));
        taskTable.getColumnModel().getColumn(1).setCellRenderer(new MyDateTimeRenderer());
        taskTable.setAutoCreateRowSorter(true);
        jScrollPane1.setViewportView(taskTable);

        taskTypeSpinner.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Home Tasks", "School Tasks", "Other Tasks", "All Tasks", "Removed Tasks", "Done Tasks", "Urgent Tasks" }));
        taskTypeSpinner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskTypeSpinnerActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        addBtn.setText("Add new");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Remove");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        doneBtn.setText("Mark done");
        doneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneBtnActionPerformed(evt);
            }
        });

        undoneBtn.setText("Mark undone");
        undoneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoneBtnActionPerformed(evt);
            }
        });

        tableLabel.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        tableLabel.setText("jLabel1");

        seeNoteBtn.setText("See note");
        seeNoteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeNoteBtnActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(taskTypeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(addBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(undoneBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(doneBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(seeNoteBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tableLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(tableLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(taskTypeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(doneBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(undoneBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn)
                        .addGap(32, 32, 32)
                        .addComponent(seeNoteBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void taskTypeSpinnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskTypeSpinnerActionPerformed
        String taskType = (String) taskTypeSpinner.getSelectedItem();
        tableLabel.setText(taskType);
        undoneBtn.setVisible(false);

        deleteBtn.setVisible(true);
        doneBtn.setVisible(true);
        switch (taskType) {
            case "Home Tasks":
                taskTable.setModel(new DefaultTableModel(homeTask.toTaskGroupArray(), tableColumnNames));
                break;
            case "School Tasks":
                taskTable.setModel(new DefaultTableModel(schoolTask.toTaskGroupArray(), tableColumnNames));
                break;
            case "Other Tasks":
                taskTable.setModel(new DefaultTableModel(otherTask.toTaskGroupArray(), tableColumnNames));
                break;
            case "Removed Tasks":
                taskTable.setModel(new DefaultTableModel(removedTasks.toTaskGroupArray(), tableColumnNames));
                deleteBtn.setVisible(false);
                doneBtn.setVisible(false);
                break;
            case "Done Tasks":
                taskTable.setModel(new DefaultTableModel(doneTasks.toTaskGroupArray(), tableColumnNames));
                undoneBtn.setVisible(true);
                doneBtn.setVisible(false);
                break;
            case "Urgent Tasks":
                taskTable.setModel(new DefaultTableModel(urgentTasks.toTaskGroupArray(), tableColumnNames));
                break;
            default:
                taskTable.setModel(new DefaultTableModel(allTask.toAllTaskGroupArray(), tableColumnNames));
                break;
        }
        taskTable.getColumnModel().getColumn(1).setCellRenderer(new MyDateTimeRenderer());
        taskTable.setAutoCreateRowSorter(true);
    }//GEN-LAST:event_taskTypeSpinnerActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String taskType = (String) taskTypeSpinner.getSelectedItem();

        AddTaskView addview = new AddTaskView(taskType, allTask, (DefaultTableModel) taskTable.getModel());
        addview.setVisible(true);
    }//GEN-LAST:event_addBtnActionPerformed
    private String getNoteFromTable(int row, String taskType, String currentTaskType) {
        
        String note = "";
        if (currentTaskType == "Done Tasks") {
            note = doneTasks.getComponent(row).getNote();
            return note;
        }
        if (currentTaskType == "Removed Tasks") {
            note = removedTasks.getComponent(row).getNote();
            return note;
        }
        if (currentTaskType == "Urgent Tasks") {
            note = urgentTasks.getComponent(row).getNote();
            return note;
        }
        if (currentTaskType == "All Tasks") {
            Object[][] all = allTask.toAllTaskGroupArray();
            note = (String) all[row][4];
            return note;
        }
        if (taskType == "Home Task") {
            note = homeTask.getComponent(row).getNote();
        } else if (taskType == "School Task") {
            note = schoolTask.getComponent(row).getNote();
        } else if (taskType == "Other Task") {
            note = otherTask.getComponent(row).getNote();
        } else if (taskType == "Done Task") {
            note = doneTasks.getComponent(row).getNote();
        } else if (taskType == "Removed Task") {
            note = removedTasks.getComponent(row).getNote();
        } else {
            note = urgentTasks.getComponent(row).getNote();
        }
        return note;
    }
    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int originalRow = taskTable.getSelectedRow();
        
        String taskType = (String) taskTypeSpinner.getSelectedItem();

        if (originalRow != -1) {
            int row = taskTable.convertRowIndexToModel(originalRow);
            String title = taskTable.getModel().getValueAt(row, 0).toString();
            LocalDateTime ldate = (LocalDateTime) taskTable.getModel().getValueAt(row, 1);
            String status = taskTable.getModel().getValueAt(row, 2).toString();
            String category = taskTable.getModel().getValueAt(row, 3).toString();

            Date date = Date.from(ldate.atZone(ZoneId.systemDefault()).toInstant());

            String note = getNoteFromTable(row, category, taskType);

            Task removedTask = new Task(title, date, new Date(), status, category, note);

            switch (taskType) {
                case "Home Tasks":
                    homeTask.remove(row);
                    taskTable.setModel(new DefaultTableModel(homeTask.toTaskGroupArray(), tableColumnNames));
                    break;
                case "School Tasks":
                    schoolTask.remove(row);
                    taskTable.setModel(new DefaultTableModel(schoolTask.toTaskGroupArray(), tableColumnNames));
                    break;
                case "Other Tasks":
                    otherTask.remove(row);
                    taskTable.setModel(new DefaultTableModel(otherTask.toTaskGroupArray(), tableColumnNames));
                    break;
                case "Urgent Tasks":
                    urgentTasks.remove(row);
                    taskTable.setModel(new DefaultTableModel(urgentTasks.toTaskGroupArray(), tableColumnNames));
                    break;
                default:
                    allTask.remove(row);
                    taskTable.setModel(new DefaultTableModel(allTask.toAllTaskGroupArray(), tableColumnNames));
                    break;
            }
            removedTasks.add(removedTask);

        }

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void doneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneBtnActionPerformed
        int originalRow = taskTable.getSelectedRow();
        String taskType = (String) taskTypeSpinner.getSelectedItem();

        if (originalRow != - 1) {
            int row = taskTable.convertRowIndexToModel(originalRow);

            String title = taskTable.getModel().getValueAt(row, 0).toString();
            LocalDateTime ldate = (LocalDateTime) taskTable.getModel().getValueAt(row, 1);
            String status = "Done";
            String category = taskTable.getModel().getValueAt(row, 3).toString();

            Date date = Date.from(ldate.atZone(ZoneId.systemDefault()).toInstant());

            

            String note = getNoteFromTable(row, category, taskType);

            Task doneTask = new Task(title, date, new Date(), status, category, note);

            switch (taskType) {
                case "Home Tasks":
                    homeTask.remove(row);
                    taskTable.setModel(new DefaultTableModel(homeTask.toTaskGroupArray(), tableColumnNames));
                    break;
                case "School Tasks":
                    schoolTask.remove(row);
                    taskTable.setModel(new DefaultTableModel(schoolTask.toTaskGroupArray(), tableColumnNames));
                    break;
                case "Other Tasks":
                    otherTask.remove(row);
                    taskTable.setModel(new DefaultTableModel(otherTask.toTaskGroupArray(), tableColumnNames));
                    break;
                default:
                    allTask.remove(row);
                    taskTable.setModel(new DefaultTableModel(allTask.toAllTaskGroupArray(), tableColumnNames));
                    break;
            }
            doneTasks.add(doneTask);
        }
    }//GEN-LAST:event_doneBtnActionPerformed

    private void undoneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoneBtnActionPerformed
        int originalRow = taskTable.getSelectedRow();
        String taskType = (String) taskTypeSpinner.getSelectedItem();

        if (originalRow != - 1) {
            int row = taskTable.convertRowIndexToModel(originalRow);

            String title = taskTable.getModel().getValueAt(row, 0).toString();
            LocalDateTime ldate = (LocalDateTime) taskTable.getModel().getValueAt(row, 1);
            String status = "Undone";
            String category = taskTable.getModel().getValueAt(row, 3).toString();

            String note = getNoteFromTable(row, category, taskType);

            Date date = Date.from(ldate.atZone(ZoneId.systemDefault()).toInstant());

            Task undoneTask = new Task(title, date, new Date(), status, category, note);

            switch (category) {
                case "Home Task":
                    homeTask.add(undoneTask);
                    break;
                case "School Task":
                    schoolTask.add(undoneTask);
                    break;
                default:
                    otherTask.add(undoneTask);
                    break;
            }
            doneTasks.remove(row);
            taskTable.setModel(new DefaultTableModel(doneTasks.toTaskGroupArray(), tableColumnNames));
        }
    }//GEN-LAST:event_undoneBtnActionPerformed

    private void seeNoteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeNoteBtnActionPerformed
        int originalRow = taskTable.getSelectedRow();
        String taskType = (String) taskTypeSpinner.getSelectedItem();
        if (originalRow != - 1) {
            int row = taskTable.convertRowIndexToModel(originalRow);
            String category = taskTable.getModel().getValueAt(row, 3).toString();
            
            String note = getNoteFromTable(row, category, taskType);
            if (note.equals("")) {
                JOptionPane.showMessageDialog(null, "No note.", "Note", JOptionPane.INFORMATION_MESSAGE);
            } else JOptionPane.showMessageDialog(null, note, "Note", JOptionPane.DEFAULT_OPTION);
        } else JOptionPane.showMessageDialog(null, "You must select one task to see the note.", "Information", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_seeNoteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton doneBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton seeNoteBtn;
    private javax.swing.JLabel tableLabel;
    private javax.swing.JTable taskTable;
    private javax.swing.JComboBox<String> taskTypeSpinner;
    private javax.swing.JButton undoneBtn;
    // End of variables declaration//GEN-END:variables
}
