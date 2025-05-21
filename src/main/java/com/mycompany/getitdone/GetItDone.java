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
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
    }
}
