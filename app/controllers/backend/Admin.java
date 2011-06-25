package controllers.backend;

import cn.bran.play.JapidController;
import com.mongodb.DBObject;
import de.playshop.core.services.DTDService;
import play.Logger;

import javax.inject.Inject;
import java.util.List;

public class Admin extends JapidController {
  @Inject
  private static DTDService dtdService;

	public static void index() {
    Logger.debug("Welcome in playSHOP Dashboard!");
    List<DBObject> dtdList = dtdService.getAllDTD();

		renderJapid(dtdList);
	}
}
