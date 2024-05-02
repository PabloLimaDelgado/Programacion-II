package Place;

import java.util.ArrayList;

public class Installation {
    private String category;
    private String location;
    private String name;
    private String type;
    private ArrayList<Test> isMade = new ArrayList<>();

    public Installation() {
    }
    public Installation(String category, String location, String name, String type) {
        this.category = category;
        this.location = location;
        this.name = name;
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Test> getIsMade() {
        return isMade;
    }

    public void setIsMade(ArrayList<Test> isMade) {
        this.isMade = isMade;
    }

    public void isMade(Test test){
        isMade.add(test);
    }
}
