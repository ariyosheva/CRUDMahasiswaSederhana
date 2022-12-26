/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompanyject.crudmahasiswasederhana;
import com.mycompanyject.crudmahasiswasederhana.views.MahasiswaFrame;
import javax.swing.SwingUtilities;
/**
 *
 * @author lenovo
 */
public class CRUDMahasiswaSederhana {
 public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                MahasiswaFrame form = new MahasiswaFrame();
                form.setLocationRelativeTo(null);
                form.setVisible(true);
            }
        });
    }
}
