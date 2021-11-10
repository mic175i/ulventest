import com.ulven.test.constant.UlvenConstant;
import com.ulven.test.exception.UlvenErrorStatus;
import com.ulven.test.exception.UlvenException;
import org.junit.Assert;
import org.junit.Test;

public class UlvenTest {

    @Test
    public void constantTest() {
        UlvenConstant constant = new UlvenConstant();
        Assert.assertNotNull(constant);
        Assert.assertEquals(UlvenConstant.EXIT, "exit");
        Assert.assertEquals(UlvenConstant.CREATE_TXT_FILE, "create_txt_file");
    }

    @Test
    public void exceptionTest() {
        UlvenException exception = new UlvenException(UlvenErrorStatus.INVALID_INPUT_COMMAND);
        Assert.assertNotNull(exception);
    }
}
