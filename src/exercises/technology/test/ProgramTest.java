package exercises.technology.test;

import exercises.technology.Computer;
import exercises.technology.Laptop;
import exercises.technology.SmartPhone;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProgramTest {
    @Before
    public void createObjects() {
        Computer item1 = new Laptop(13, "1Tb", "Lenovo", 800);
        SmartPhone item2 = new SmartPhone("SE","64GB", "Apple", 1200 );
    }

    @Test
    public void inheritsSuperInConstructor() {
        Computer item1 = new Laptop(13, "1Tb", "Lenovo", 800);
        assertEquals("1Tb", item1.getMemory());
        assertEquals("Lenovo", item1.getMaker());
        assertEquals(800, item1.getPrice(), .001);
    }

    @Test
    public void setDeviceSizeCorrectly() {
        Laptop item1 = new Laptop(13, "1Tb", "Lenovo", 800);
        assertEquals("Small Screen Size Device", item1.screenSize());
    }

    @Test
    public void setOperatingSystemCorrectly() {
        Computer item1 = new Laptop(13, "1Tb", "Lenovo", 800);
        assertEquals("Windows", item1.operatingSystem());
    }

    @Test
    public void phoneInheritsSuperInConstructor() {
        Computer item2 = new SmartPhone("SE","64GB", "Apple", 1200 );
        assertEquals("64GB", item2.getMemory());
        assertEquals("Apple", item2.getMaker());
        assertEquals(1200, item2.getPrice(), .001);
    }
    @Test
    public void phoneSetOperatingSystemCorrectly() {
        Computer item2 = new SmartPhone("SE","64GB", "Apple", 1200 );
        assertEquals("iOS", item2.operatingSystem());
    }
    @Test
    public void setDeviceNameCorrectly() {
        SmartPhone item2 = new SmartPhone("SE","64GB", "Apple", 1200 );
        assertEquals("iPhone SE", item2.setDeviceName("SE","Apple"));
    }

}
