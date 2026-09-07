import junit.framework.TestCase;

public class Test extends TestCase {
    public void testHouseList() {
        Address a1 = new Address(23, "Maple Street", "Brookline");
        House h1 = new House("Ranch", 7, 375000, a1);
        AHouseList list1 = new Empty();
        AHouseList list2 = new Cons(h1, list1);

        Address a2 = new Address(5, "Joye Road", "Newton");
        House h2 = new House("Colonial", 9, 450000, a2);
        AHouseList list3 = new Cons(h2, list2);

        Address a3 = new Address(83, "Winslow Road", "Waltham");
        House h3 = new House("Cape", 6, 235000, a3);
        AHouseList list4 = new Cons(h3, list3);
    }
}