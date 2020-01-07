/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmvc.controller;

import javax.swing.JOptionPane;
import latihanmvc.model.PelangganModel;
import latihanmvc.view.PelangganView;

/*
    Nama        : Wildan Muhammad Fikri
    Kelas       : IF1
    NIM         : 10118044
*/
public class PelangganController {
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetForm(PelangganView view){
        String name = view.getNameField().getText();
        String email = view.getEmailField().getText();
        String noTelp = view.getTelpField().getText();
        
        if (name.equals("") && email.equals("") && noTelp.equals("")) {

        } else {

            model.resetForm();
        }

    }
    
    public void saveForm(PelangganView view){
        String name = view.getNameField().getText();
        String email = view.getEmailField().getText();
        String noTelp = view.getTelpField().getText();
        
        if (name.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Nama Masih Kosong");
        } else if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "Email Masih Kosong");
        } else if (noTelp.trim().equals("")) {
            JOptionPane.showMessageDialog(view, "No. Telepon Masih Kosong");
        } else {
            model.saveForm();
        }
    }
}
