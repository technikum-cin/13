import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class test {

    @Test
    public void testSum(){
        CalculatorSimpleImpl calc = new CalculatorSimpleImpl();
        assertEquals(20, calc.sum());
    }
}
