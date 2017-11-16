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
    public String home() throws Exception {
//            String dbUrl = System.getenv("JDBC_DATABASE_URL");
//            DriverManager.getConnection(dbUrl).prepareStatement("CREATE TABLE testi(    )");
        return "<a href='/other'>linkki</a>";

    }
    
    @GetMapping("/other")
    @ResponseBody
    public String other() {
        return "Hei Maailma!";
    }
}