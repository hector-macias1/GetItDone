package com.mycompany.agile;

/**
 *
 * @author Hecta
 */
public class Story {
    
    private String name;
    private String description;

    /**
     * Constructor
     * @param name - story's name
     * @param description -story's description
     */
    public Story(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    public Story() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return "Story{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
