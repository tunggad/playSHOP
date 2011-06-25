package japidviews.backend.DTD;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
import com.mongodb.util.JSON;
import com.mongodb.DBObject;
import static play.templates.JavaExtensions.*;
import static cn.bran.play.JapidPlayAdapter.*;
import static play.data.validation.Validation.*;
import japidviews._layouts.*;
import play.i18n.Messages;
import play.data.validation.Validation;
import play.mvc.Scope.*;
import models.*;
import static japidviews._javatags.JapidWebUtil.*;
import play.data.validation.Error;
import play.i18n.Lang;
import japidviews._tags.*;
import play.mvc.Http.*;
import controllers.*;
import japidviews._javatags.*;
//
// NOTE: This file was generated from: japidviews/backend/DTD/_dtdList.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class _dtdList extends cn.bran.japid.template.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/backend/DTD/_dtdList.html";
{
	headers.put("Content-Type", "text/html; charset=utf-8");
}

// - add implicit fields with Play

	final Request request = Request.current(); 
	final Response response = Response.current(); 
	final Session session = Session.current();
	final RenderArgs renderArgs = RenderArgs.current();
	final Params params = Params.current();
	final Validation validation = Validation.current();
	final cn.bran.play.FieldErrors errors = new cn.bran.play.FieldErrors(validation);
	final play.Play _play = new play.Play(); 

// - end of implicit fields with Play 


	public _dtdList() {
		super(null);
	}
	public _dtdList(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
public static final String[] argNames = new String[] {/* args of the template*/"dtdList",  };
public static final String[] argTypes = new String[] {/* arg types of the template*/"List<DBObject>",  };
public static final Object[] argDefaults= new Object[] {null, };
public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.backend.DTD._dtdList.class);
{
	setRenderMethod(renderMethod);
	setArgNames(argNames);
	setArgTypes(argTypes);
	setArgDefaults(argDefaults);
}
////// end of named args stuff

	private List<DBObject> dtdList;
	public cn.bran.japid.template.RenderResult render(List<DBObject> dtdList) {
		this.dtdList = dtdList;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {

// -- set up the tag objects
final Each _Each0 = new Each(getOut());
{ _Each0.setActionRunners(getActionRunners()); }

// -- end of the tag objects

//------
;// line 1
p("\n");// line 1
p("\n");// line 2
p("\n" + 
"<ul>\n" + 
"  ");// line 3
_Each0.render(dtdList, new Each.DoBody<DBObject>(){
public void render(final DBObject dtd, final int _size, final int _index, final boolean _isOdd, final String _parity, final boolean _isFirst, final boolean _isLast) {
// line 5
p("    <li>\n" + 
"      <h5 class=\"hideshowDTD {index:");// line 5
p(_index);// line 7
p("}\">");// line 7
p(dtd.get("package") + "." + dtd.get("class"));// line 7
p("</h5>\n" + 
"      <p id=\"json_");// line 7
p(_index);// line 8
p("\" class=\"hide\">");// line 8
p(JSON.serialize(dtd));// line 8
p("</p>\n" + 
"      <div class=\"align_right\">\n" + 
"        <a href=\"#\" class=\"loadDTD {index:");// line 8
p(_index);// line 10
p("}\">load</a> |\n" + 
"        <a href=\"#\" class=\"hideshowDTD {index:");// line 10
p(_index);// line 11
p("}\">hide/show</a>\n" + 
"      </div>\n" + 
"    </li>\n" + 
"  ");// line 11

}
}
);
// line 5
p("</ul>\n" + 
"<script type=\"text/javascript\">alert(\"hello\");</script>");// line 14

	}

}