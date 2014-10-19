/**
 * Project : {PROJECT_NAME}
 * Author  : xzllc2010<xzllc2010@gmail.com> 
 * Date    : Created on 2014/10/19.
 * Describe: Leave something to memory
 */
package strategy_pattern;

public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("Using Bow and Arrow!");
    }
}
