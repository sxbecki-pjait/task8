public class Book implements MediaItem,Rentable {
    private String title;
    private String author;
    private int publicationYear;
    private int ISBN;
    private boolean isAvailable = true;

    public Book(String title, String author, int publicationYear, int ISBN) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.ISBN = ISBN;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getYearOfPublication() {
        return publicationYear;
    }

    @Override
    public String displayInformation() {
        return "name: " + title +
                "\nauthor: " + author +
                "\nyear: " + publicationYear +
                "\nisbn: " + ISBN +
                "\navailable: " + isAvailable;
    }

    @Override
    public boolean checkIfIsAvailable() {
        return isAvailable;
    }

    @Override
    public boolean rentTheItem() {
        if(isAvailable) {
            isAvailable = false;
        }
        else {
            return false;
        }
        return true;
    }

    @Override
    public boolean returnTheItem() {
        isAvailable = true;
        return true;
    }
}
