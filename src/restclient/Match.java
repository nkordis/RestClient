package restclient;

/**
 *
 * @author Nikos
 */
public class Match {

    private int id; //the id of the match
    private String home_name; //the name of the home team.
    private String away_name; //the name of the away team
    private String score; //he latest score of the game
    private String ht_score; //the half time score of the game
    private String ft_score; //the full time score of the game
    private String et_score; //the extra time score of the game
    private String time; // the number minutes that have passed since the beginning of the game.
    private int league_id; // the id of the league to which the game belongs
    private String league_name; // the name of the league to which the game belongs to
    private String added; //contains a date time of when the match was added to our livescore api feed
    private String last_changed; // contains a date time of when the match data was checked or updated
    private String status; // the status of the game
    private int home_id; //team id provided for the home team
    private int away_id; // team id provided for the away team
    private String events;

    @Override
    public String toString() {
        return "Match{" + "id=" + id + ", home_name=" + home_name + ", away_name=" + away_name + ", score=" + score + ", ht_score=" + ht_score + ", ft_score=" + ft_score + ", et_score=" + et_score + ", time=" + time + ", league_id=" + league_id + ", league_name=" + league_name + ", added=" + added + ", last_changed=" + last_changed + ", status=" + status + ", home_id=" + home_id + ", away_id=" + away_id + ", events=" + events + '}';
    }
    

    public Match() {
    }

    public Match(int id, String home_name, String away_name, String score, String ht_score, String ft_score, String et_score, String time, int league_id, String league_name, String added, String last_changed, String status, int home_id, int away_id, String events) {
        this.id = id;
        this.home_name = home_name;
        this.away_name = away_name;
        this.score = score;
        this.ht_score = ht_score;
        this.ft_score = ft_score;
        this.et_score = et_score;
        this.time = time;
        this.league_id = league_id;
        this.league_name = league_name;
        this.added = added;
        this.last_changed = last_changed;
        this.status = status;
        this.home_id = home_id;
        this.away_id = away_id;
        this.events = events;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHome_name() {
        return home_name;
    }

    public void setHome_name(String home_name) {
        this.home_name = home_name;
    }

    public String getAway_name() {
        return away_name;
    }

    public void setAway_name(String away_name) {
        this.away_name = away_name;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getHt_score() {
        return ht_score;
    }

    public void setHt_score(String ht_score) {
        this.ht_score = ht_score;
    }

    public String getFt_score() {
        return ft_score;
    }

    public void setFt_score(String ft_score) {
        this.ft_score = ft_score;
    }

    public String getEt_score() {
        return et_score;
    }

    public void setEt_score(String et_score) {
        this.et_score = et_score;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getLeague_id() {
        return league_id;
    }

    public void setLeague_id(int league_id) {
        this.league_id = league_id;
    }

    public String getLeague_name() {
        return league_name;
    }

    public void setLeague_name(String league_name) {
        this.league_name = league_name;
    }

    public String getAdded() {
        return added;
    }

    public void setAdded(String added) {
        this.added = added;
    }

    public String getLast_changed() {
        return last_changed;
    }

    public void setLast_changed(String last_changed) {
        this.last_changed = last_changed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getHome_id() {
        return home_id;
    }

    public void setHome_id(int home_id) {
        this.home_id = home_id;
    }

    public int getAway_id() {
        return away_id;
    }

    public void setAway_id(int away_id) {
        this.away_id = away_id;
    }

    public String getEvents() {
        return events;
    }

    public void setEvents(String events) {
        this.events = events;
    }
    
    

}
