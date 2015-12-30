package org.llh.test;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * 描    述:<br/>
 * 作    者:lilianghui<br/>
 * 日    期:2015年11月22日下午9:58:17<br/>
 * 版权所有:idsoy.com<br/>
 * 版    本:V1.0<br/>
 */
public class Model {

	/**
     * Convenience class that allow others to observe changes to the model properties
     */
    protected PropertyChangeSupport propertyChangeSupport;

    /**
     * Default constructor. Instantiates the PropertyChangeSupport class.
     */
    
    public Model() {
        propertyChangeSupport = new PropertyChangeSupport(this);
    }
    
    /**
     * Adds a property change listener to the observer list.
     * @param l The property change listener
     */
    public void addPropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.addPropertyChangeListener(l);
    }
    
    /**
     * Removes a property change listener from the observer list.
     * @param l The property change listener
     */
    public void removePropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.removePropertyChangeListener(l);
    }
    
    
    /**
     * Fires an event to all registered listeners informing them that a property in
     * this model has changed.
     * @param propertyName The name of the property
     * @param oldValue The previous value of the property before the change
     * @param newValue The new property value after the change
     */
    protected void firePropertyChange(String propertyName, Object oldValue, Object newValue) {
        propertyChangeSupport.firePropertyChange(propertyName, oldValue, newValue);
    }
	
}


