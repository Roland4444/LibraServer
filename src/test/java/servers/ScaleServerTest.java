package servers;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ScaleServerTest {

    @Test
    public void getWeigth() throws IOException, InterruptedException {
        var server = new ScaleServer();
        assertEquals(0.0, server.getWeigth("12"), 0.02);
    }
}