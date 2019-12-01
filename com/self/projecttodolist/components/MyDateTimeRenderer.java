/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.self.projecttodolist.components;

import java.awt.Component;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author anhnguyen
 */
public class MyDateTimeRenderer implements TableCellRenderer{
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/uuuu hh:mm a");

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {  
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        String formattedDateTime = ((LocalDateTime) value).format(formatter);
        Component c = renderer.getTableCellRendererComponent(table, formattedDateTime, isSelected, hasFocus, row, column);
        return c;
    }
}
