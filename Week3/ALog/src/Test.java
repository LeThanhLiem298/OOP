import junit.framework.TestCase;

public class Test extends TestCase {
    public void test(){
        Date d1 = new Date(3,3,3);
        Entry e1 = new Entry(d1, 5,10,"G");
        ALog a1 = new EmptyLog();
        ALog a2 = new ConsLog(e1,a1);

        Date d2 = new Date(4,3,3);
        Entry e2 = new Entry(d2, 10, 15, "L");
        ALog a3 = new ConsLog(e2,a2);

        Date d3 = new Date(5,3,3);
        Entry e3 = new Entry(d3, 10, 20, "M");
        ALog a4 = new ConsLog(e3,a3);
    }
    public void testEx(){
        Date d1 = new Date(5,6,2004);
        Entry e1 = new Entry(d1, 15.3,87,"Great");
        ALog a1 = new EmptyLog();
        ALog a2 = new ConsLog(e1,a1);

        Date d2 = new Date(6,6,2004);
        Entry e2 = new Entry(d2, 12.8,84,"Good");
        ALog a3 = new ConsLog(e2,a2);

        Date d3 = new Date(23,6,2004);
        Entry e3 = new Entry(d3, 26.2,250,"dead");
        ALog a4 = new ConsLog(e3,a3);

        Date d4 = new Date(28,6,2004);
        Entry e4 = new Entry(d4, 26.2,150,"good recovery");
        ALog a5 = new ConsLog(e4,a4);
    }
}
