/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package constructionbehavior;

/**
 *
 * @author 3rd Year Account
 */
public class ADemo {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A("hi");
        A a2 = new A(1);
        A a3 = new A("hi",1);
        
        a.setX("hi");
        a.setY(1);
        a.getX();
        a.getY();
        
        a1.setX("hi");
        a1.setY(1);
        a1.getX();
        a1.getY();
        
        a2.setX("hi");
        a2.setY(1);
        a2.getX();
        a2.getY();
    
        a3.setX("hi");
        a3.setY(1);
        a3.getX();
        a3.getY();
    }
}
