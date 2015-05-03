/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author shinchank
 */
public class Admin extends Orang{
    private String id;
    private String pass;

    public Admin(String id, String nama, String pass, String noTelp, String alamat, String linkFB) {
        super("A_"+id, nama, noTelp, alamat, linkFB);
        this.id = "A_"+id;
        this.pass = pass;
    } 

    public String getPass() {
        return pass;
    }
    
    @Override
    public void setId(String id){
        super.setId("A_"+id);
    }
    @Override
    public String toString(){
        return super.toString();
    }
       
}
