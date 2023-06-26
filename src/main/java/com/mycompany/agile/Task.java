package com.mycompany.agile;

import java.util.Vector;

/**
 *
 * @author Hecta
 */
public class Task {
    private String name;
    private int ID;
    private String description;
    private String status;

    private Vector<Story> stories = new Vector<>();

    /**
     * Constructor
     * @param name - task's name
     * @param ID - task's ID
     * @param description - task's description
     * @param status - task's status
     */
    public Task(String name, int ID, String description, String status) {
        this.name = name;
        this.ID = ID;
        this.description = description;
        this.status = status;
    }

    public Task(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public Task() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Vector<Story> getStories() {
        return stories;
    }

    public void setStories(Vector<Story> stories) {
        this.stories = stories;
    }
    
    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", stories=" + stories +
                '}';
    }
}
