package org.utz.offer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Pb002AddBinaryTest {

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "11,    10,   101",
            "1010,  1011, 10101",
            "1, 111, 1000"
    })
    public void addBinary(String first, String second, String expected) {
        Pb002AddBinary pb = new Pb002AddBinary();
        assertEquals(expected, pb.addBinary(first, second));
    }
}