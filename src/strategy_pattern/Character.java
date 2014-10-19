/**
 * Project : {PROJECT_NAME}
 * Author  : xzllc2010<xzllc2010@gmail.com> 
 * Date    : Created on 2014/10/19.
 * Describe: Leave something to memory
 */
package strategy_pattern;

public abstract class Character {

    WeaponBehavior weaponBehavior;

    public Character() {
        this.weaponBehavior = new SwordBehavior();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void fight(){
        weaponBehavior.useWeapon();
    }

    public abstract void Hello();

}
