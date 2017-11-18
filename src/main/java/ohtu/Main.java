package ohtu;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import org.h2.tools.RunScript;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) throws Exception {
        // Open connection to a database
        Connection connection = DriverManager.getConnection("jdbc:h2:./database", "sa", "");

        try {
            // If database has not yet been created,  insert content
            RunScript.execute(connection, new FileReader("schema.sql"));
            RunScript.execute(connection, new FileReader("data.sql"));
        } catch (Throwable t) {
        }
        
        SpringApplication.run(Main.class, args);
    }
}