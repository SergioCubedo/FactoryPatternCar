/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypatterncar;

/**
 *
 * @author alu20490610w
 */
public abstract class Car {
    private CarType model = null;
    
    public Car(CarType model) {
        this.model = model;
        arrangeParts();
    }
    
    private void arrangeParts() {
        //sdfsdfggs
    }
    
    protected abstract void construct();
        
    

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}
