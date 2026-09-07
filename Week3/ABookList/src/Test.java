import junit.framework.TestCase;

public class Test extends TestCase {
    public void testReadingList() {
        Book b1 = new Book("Daniel Defoe", "Robinson Crusoe", 15.50, 1719);
        ABookList list1 = new Empty();
        ABookList list2 = new Cons(b1, list1);

        Book b2 = new Book("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
        ABookList list3 = new Cons(b2, list2);

        Book b3 = new Book("Pat Conroy", "Beach Music", 9.50, 1996);
        ABookList list4 = new Cons(b3, list3);
    }
}