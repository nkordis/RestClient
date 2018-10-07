package restclient;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Nikos
 */
public class Fixture {
    
    private final String pattern_date = "yyyy-MM-dd";
    private final String pattern_time = "HH:mm:ss";
    
    int id;
    Date date; //the data when the football match is going to be played
    Date time; //the kick-off time(UTC) of the football match
    String round; // the round of the match (a.k.a match day) of the soccer game
    String home_name; //the name of the home team in the match
    String away_name; //the name of the away team in the match
    String location; //the place or stadium where the match is going to be played 
    int league_id; //the id of the league to which the match belongs to
    
    SimpleDateFormat simpleDateFormat;
    
    public Fixture(int id, String date, String time, String round, String home_name, String away_name, String location, int league_id) throws ParseException {
        
        Calendar calendar = Calendar.getInstance();
        
        this.id = id;
        simpleDateFormat = new SimpleDateFormat(pattern_date);
        this.date = simpleDateFormat.parse(date);
        simpleDateFormat = new SimpleDateFormat(pattern_time);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(this.date.getTime() + simpleDateFormat.parse(time).getTime());
        this.time = calendar.getTime();
        this.round = round;
        this.home_name = home_name;
        this.away_name = away_name;
        this.location = location;
        this.league_id = league_id;
    }

    @Override
    public String toString() {
        return "Fixture{" + "id=" + id + ", date=" + date + ", time=" + time + ", round=" + round + ", home_name=" + home_name + ", away_name=" + away_name + ", location=" + location + ", league_id=" + league_id +  '}';
    }


    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getTime() {
        simpleDateFormat = new SimpleDateFormat(pattern_time);
        return simpleDateFormat.format(this.time);
    }

    public String getRound() {
        return round;
    }

    public String getHome_name() {
        return home_name;
    }

    public String getAway_name() {
        return away_name;
    }

    public String getLocation() {
        return location;
    }

    public int getLeague_id() {
        return league_id;
    }

    public SimpleDateFormat getSimpleDateFormat() {
        return simpleDateFormat;
    }
    
    
    
}
