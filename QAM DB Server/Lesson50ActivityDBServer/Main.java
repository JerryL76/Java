import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

class Main {

    public static void main(String[] args) throws IOException {
        (new Main()).init();
    }

    void init() throws IOException {
        // Port 8500
        int port = 8500;

        // Create server
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

        // Connect to your NEW database
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