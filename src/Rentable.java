public interface Rentable {
    public static final int MAX_RENT_DAYS = 14;
    public static double calculateLateFee(int lateDays){
        return lateDays* 0.5;
    };

    public boolean checkIfIsAvailable();
    public boolean rentTheItem();
    public boolean returnTheItem();



}
