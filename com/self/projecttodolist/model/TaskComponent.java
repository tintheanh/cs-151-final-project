/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.self.projecttodolist.model;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author anhnguyen
 */
public abstract class TaskComponent<T> {

    /*
     * ------------------------------------ For TaskGroup
     * ------------------------------------
     */
    public void add(TaskComponent newTaskComponent) {
        throw new UnsupportedOperationException();
    }

    public int getSize() {
        throw new UnsupportedOperationException();
    }

    public void remove(int index) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(int id) {
        throw new UnsupportedOperationException();
    }

    public void removeById(int id) {
        throw new UnsupportedOperationException();
    }

    public TaskComponent getComponent(int componentIndex) {
        throw new UnsupportedOperationException();
    }

    public String getGroupName() {
        throw new UnsupportedOperationException();
    }

    public String getGroupDescription() {
        throw new UnsupportedOperationException();
    }

    public T[][] toTaskGroupArray() {
        throw new UnsupportedOperationException();
    }

    public T[][] toAllTaskGroupArray() {
        throw new UnsupportedOperationException();
    }

    public T[] toTaskArray() {
        throw new UnsupportedOperationException();
    }

    /*
     * ------------------------------------ For Task
     * ------------------------------------
     */
    public int getId() {
        throw new UnsupportedOperationException();
    }

    public String getTitle() {
        throw new UnsupportedOperationException();
    }

    public LocalDateTime getDate() {
        throw new UnsupportedOperationException();
    }

    public String getDateCreated() {
        throw new UnsupportedOperationException();
    }

    public String getStatus() {
        throw new UnsupportedOperationException();
    }

    public String getCategory() {
        throw new UnsupportedOperationException();
    }

    public String getNote() {
        throw new UnsupportedOperationException();
    }

    public void setTitle(String title) {
        throw new UnsupportedOperationException();
    }

    public void setDate(Date date) {
        throw new UnsupportedOperationException();
    }

    public void setDateCreated(Date dateCreated) {
        throw new UnsupportedOperationException();
    }

    public void setId(int id) {
        throw new UnsupportedOperationException();
    }

    public void setStatus(String status) {
        throw new UnsupportedOperationException();
    }

    public void setCategory(String category) {
        throw new UnsupportedOperationException();
    }

    public void setNote(String note) {
        throw new UnsupportedOperationException();
    }

    // For debugging
    public void displayTaskInfo() {
        throw new UnsupportedOperationException();
    }

}
