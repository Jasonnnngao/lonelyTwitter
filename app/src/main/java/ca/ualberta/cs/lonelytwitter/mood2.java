package ca.ualberta.cs.lonelytwitter;

/**
 * Created by Yuan on 2018-01-18.
 */
import java.util.Date;
public class mood2 extends CurrentMood {
    public mood2(Date tweetDate, String tweetBody) {
        super();
        this.tweetDate = tweetDate;
        this.tweetBody = tweetBody;
    }

    public String getTweetBody() {
        return tweetBody;
    }

    public String toString() {
        return tweetDate + " / "+ tweetBody;
    }
}
