package jar.sob.workshop.methodsSupport;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static jar.sob.workshop.services.DatabaseService.getDataBaseService;

public class DatabaseMethods extends BaseMethods {

  protected static final Logger log = LogManager.getLogger();
  private Connection connection = getDataBaseService().getConnection();
  private ResultSet rs;
  private PreparedStatement pstmt;

  public String getStringFromDatabase(String table, String columnName, String value, String columnExpected) {

    String query = "SELECT * FROM " + table + " WHERE " + columnName + " = \"" + value + "\"";
    try {
      pstmt = connection.prepareStatement(query);
      rs = pstmt.executeQuery();
      if (rs.next()) return rs.getString(columnExpected);
    } catch (SQLException e) {
      e.printStackTrace();
      log.error(e.getMessage());
    }
    log.info("No expected value for used query \"" + query + "\"");
    return "";
  }

  public File getFileFromDatabase(String table, String columnName, String value, String columnExpected, String fileName) {
    String query = "SELECT " + columnExpected + " FROM " + table + " WHERE " + columnName + " = \"" + value + "\"";
    FileOutputStream output;
    File file;
    try {
      pstmt = connection.prepareStatement(query);
      rs = pstmt.executeQuery();
      file = new File(fileName);
      output = new FileOutputStream(file);
      if (rs.next()) {
        InputStream input = rs.getBinaryStream(columnExpected);
        byte[] buffer = new byte[1024];
        while (input.read(buffer) > 0) output.write(buffer);
        output.close();
        log.info("Write file in to: " + file.getAbsolutePath());
        return file;
      }
    } catch (SQLException e) {
      e.printStackTrace();
      log.error(e.getMessage());
    } catch (IOException e) {
      e.printStackTrace();
      log.error("No expected file to write");
    }
    log.info("No expected value for used query \"" + query + "\"");
    return null;
  }

  public void deleteFile(String fileName) {
    if (new File(fileName).delete()) log.info("File: \"" + fileName + "\" deleted");
  }

}
