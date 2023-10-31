/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.CopyFileDao;

/**
 *
 * @author This PC
 */
public class CopyFileRepository implements ICopyFileRepository{

    @Override
    public void copyFile() {
        CopyFileDao.Instance().copyFile();
    }
    
}
