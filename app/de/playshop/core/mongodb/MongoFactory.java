package de.playshop.core.mongodb;

import com.mongodb.Mongo;
import play.Logger;
import play.Play;

import java.net.UnknownHostException;

/**
 * @author <a href="mailto:tunggad@yahoo.com">Vu Duc Tung</a>
 *         Date: 09.06.11
 *         Time: 19:10
 *         Since Version:
 */
public class MongoFactory {
  private static Mongo mongo;

  public static Mongo getInstance() {
    if(mongo != null) return mongo;

    String mongoHost = (String) Play.configuration.get("mongodb.host");
    int mongoPort = Integer.parseInt((String) Play.configuration.get("mongodb.port"));
    try{
      Logger.info("Connecting to MongoDB at %s:%s ...", mongoHost, mongoPort);
      mongo = new Mongo(mongoHost, mongoPort);
      Logger.info("SUCCESSFUL connected to MongoDB at %s:%s.", mongoHost, mongoPort);
    } catch (UnknownHostException hostE) {
      Logger.error(hostE, "Could not connect to MongoDB at %s, hostname could not be resolved", mongoHost);
    }

    return mongo;
  } 

  private MongoFactory() {
  }
}
