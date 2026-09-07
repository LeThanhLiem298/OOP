public class Cons extends AList{
    private Restaurant first;
    private AList rest;

    public Cons(Restaurant first, AList rest){
        this.first = first;
        this.rest = rest;
    }
}
