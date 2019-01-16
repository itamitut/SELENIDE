import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public  void testArea() {
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.size + " = " + s.area());
        Assert.assertEquals(s.area(), 25.0);
    }


}
