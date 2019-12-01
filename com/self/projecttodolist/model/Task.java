/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.self.projecttodolist.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author anhnguyen
 */
public class Task<T> extends TaskComponent {

    private String title;
    private Date date;
    private Date dateCreated;
    private String status;
    private String category;
    private String note;

    public Task(String title, Date date, Date dateCreated, String status, String category, String note) {
        this.title = title;
        this.date = date;
        this.dateCreated = dateCreated;
        this.status = status;
        this.category = category;
        this.note = note;
    }

    @Override
    public String getTitle() {
        return title;
    }
    
    @Override
    public String getNote() {
        return note;
    }

    @Override
    public LocalDateTime getDate() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        
        return LocalDateTime.of(year, month, day, hour, min);
    }
    
    @Override
    public String getDateCreated() {
        DateFormat df = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
        return df.format(dateCreated);
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public String getCategory() {
        return category;
    }
    
    @Override
    public T[] toTaskArray() {
        return (T[]) new Object[] {getTitle(), getDate(), getStatus(), getCategory(), getNote()};
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
    }
    
    @Override
    public void setNote(String note) {
        this.note = note;
    }
    
    @Override
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    public void displayTaskInfo() {
        System.out.println(getTitle());
    }

}
