package com.mycompany.agile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.Vector;
import net.sf.mpxj.ActivityStatus;

import net.sf.mpxj.MPXJException;
import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.Resource;
import net.sf.mpxj.reader.ProjectReader;
import net.sf.mpxj.mpx.MPXWriter;
import net.sf.mpxj.reader.UniversalProjectReader;
import net.sf.mpxj.writer.ProjectWriter;
import net.sf.mpxj.writer.ProjectWriterUtility;

/**
 *
 * @author 
 */
public class Project {
    
    private String title;
    private String ID;
    private String description;
    
    private Customer customer;
    private Team team = new Team();
    
    private Vector<Task> tasks = new Vector<>();

    // Project's path
    private Path path;

    /**
     * Constructor
     * @param title - project's title
     * @param ID - project's ID
     * @param description - project's description
     */
    public Project(String title, String ID, String description) {
        this.title = title;
        this.ID = ID;
        this.description = description;
    }

    public Project() {}
    
    /**
     *
     * @param path - file's path
     * @throws MPXJException - throw an mpxj type exception
     */
    public void load(Path path) throws MPXJException {
        // We create a universal reader
        ProjectReader reader = new UniversalProjectReader();
        ProjectFile project = reader.read(path.toString());
        
        // We iterate through the file's tasks
        for (net.sf.mpxj.Task task : project.getTasks()) {
            ///////////////////
            task.setActivityStatus(ActivityStatus.COMPLETED);
            // We import the file's tasks to our tasks
            this.tasks.add(new Task(task.getName(), task.getID()));
            System.out.println("Task: " + task.getName() + " ID=" + task.getID()
                    + " Unique ID=" + task.getID());
        }

        // Import the file's resources
        for (Resource resource : project.getResources()) {
            this.team.getMembers().add(new TeamMember(resource.getName(), resource.getUniqueID().toString()));
            System.out.println("Resource: " + resource.getName()
                    + " (Unique ID=" + resource.getUniqueID() + ")");
        }
    }

    public void write(Path path) throws MPXJException, IOException {
        // Create a new Project File
        ProjectFile projectFile = new ProjectFile();
        
        // Iterate through the tasks and add them to the project file
        for (Task task : this.tasks) {
            net.sf.mpxj.Task mpxjTask = projectFile.addTask();
            mpxjTask.setName(task.getName());
            mpxjTask.setID(task.getID());
        }

        // Iterate through the team members and add them as resources to the project file
        for (TeamMember teamMember : this.team.getMembers()) {
            Resource resource = projectFile.addResource();
            resource.setName(teamMember.getName());
            resource.setUniqueID(Integer.parseInt(teamMember.getID()));
        }
        
        ProjectWriter writer = new MPXWriter();
            
        try (FileOutputStream fos = new FileOutputStream(path.toFile())) {
            writer.write(projectFile, fos);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Vector<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Vector<Task> tasks) {
        this.tasks = tasks;
    }

    public Path getPath() {
        return path;
    }

    public void setPath(Path path) {
        this.path = path;
    }
    
    

    @Override
    public String toString() {
        return "Project{" +
                "title='" + title + '\'' +
                ", ID='" + ID + '\'' +
                ", description='" + description + '\'' +
                ", team=" + team +
                ", tasks=" + tasks +
                '}';
    }
}
