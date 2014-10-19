/**
 * Project : {PROJECT_NAME}
 * Author  : xzllc2010<xzllc2010@gmail.com> 
 * Date    : Created on 2014/10/19.
 * Describe: Leave something to memory
 */
package strategy_pattern;

public class Main {

    public static void main(String[] args){
        Character king = new King();
        king.Hello();
        king.fight();
        king.setWeaponBehavior(new BowAndArrowBehavior());
        king.fight();
    }
}
