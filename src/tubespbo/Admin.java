/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author Kelompok 8 Tubes PBO
 */
public class Admin extends Orang{
    private String id;
    private String pass;
    
    /**
     * Cinstructor Admin yang berisi data berikut, sebagai parameternya:
     * @param id
     * @param nama
     * @param pass
     * @param noTelp
     * @param alamat
     * @param linkFB 
     */

    public Admin(String id, String nama, String pass, String noTelp, String alamat, String linkFB) {
        super("A_"+id, nama, noTelp, alamat, linkFB);
        this.id = "A_"+id;
        this.pass = pass;
    } 
    
    /**
     * 
     * @return Password
     */

    public String getPass() {
        return pass;
    }
    
    /**
     * 
     * @param id / username
     */
    
    @Override
    public void setId(String id){
        super.setId("A_"+id);
    }
    
    /**
     * 
     * @return toString
     */
    
    @Override
    public String toString(){
        return super.toString();
    }
       
}
