import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    @Test
    void everyStatementTest(){
        IllegalArgumentException exception;

        exception = assertThrows(IllegalArgumentException.class, ()->SILab2.function(Collections.emptyList()));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));

        exception = assertThrows(IllegalArgumentException.class, ()->SILab2.function(List.of("0", "#", "0", "#", "0")));
        assertTrue(exception.getMessage().contains("List length should be a perfect square"));

        assertEquals(List.of("1", "#", "2", "0", "3", "#", "1", "#", "#"), SILab2.function(List.of("0",  "#", "0", "0", "0", "#", "0", "#", "#" )));
    }

    @Test
    void everyBranchTest(){
        IllegalArgumentException exception;

        exception = assertThrows(IllegalArgumentException.class, ()->SILab2.function(Collections.emptyList()));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));

        exception = assertThrows(IllegalArgumentException.class, ()->SILab2.function(List.of("0", "#", "0", "#", "0")));
        assertTrue(exception.getMessage().contains("List length should be a perfect square"));

        assertEquals(List.of("1", "#", "2", "0", "3", "#", "1", "#", "#"), SILab2.function(List.of("0",  "#", "0", "0", "0", "#", "0", "#", "#" )));
    }
}