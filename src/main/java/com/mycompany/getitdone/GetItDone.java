/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.getitdone;

import com.mycompany.UI.MainMenu;
import com.mycompany.agile.Project;
import com.mycompany.agile.Task;
import com.mycompany.agile.TeamMember;
import java.io.IOException;
import net.sf.mpxj.MPXJException;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Hecta
 */
public class GetItDone {

    public static void main(String[] args) throws MPXJException, IOException {
        /*Project project = new Project("Project1", "1234", "a test");
        project.CreateTeam("B");

        Path path = Paths.get("C:/Users/Hecta/Desktop/Project1.mpp");

        project.load(path);

        System.out.println(project);*/
        
        /*TeamMember newguy = new TeamMember("worker", "Hector", "7654", "admin");
        Task newTask = new Task("Name", 1234567, "description3", "Active");
        
        project.getTeam().getMembers().add(newguy);
        project.getTasks().add(newTask);
        
        project.write(path);*/
        
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
    }
}
