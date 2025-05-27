public class Book implements MediaItem,Rentable {
    private String title;
    private String author;
    private int publicationYear;
    private String ISBN;
    private boolean isAvailable = true;

    public Book(String title, String author, int publicationYear, String ISBN) {
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
        return "Name: " + title +
                "\nAuthor: " + author +
                "\nYear: " + publicationYear +
                "\nISBN: " + ISBN +
                "\nAvailable: " + isAvailable + "\n";
    }

    @Override
    public boolean checkAvailability() {
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
