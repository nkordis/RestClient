package restclient;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author Nikos
 */
public class RestUtilities {
    
    
  URL url;
  InputStream is;
  JsonReader reader;  
  JsonObject empObj; 
  JsonArray jsonArray;     
  

    public RestUtilities() throws IOException {
        
        this.url = new URL("http://livescore-api.com/api-client/scores/live.json?key=6r94GgdPiJ5ciqdx&secret=70Qx0KjZN2uD6jfdLohrFuhXem9wNm4U");
        this.is = url.openStream();
        this.reader = Json.createReader(is);
        this.empObj = reader.readObject();
        this.jsonArray = empObj.getJsonObject("data").getJsonArray("match");
    }
    
    public RestUtilities(int countryCode) throws IOException {
        
        this.url = new URL("http://livescore-api.com/api-client/scores/live.json?key=6r94GgdPiJ5ciqdx&secret=70Qx0KjZN2uD6jfdLohrFuhXem9wNm4U" + "&country=" + countryCode);
        this.is = url.openStream();
        this.reader = Json.createReader(is);
        this.empObj = reader.readObject();
        this.jsonArray = empObj.getJsonObject("data").getJsonArray("match");
    }
    
    public RestUtilities(String date) throws IOException {
        
        this.url = new URL("http://livescore-api.com/api-client/fixtures/matches.json?key=6r94GgdPiJ5ciqdx&secret=70Qx0KjZN2uD6jfdLohrFuhXem9wNm4U" + "&date=" + date);
        this.is = url.openStream();
        this.reader = Json.createReader(is);
        this.empObj = reader.readObject();
        this.jsonArray = empObj.getJsonObject("data").getJsonArray("fixtures");
    }
     
     public  ArrayList<Match> getLiveMatches(){
     
        ArrayList<Match> matches = new ArrayList();
        Match match;

        int id;
        String home_name;
        String away_name;
        String score;
        String ht_score;
        String ft_score;
        String et_score;
        String time;
        int league_id;
        String status;
        String added;
        String last_changed;
        int home_id;
        int away_id;
        String events;
        String league_name;

        
        
        for(int i = 0;i < jsonArray.size(); i++){
            JsonObject theObject = (JsonObject)empObj.getJsonObject("data").getJsonArray("match").get(i);

            id =  Integer.parseInt(theObject.getString("id"));
            home_name = theObject.getString("home_name");
            away_name = theObject.getString("away_name");
            score = theObject.getString("score");
            ht_score = theObject.getString("ht_score");
            ft_score = theObject.getString("ft_score");
            et_score = theObject.getString("et_score");
            time = theObject.getString("time");
            league_id = Integer.parseInt(theObject.getString("league_id"));
            status = theObject.getString("status");
            added = theObject.getString("added");
            last_changed = theObject.getString("last_changed");
            home_id = Integer.parseInt(theObject.getString("home_id"));
            away_id = Integer.parseInt(theObject.getString("away_id"));
            events = null;//theObject.getString("events");
            league_name = theObject.getString("league_name");

            match = new Match(id,home_name, away_name, score, 
                              ht_score, ft_score, et_score, time, league_id, 
                              league_name, status, added, last_changed, 
                              home_id, away_id, events );

            matches.add(match);
        }
                return matches;
     }
     
     public ArrayList<Fixture> getFixtures() throws ParseException{
     
         ArrayList<Fixture> fixtures = new ArrayList();
         Fixture fixture;
         
         int id;
         String date; 
         String time; 
         String round; 
         String home_name; 
         String away_name; 
         String location;  
         int league_id; 
         
         for(int i = 0;i < jsonArray.size(); i++){
         JsonObject theObject = (JsonObject)empObj.getJsonObject("data").getJsonArray("fixtures").get(i);

         id =  Integer.parseInt(theObject.getString("id"));
         date = theObject.getString("date");
         time = theObject.getString("time");
         round = theObject.getString("round");
         home_name = theObject.getString("home_name");
         away_name = theObject.getString("away_name");
         location = theObject.getString("location");
         league_id = Integer.parseInt(theObject.getString("league_id"));
         
         fixture = new Fixture(id, date, time, round, home_name, away_name, location, league_id);
         fixtures.add(fixture);
         }
         
         return fixtures;
     }
    
}
