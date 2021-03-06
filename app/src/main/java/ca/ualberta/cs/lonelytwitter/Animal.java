package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public abstract class Animal {
    protected String type;
    protected String food;

    public void setType(String type){
        this.type=type;
    }
    public void setFood(String food){
        this.food=food;
    }

    public String getType() {
        return type;
    }

    public String getFood() {
        return food;
    }

    public abstract void swim();
}
