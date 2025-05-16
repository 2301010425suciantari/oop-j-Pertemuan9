/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan.pkg901;

/**
 *
 * @author suciantari
 * TGL 16 Mei 2025
 */
public class mahasiswa {
    private String nim, jk;
    protected String nama;
    
    public void setNIM(String nval){
       this.nim = nval; 
    }
    public void setJK(String nval){
       this.jk = nval; 
    }
    public String getNIM(){
        return this.nim;
    }
    public String getJK(){
        return this.jk;
    }
}
