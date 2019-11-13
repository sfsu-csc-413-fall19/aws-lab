package demo;

import static spark.Spark.*;

public class SparkDemo {
  public static void main(String[] args) {
    port(1235);
    staticFiles.externalLocation(System.getProperty("user.dir") + "/front-end"); // Static files location

    webSocket("/ws", WebSocketHandler.class);

    get("/hello", (req, res) -> "hi");
  }
}
