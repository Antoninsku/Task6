package fi.antonina.task6;

public class President {
    public String name;
    private String date;
    private String freetext;

    public President(String name, String date, String freetext) {
        this.name = name;
        this.date = date;
        this.freetext = freetext;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFreetext() {
        return freetext;
    }

    public void setFreetext(String freetext) {
        this.freetext = freetext;
    }


}
