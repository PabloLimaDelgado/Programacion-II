package Person;

import java.util.ArrayList;

public class NationalTeam {
    private String color;
    private String country;
    private ArrayList <Athlete> belongs = new ArrayList<>();

    public NationalTeam() {
    }
    public NationalTeam(String color, String country) {
        this.color = color;
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<Athlete> getBelongs() {
        return belongs;
    }

    public void setBelongs(ArrayList<Athlete> belongs) {
        this.belongs = belongs;
    }


    public void addAthlete(Athlete athlete) throws AthleteRepeatException {
        for (Athlete athleteOne : belongs){
            if(athleteOne.getName().equals(athlete.getName())){
                throw new AthleteRepeatException();
            }
        }
        belongs.add(athlete);
    }
}
