package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public class DomesticDuck extends Animal implements FlyingBehaviour{
    @Override
    public void swim(){
        Log.d("shaiful","Hey I like swimming sometimes");
    }

    public void fly(){
      Log.d("shaiful","I only fly when I am forced to fly");
    }
}
