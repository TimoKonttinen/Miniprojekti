package ohtu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Controller
public class Controllers {

    @GetMapping("/")
    @ResponseBody
    public String home() {
            String dbUrl = System.getenv("JDBC_DATABASE_URL");
        return dbUrl;
    }
    
    @GetMapping("/other")
    @ResponseBody
    public String other() {
        return "Hei Maailma!";
    }
}