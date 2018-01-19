package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Yuan on 2018-01-17.
 */

import java.util.Date;

public abstract class CurrentMood {

    public Date tweetDate;
    public String tweetBody;

    public abstract String getTweetBody();

    public abstract String toString();

    public Date getTweetDate() {
        return tweetDate;
    }

    public void setTweetDate(Date tweetDate) {
        this.tweetDate = tweetDate;
    }

    public void setTweetBody(String tweetBody) {
        this.tweetBody = tweetBody;
    }

    public int getLength(){
        return tweetBody.length();
    }

}
