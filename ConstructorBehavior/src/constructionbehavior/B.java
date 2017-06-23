/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package constructionbehavior;

/**
 *
 * @author 3rd Year Account
 */
public class B extends A{
    boolean z;
    B(){
        this.z = false;
        System.out.println("B: Empty constructor loaded.");
    }
    B(boolean z){
        this.z = z;
        System.out.println("B: Single(boolean) constructor loaded.");
    }
    boolean getZ(){return this.z;}    
}
