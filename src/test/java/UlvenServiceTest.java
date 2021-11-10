import com.ulven.test.service.UlvenService;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UlvenServiceTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void init() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUp() {
        System.setOut(null);
    }

    @Test
    public void generateRandomString() throws Exception {
        UlvenService instance = new UlvenService();
        instance.generateRandomString(3);
        assertTrue("Create random string with size 3".equalsIgnoreCase(outContent.toString().trim()));
    }

//    @Test
//    public void testParkingCapacity() throws Exception {
//        ParkingService instance = new ParkingService();
//        thrown.expect(ParkingException.class);
//        thrown.expectMessage(is(new ParkingException(NO_PARKING_SLOT_ALLOCATED).getMessage()));
//        instance.park(new Car("KA-01-HH-1234"));
//        assertEquals("Sorry, parking lot is full", outContent.toString().trim());
//
//        instance.createParkingLot(11);
//        instance.park(new Car("KA-01-HH-1234"));
//        instance.park(new Car("KA-01-HH-9999"));
//        instance.park(new Car("KA-01-BB-0001"));
//        assertEquals("No Parking Slot allocation done", outContent.toString().trim());
//        instance.doCleanup();
//    }
//
//    @Test
//    public void testParkingLotIsFull() throws Exception {
//        ParkingService instance = new ParkingService();
//        instance.createParkingLot(2);
//        instance.park(new Car("KA-01-HH-1234"));
//        instance.park(new Car("KA-01-HH-9999"));
//        instance.park(new Car("KA-01-BB-0001"));
//        assertTrue(("Created parking lot with 2 slots\n" +
//            "Allocated slot number: 1\n" +
//            "Allocated slot number: 2\n" +
//            "Sorry, parking lot is full")
//            .equalsIgnoreCase(outContent.toString().trim()));
//        instance.doCleanup();
//    }
}
