package pl.writeonly.emptyjava;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LiveCodingSpec {

    @DisplayName("Add")
    @Test
    public void addSpec() {
        var result = LiveCoding.add(1, 2);
        assertEquals(3, result);
    }
}
