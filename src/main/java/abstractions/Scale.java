package abstractions;

import java.io.IOException;

public abstract class Scale {
    public String UUID;
    public String IP;
    public String Description;
    public abstract float getWeigth() throws IOException, InterruptedException;
}
