package com.mycompany.agile;

/**
 *
 * @author Hecta
 */
public class User {
    
    private String name;
    private String ID;
    private String username;
    private String password;

    /**
     * Constructor
     * @param name - user's name
     * @param ID - user's ID
     * @param password - user's password
     */
    public User(String name, String ID, String password) {
        this.name = name;
        this.ID = ID;
        this.password = password;
    }

    public User(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }
    
    public User() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
