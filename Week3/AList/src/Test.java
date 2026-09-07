import junit.framework.TestCase;

public class Test extends TestCase {
    public void test() {
        Intersection i1 = new Intersection(5, 7);
        Restaurant r1 = new Restaurant("Pho Anh Hai", "Vietnamese", "$$", i1);
        AList a1 = new Empty();
        AList a2 = new Cons(r1, a1);

        Intersection i2 = new Intersection(10, 3);
        Restaurant r2 = new Restaurant("Pizza Hub", "Italian", "$$$", i2);
        AList a3 = new Cons(r2, a2);

        Intersection i3 = new Intersection(1, 2);
        Restaurant r3 = new Restaurant("KFC", "Fastfood", "$", i3);
        AList a4 = new Cons(r3, a3);
    }
}
    