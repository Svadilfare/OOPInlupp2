/**
 * Created by SimonSchwieler on 2016-04-07.
 */

//rodi0231_sisc7379_arho2993
import java.util.ArrayList;

public class Participant {

    private static int next_id = 99;

    private String firstName;
    private String lastName;
    private String teamName;
    private int id;
    private ArrayList<ResultList> results = new ArrayList<ResultList>();
    private Team team;


    public Participant(String firstName, String lastName, String teamName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamName = teamName;
        this.id = ++Participant.next_id;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public int getId() {
        return id;
    }

    public void setResult(Event e, double score){

        ArrayList<ResultList> tmpList = this.getResults();

        Result r = new Result(score);

        ResultList rl = new ResultList(e,r);

        tmpList.add(rl);

        this.setResults(tmpList);
    }

    public int reduceAttempts (Event e){
        return e.getAttemptsAllowed();
    }

    public ArrayList<ResultList> getResults() {
        return results;
    }
    public void setResults(ArrayList<ResultList> results) {
        this.results = results;
    }



}