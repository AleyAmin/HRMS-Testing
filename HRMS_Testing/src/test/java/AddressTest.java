import classes.Address;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;

public class AddressTest {
    private Address address;

    @BeforeAll
    public static void Message() {
        System.out.println("Testing The Address Class");
    }

    @BeforeEach
    public void setUp() {
        address = new Address("Zahraa ElMaadi", "Cairo", "00000", "Egypt");
    }

    @Test
    @DisplayName("Test Get Street")
    public void testGetStreet() {
        Assertions.assertEquals("Zahraa ElMaadi", address.getStreet());
    }

    @Test
    @DisplayName("Test Set Street")
    public void testSetStreet() {
        address.setStreet("Makram");
        Assertions.assertEquals("Makram", address.getStreet());
    }

    @Test
    @DisplayName("Test Get City")
    public void testGetCity() {
        Assertions.assertEquals("Cairo", address.getCity());
    }

    @Test
    @DisplayName("Test Set City")
    public void testSetCity() {
        address.setCity("Giza");
        Assertions.assertEquals("Giza", address.getCity());
    }

    @Test
    @DisplayName("Test Get Postal Code")
    public void testGetPostalCode() {
        Assertions.assertEquals("00000", address.getPostalCode());
    }

    @Test
    @DisplayName("Test Set Postal Code")
    public void testSetPostalCode() {
        address.setPostalCode("77102");
        Assertions.assertEquals("77102", address.getPostalCode());
    }

    @Test
    @DisplayName("Test Get Country")
    public void testGetCountry() {
        Assertions.assertEquals("Egypt", address.getCountry());
    }

    @Test
    @DisplayName("Test Set Country")
    public void testSetCountry() {
        address.setCountry("England");
        Assertions.assertEquals("England", address.getCountry());
    }
}
