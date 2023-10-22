/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;


/**
 *
 * @author riadi
 */

public class Salle  implements Serializable {
    private int id;
    private String code;
    private Machine ma;
    
    public Salle(){
    }
    
     public Salle(String code, Machine ma) {
        this.code = code;
        this.ma=ma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public Machine getMa() {
        return ma;
    }

    public void setMa(Machine ma) {
        this.ma = ma;
    }

    @Override
    public String toString() {
        return "Salle{" + "id=" + id + ", code=" + code + '}';
    }
            
}
