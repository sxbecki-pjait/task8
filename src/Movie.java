import java.util.ArrayList;
import java.util.List;

public class Movie implements MediaItem, Rentable, Rateable{

    private String title;
    private int yearOfPublication;
    private String director;
    private int duration;
    private boolean isAvailable;
    private List<Integer> ratings = new ArrayList<Integer>();


    public Movie(String title, String director, int yearOfPublication, int duration) {
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.director = director;
        this.duration = duration;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public String displayInformation() {
        return "name: " + title +
                "\nauthor: " + director +
                "\nyear: " + yearOfPublication +
                "\nduration: " + duration +
                "\nratings: " + getAverageRate() +
                "\navailable: " + isAvailable + "\n";
    }

    @Override
    public double getAverageRate() {
        int sum = 0;
        for(int i = 0; i < ratings.size(); i++){
            sum += ratings.get(i);
        }
        return Math.round(sum*10.0/ratings.size())*10.0;
    }

    @Override
    public boolean addRating(int rate) {
        if(rate > 5 || rate < 1){
            return false ;
        }
        ratings.add(rate);
        return true;
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }

    @Override
    public boolean rentTheItem() {
        if(isAvailable){
            isAvailable = false;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean returnTheItem() {
        isAvailable = true;
        return true;
    }
}
