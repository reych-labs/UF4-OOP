package daw.activitats.geometria;

public class Birthday {
    private String month;
    private String day;
    private String year;

    public Birthday(String m, String d, String y){
        this.month = m;
        this.day = d;
        this.year = y;
    }

    @Override
    public String toString() {
        return "Birthday{" +
                "month='" + month + '\'' +
                ", day='" + day + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
