public class House {
    private String kind;
    private int numberOfRooms;
    private double askingPrice;
    private Address address;

    public House(String kind, int numberOfRooms, double askingPrice, Address address) {
        this.kind = kind;
        this.numberOfRooms = numberOfRooms;
        this.askingPrice = askingPrice;
        this.address = address;
    }
}