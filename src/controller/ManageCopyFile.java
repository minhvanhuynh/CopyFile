/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Repository.CopyFileRepository;
import Repository.ICopyFileRepository;
import view.Menu;

/**
 *
 * @author This PC
 */
public class ManageCopyFile extends Menu<String>{
    private ICopyFileRepository icf= new CopyFileRepository();
    
    public ManageCopyFile(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                icf.copyFile();
                break;
            case 2:
                System.exit(0);
                break;
        }
    }
    
}
