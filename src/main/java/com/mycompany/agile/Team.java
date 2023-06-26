package com.mycompany.agile;

import java.util.Vector;

/**
 *
 * @author Hecta
 */
public class Team {
    
    private String name;
    
    private Vector<TeamMember> members = new Vector<>();

    /**
     * Constructor
     * @param name - team's name
     */
    public Team(String name) {
        this.name = name;
    }

    public Team() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<TeamMember> getMembers() {
        return members;
    }

    public void setMembers(Vector<TeamMember> members) {
        this.members = members;
    }
    
    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", members=" + members +
                '}';
    }
}
