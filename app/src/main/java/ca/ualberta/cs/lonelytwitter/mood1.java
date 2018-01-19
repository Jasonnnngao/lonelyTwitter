package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Yuan on 2018-01-18.
 */
import java.util.Date;
public class mood1 extends CurrentMood {
    public mood1(Date tweetDate, String tweetBody) {
        super();
        this.tweetDate = tweetDate;
        this.tweetBody = tweetBody;
    }

    public String getTweetBody() {
        return "\u2605 "+tweetBody;
    }

    public String toString() {
        return getTweetBody();
    }

}
