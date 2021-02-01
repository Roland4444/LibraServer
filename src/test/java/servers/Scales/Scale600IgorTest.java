package servers.Scales;


import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class Scale600IgorTest {

    @Test
   public void getWeigth() throws IOException, InterruptedException {
        var x = new Scale600Igor();
        assertEquals(0, x.getWeigth(), 0.01);
    }

    @Test
    public void testGetWeigth() {
    }
}