import junit.framework.TestCase;
public class MonkeTest extends TestCase {
    public void testConstructor() {
        AZooAnimal george = new Monkey("George", 150, "kiwi");
        AZooAnimal mina = new Monkey("Mina", 120, "banana");
    }
}
