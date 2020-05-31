/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password;

import java.security.MessageDigest;

/**
 *
 * @author Dávid
 */
public class Password {
    
    public static  String pass( String pass) throws Exception{
        MessageDigest md=MessageDigest.getInstance("md5");
        md.update(pass.getBytes());
        byte[] b=md.digest();
        StringBuffer sb=new StringBuffer();
        for (byte c : b) {
            sb.append(Integer.toHexString(c & 0xff).toString());
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            pass("admin");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println(":)");
        System.out.println("asdas");
    }
    
}
