/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.self.projecttodolist.model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author anhnguyen
 */
public class TaskGroup<T> extends TaskComponent {

    ArrayList<TaskComponent> taskComponents = new ArrayList<>();

    private String groupName;
    private String groupDescription;

    public TaskGroup(String newGroupName, String newGroupDescription) {
        groupName = newGroupName;
        groupDescription = newGroupDescription;
    }

    @Override
    public int getSize() {
        return taskComponents.size();
    }

    @Override
    public String getGroupName() {
        return groupName;
    }

    @Override
    public String getGroupDescription() {
        return groupDescription;
    }

    @Override
    public void add(TaskComponent newTaskComponent) {
        taskComponents.add(newTaskComponent);
    }

    @Override
    public TaskComponent getComponent(int componentIndex) {
        return (TaskComponent) taskComponents.get(componentIndex);
    }

    @Override
    public void remove(int index) {
        taskComponents.remove(index);
    }

    @Override
    public void removeById(int id) {
        int index = -1;
        for (int i = 0; i < taskComponents.size(); i++) {
            if (taskComponents.get(i).getId() == id) index = i;
        }
        if (index != -1) taskComponents.remove(index);
    }

    @Override
    public void displayTaskInfo() { // For debugging
        System.out.println(getGroupName() + " " + getGroupDescription() + "\n");
        Iterator taskIterator = taskComponents.iterator();

        while (taskIterator.hasNext()) {
            TaskComponent taskInfo = (TaskComponent) taskIterator.next();
            taskInfo.displayTaskInfo();
        }

    }

    @Override
    public T[][] toTaskGroupArray() {
        Object[][] array = new Object[taskComponents.size()][];

        for (int i = 0; i < taskComponents.size(); i++) {
            TaskComponent task = taskComponents.get(i);
            array[i] = task.toTaskArray();
        }

        return (T[][]) array;
    }

    @Override
    public T[][] toAllTaskGroupArray() {
        int totalSize = 0;
        for (int i = 0; i < taskComponents.size() - 1; i++) {
            totalSize += taskComponents.get(i).getSize();
        }

        Object[][] array = new Object[totalSize][];

        int count = 0;
        for (int i = 0; i < taskComponents.size() - 1; i++) {
            Object[][] tasks = taskComponents.get(i).toTaskGroupArray();
            for (int j = 0; j < tasks.length; j++) {
                array[count] = tasks[j];
                count++;
            }
        }

        return (T[][]) array;
    }
}
