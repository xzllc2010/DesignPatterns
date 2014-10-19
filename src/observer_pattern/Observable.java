/**
 * Project : {PROJECT_NAME}
 * Author  : xzllc2010<xzllc2010@gmail.com> 
 * Date    : Created on 2014/10/19.
 * Describe: Leave something to memory
 */
package observer_pattern;

public interface Observable {
    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();

}
