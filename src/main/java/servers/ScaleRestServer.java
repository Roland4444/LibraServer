package servers;
import java.io.IOException;
import java.sql.SQLException;


import static spark.Spark.*;

public class ScaleRestServer {
    public static void main(String[] args) throws InterruptedException, SQLException, IOException, ClassNotFoundException {
        ScaleServer sc = new ScaleServer();

        get("/get/:id", (request, response) -> {
            return sc.getWeigth(request.params(":id"));
        });

    }
};