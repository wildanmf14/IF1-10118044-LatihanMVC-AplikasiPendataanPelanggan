/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmvc.model;

import javax.swing.JOptionPane;
import latihanmvc.event.PelangganListener;

/*
    Nama        : Wildan Muhammad Fikri
    Kelas       : IF1
    NIM         : 10118044
*/
public class PelangganModel {
    private String name, email, noTelp;
    
    private PelangganListener pelangganListener;

    public PelangganListener getPelangganListener() {
        return pelangganListener;
    }

    public void setPelangganListener(PelangganListener pelangganListener) {
        this.pelangganListener = pelangganListener;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireOnChange();
    }
    
    protected void fireOnChange(){
        if(pelangganListener!= null){
            pelangganListener.onChange(this);
        }
    }
    
    public void resetForm(){
        setName("");
        setEmail("");
        setNoTelp("");
    }
    
    public void saveForm(){
        JOptionPane.showMessageDialog(null, "Berhasil disimpan!");
        resetForm();
    }    
}
