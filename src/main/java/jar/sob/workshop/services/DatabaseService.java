package jar.sob.workshop.services;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseService { // MYSQL

  protected static final Logger log = LogManager.getLogger();
  private static DatabaseService instance = null;
  private Connection connection;

  private DatabaseService() {
    try {
      connection = DriverManager
          .getConnection(ConfigService.getConfigService().getStringProperty(""), //connected with file databaseConfig.yaml
              ConfigService.getConfigService().getStringProperty(""),
              ConfigService.getConfigService().getStringProperty(""));
      connection.setAutoCommit(true);
      log.info("Connected to database" + ConfigService.getConfigService().getStringProperty(""));
    } catch (SQLException e) {
      e.printStackTrace();
      log.error("Database connection failed");
    }
  }

  public static DatabaseService getDataBaseService() {
    if (instance == null) {
      instance = new DatabaseService();
    }
    return instance;
  }

  public Connection getConnection() {
    return connection;
  }
}
