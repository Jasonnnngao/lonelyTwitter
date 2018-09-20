package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

public class Duck extends Animal implements FlyingBehaviour{
    @Override
    public void swim(){
        Log.d("shaiful","I always swim");
    }

    public void fly(){
        Log.d("shaiful","I love flying");
    }
}
