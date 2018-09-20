package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Tweet {
    protected String message;
    protected Date date;

    public void setMessage(String message) throws TooLongTweetException{
        if (message.length()>140) {
            throw new TooLongTweetException();
        }
        this.message=message;
    }
    public void setDate(){
        this.date=date;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }
}
