package convert;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DegreesTest {
    private DegreesConverter converter;

    @BeforeAll
    public void setup(){

        converter = new DegreesConverter();
    }






    @Test
    public void zerocMustConvertTo32F() {
        //Arrange
        double expected = 32.0;

        //Act
        double result = converter.convertToFahrenheit(0);

        //Assert
        assertEquals(expected, result, 0.3);
    }


    @Test
    public void zeroFMustConvertToNegative17_77() {
        //Arrange
        double expected = -17.77;

        //Act
        double result = converter.ConvertToCelsius(0);

        //Assert
        assertEquals(expected, result, 0.3);
    }










}
