package Place;

import Person.Athlete;
import Person.AthleteRepeatException;

import java.util.ArrayList;

public class Test {
    private int code;
    private String title;
    private ArrayList<Athlete> participates = new ArrayList<>();
    private ArrayList <Installation> where = new ArrayList<>();
    private ArrayList <Site> site = new ArrayList<>();
    public Test() {
    }

    public Test(int code, String title) {
        this.code = code;
        this.title = title;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Installation> getWhere() {
        return where;
    }

    public void setWhere(ArrayList<Installation> where) {
        this.where = where;
    }

    public ArrayList<Site> getSite() {
        return site;
    }

    public void setSite(ArrayList<Site> site) {
        this.site = site;
    }

    public ArrayList<Athlete> getParticipates() {
        return participates;
    }

    public void setParticipates(ArrayList<Athlete> participates) {
        this.participates = participates;
    }

    public void addParticipates(Athlete athlete) throws AthleteRepeatException {
        for (Athlete athleteOne : participates){
            if(athleteOne.getName().equals(athlete.getName())){
                throw new AthleteRepeatException();
            }
        }
        participates.add(athlete);
    }

    public void where(Installation installation, int phase, String date, String hour){
        where.add(installation);
        installation.isMade(this);
        this.site.add(new Site(phase,date,hour));
    }
}
