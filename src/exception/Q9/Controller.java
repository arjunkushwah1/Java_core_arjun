package exception.Q9;
import java.sql.SQLException;
class  ServiceLayerException extends Exception {
    public ServiceLayerException(String msg,Throwable cause) {
        super(msg,cause);
    }
}
class Repository {
    public  void fetchData() throws SQLException {
        throw new SQLException("database connection failed.");
    }
}
class Service {
    Repository repo = new Repository();
    public void fetchData() throws ServiceLayerException {
        try {
            repo.fetchData();
        }
        catch (SQLException e) {
            throw new ServiceLayerException("Service  failed to fetch data.", e);
        }
    }
}
public class Controller {
    public static void main(String[] args) {
        Service service = new Service();
        try {
            service.fetchData();
        }
        catch (ServiceLayerException e) {
            System.out.println("controller caught exception: "+e.getMessage());
            System.out.println("original cause: " + e.getCause());
        }
    }
}
