package de.playshop.core.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mongodb.*;
import com.mongodb.util.JSON;
import play.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * @author <a href="mailto:tunggad@yahoo.com">Vu Duc Tung</a>
 *         Date: 19.06.11
 *         Time: 17:12
 *         Since Version: 0.1
 */
@Singleton
public class DTDService {
  public static final String SUCCESSFUL_SAVED = "successful saved";
  @Inject
  private Mongo mongo;


  public void createDTDCollection() {
    mongo.getDB("playshop").createCollection("dtd", null);

    BasicDBObject indexDef = new BasicDBObject();
    indexDef.put("name", 1);
    getDTDColl().ensureIndex(indexDef);

    Logger.debug("dtd collection successful created");
  }

  public String saveJSON(String json) {
    Logger.debug("Save dtd json...\n%s", json);
    WriteResult result = getDTDColl().save((DBObject) JSON.parse(json));
    if(result.getError() != null) {
      Logger.debug("JSON saving error = " + result.getError());
      return result.getError();
    }

    Logger.debug("dtd json saved");
    return SUCCESSFUL_SAVED;
  }

  public List<DBObject> getAllDTD() {
    List<DBObject> dtdList = new ArrayList<DBObject>();

    DBCursor cur = getDTDColl().find();
    while (cur.hasNext()) {
      DBObject dtd = cur.next();
      Logger.debug("_id : "+dtd.get("_id"));
      dtdList.add(dtd);
    }
    
    return dtdList;
  }

  private DBCollection getDTDColl() {
    return mongo.getDB("playshop").getCollection("dtd");
  }
}
