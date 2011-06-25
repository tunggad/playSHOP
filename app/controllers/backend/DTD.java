package controllers.backend;

import cn.bran.play.JapidController;
import com.mongodb.DBObject;
import de.playshop.core.services.DTDService;


import javax.inject.Inject;
import java.util.List;

/**
 * @author <a href="mailto:tunggad@yahoo.com">Vu Duc Tung</a>
 *         Date: 11.06.11
 *         Time: 13:33
 *         Since Version:
 */
public class DTD extends JapidController{
  @Inject
  private static DTDService dtdService;

  public static void save(String json) {
    String msg = dtdService.saveJSON(json);
    List<DBObject> dtdList = dtdService.getAllDTD();
    renderJapid(msg, dtdList);
  }

  public static void myAjax(String value, Integer age, String job) {
    renderText("<span style='color:red'>"+value+"</span> - <span style='color:green;'>"+age+"</span> - <span style='color:yellow;'>"+job+"</span>");
  }

  public static void setup() {
    dtdService.createDTDCollection();
    renderText("dtd collection has been created.");
  }
}
