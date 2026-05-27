import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.sql.*;
import java.net.InetSocketAddress;
import java.util.Map;

//For compiling on the shell on repl: Same on mac

//javac -cp sqlite-jdbc-3.23.1.jar: Main.java

//java -cp sqlite-jdbc-3.23.1.jar: Main



//Use for windows

//javac -cp sqlite-jdbc-3.23.1.jar; Main.java


class Main {

    public static void main(String[] args) throws IOException {
        (new Main()).init();
    }

    void init() throws IOException {
        // Port 8500
        int port = 8500;

        // Create server
        HttpServer server = HttpServer.create(new InetSocketAddress("0.0.0.0", port), 0);

        // Connect to your database
        Database db = new Database("jdbc:sqlite:corporate.db");



        // Route 1: Companies

        String sqlCompanies = "SELECT * FROM companies";
        server.createContext("/companies", new RouteHandler(db, sqlCompanies));

        // Route 2: Employees
        String sqlEmployees = "SELECT * FROM employees";
        server.createContext("/employees", new RouteHandler(db, sqlEmployees));

        // Default route
        server.createContext("/", new RouteHandler("Route not found"));

        // Start server
        server.start();

        System.out.println("Corporate Server is listening on port " + port);
    }
}