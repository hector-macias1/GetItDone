package com.mycompany.agile;

/**
 *
 * @author Hecta
 */
public class TeamMember extends User{
    
    private String role;

    /**
     * Constructor
     * @param role - team member role
     * @param name - team member name
     * @param ID - team member ID
     * @param password -team member password
     */
    public TeamMember(String role, String name, String ID, String password) {
        super(name, ID, password);
        this.role = role;
    }

    public TeamMember(String name, String ID) {
        super(name, ID);
    }
    
    public TeamMember() {}

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "TeamMember{" +
                "role='" + role + '\'' +
                ", Name=" + super.getName() +
                '}';
    }
}
