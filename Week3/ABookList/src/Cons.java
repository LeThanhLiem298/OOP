public class Cons extends ABookList {
    private Book first;
    private ABookList rest;

    public Cons(Book first, ABookList rest) {
        this.first = first;
        this.rest = rest;
    }
}