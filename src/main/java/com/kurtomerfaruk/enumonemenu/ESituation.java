package com.kurtomerfaruk.enumonemenu;

/**
 * 
 * @author Omer Faruk KURT
 * @Created on date 31/05/2016 18:20:08 
 */
public enum ESituation {

    /**
     * Pending
     */
    P(0),
    
    /**
     * Editing
     */
    E(1),
    
    /**
     * Inserting
     */
    I(2),
    
    /**
     * Closed
     */
    C(3);
    
    private final int label;

    private ESituation(int label) {
        this.label = label;
    }

    public int getLabel() {
        return label;
    }
    
    
}
