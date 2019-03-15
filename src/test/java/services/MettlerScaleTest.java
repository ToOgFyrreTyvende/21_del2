package services;

import org.junit.jupiter.api.Test;
import services.MettlerScale;

import static org.junit.jupiter.api.Assertions.*;

class MettlerScaleTest {
    @Test
    void ConstructorTest() {
        MettlerScale scaleSocket = new MettlerScale("127.0.0.1", 8000);
        System.out.println(scaleSocket.requestUserInput("Indtast mem"));
        assertEquals(1,1);
    }

}