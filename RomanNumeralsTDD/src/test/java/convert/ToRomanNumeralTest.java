package convert;

import com.sun.jdi.connect.Connector;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ToRomanNumeralTest {

    private RomanNumeralConverter converter;

    @BeforeAll
    public void setup(){

        converter = new RomanNumeralConverter();
    }




    @Test
    public void mustConvert1ToI() {
        //Arrange
        var expected = "I";
        //Act
        var result = converter.toRomanNumeral(1);
        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert2ToII() {
        //Arrange
        var expected = "II";
        //Act
        var result = converter.toRomanNumeral(2);
        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert3ToIII() {
        //Arrange
        var expected = "III";
        //Act
        var result = converter.toRomanNumeral(3);
        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert4ToIV() {
        //Arrange
        var expected = "IV";
        //Act
        var result = converter.toRomanNumeral(4);
        //Assert
        assertEquals(expected, result);

    }


    @Test
    public void mustConvert5ToV() {
        //Arrange
        var expected = "V";
        //Act
        var result = converter.toRomanNumeral(5);
        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert6ToVI() {
        //Arrange
        var expected = "VI";
        //Act
        var result = converter.toRomanNumeral(6);
        //Assert
        assertEquals(expected, result);

    }


    @Test
    public void mustConvert7ToVII() {
        //Arrange
        var expected = "VII";
        //Act
        var result = converter.toRomanNumeral(7);
        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert8ToVIII() {
        //Arrange
        var expected = "VIII";
        //Act
        var result = converter.toRomanNumeral(8);
        //Assert
        assertEquals(expected, result);

    }
    @Test
    public void mustConvert9ToIX() {
        //Arrange
        var expected = "IX";
        //Act
        var result = converter.toRomanNumeral(9);
        //Assert
        assertEquals(expected, result);

    }


    @Test
    public void mustConvert10ToX() {
        //Arrange
        var expected = "X";
        //Act
        var result = converter.toRomanNumeral(10);
        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert1000ToM() {
        //Arrange
        var expected = "M";
        //Act
        var result = converter.toRomanNumeral(1000);
        //Assert
        assertEquals(expected, result);

        }


    @Test
    public void mustConvert900ToCM() {
        //Arrange
        var expected = "CM";
        //Act
        var result = converter.toRomanNumeral(900);
        //Assert
        assertEquals(expected, result);

    }
    @Test
    public void mustConvert500ToD() {
        //Arrange
        var expected = "D";
        //Act
        var result = converter.toRomanNumeral(500);
        //Assert
        assertEquals(expected, result);

    }
    @Test
    public void mustConvert400ToCD() {
        //Arrange
        var expected = "D";
        //Act
        var result = converter.toRomanNumeral(500);
        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert100ToC() {
        //Arrange
        var expected = "D";
        //Act
        var result = converter.toRomanNumeral(500);
        //Assert
        assertEquals(expected, result);

    }

    @Test
    public void mustConvert90ToXD() {
        //Arrange
        var expected = "D";
        //Act
        var result = converter.toRomanNumeral(500);
        //Assert
        assertEquals(expected, result);

    }
    @Test
    public void mustConvert50ToL() {
        //Arrange
        var expected = "D";
        //Act
        var result = converter.toRomanNumeral(500);
        //Assert
        assertEquals(expected, result);

    }
    @Test
    public void mustConvert40ToXL() {
        //Arrange
        var expected = "D";
        //Act
        var result = converter.toRomanNumeral(500);
        //Assert
        assertEquals(expected, result);

    }


}
