import com.ulven.test.invoker.CommandLineInvoker;
import com.ulven.test.invoker.UlvenInvoker;
import com.ulven.test.invoker.UlvenInvokerFactory;
import org.junit.Assert;
import org.junit.Test;

public class InvokerTest {

    @Test
    public void testInstance() {
        UlvenInvokerFactory instance1 = UlvenInvokerFactory.getInstance();
        UlvenInvokerFactory instance2 = UlvenInvokerFactory.getInstance();
        Assert.assertNotNull(instance1);
        Assert.assertNotNull(instance2);
        Assert.assertEquals(instance1, instance2);
    }

    @Test
    public void testCommandLineInvoker() {
        UlvenInvoker invoker = UlvenInvokerFactory.getInstance().getInvoker(null);
        Assert.assertNotNull(invoker);
        Assert.assertEquals(invoker instanceof CommandLineInvoker, true);
    }
}
