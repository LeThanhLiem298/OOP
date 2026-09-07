public class Cons extends AHouseList {
    private House first;
    private AHouseList rest;

    public Cons(House first, AHouseList rest) {
        this.first = first;
        this.rest = rest;
    }
}