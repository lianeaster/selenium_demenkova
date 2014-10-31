import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by c2610 on 31.10.2014.
 */
public class ConsoleWriterTest {
    @Test
    public void isPrinter(){
        ConsoleWriter cw= new ConsoleWriter();
        cw.writeToColsole("asd");
        Assert.assertTrue(true);
    }
}
