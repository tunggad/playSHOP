package japidviews.backend.DTD;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
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
// NOTE: This file was generated from: japidviews/backend/DTD/save.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class save extends cn.bran.japid.template.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/backend/DTD/save.html";
{
	headers.put("Content-Type", "application/json; charset=utf-8");
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


	public save() {
		super(null);
	}
	public save(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
public static final String[] argNames = new String[] {/* args of the template*/"msg", "dtdList",  };
public static final String[] argTypes = new String[] {/* arg types of the template*/"String", "List<DBObject>",  };
public static final Object[] argDefaults= new Object[] {null,null, };
public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.backend.DTD.save.class);
{
	setRenderMethod(renderMethod);
	setArgNames(argNames);
	setArgTypes(argTypes);
	setArgDefaults(argDefaults);
}
////// end of named args stuff

	private String msg;
	private List<DBObject> dtdList;
	public cn.bran.japid.template.RenderResult render(String msg,List<DBObject> dtdList) {
		this.msg = msg;
		this.dtdList = dtdList;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
//------
;// line 1
p("\n");// line 2
p("\n" + 
"\n" + 
"  ");// line 3
// line 5
p("\n" + 
"  ");// line 7
// line 9
p("\n" + 
"{ \"statusMsg\" : \"<span style='color: #ff0000;'>");// line 12
p(msg);// line 14
p("</span>\",\n" + 
"  \"dtdList\" : \"");// line 14
p(escapedDtdList().trim());// line 15
p("\" }");// line 15

	}

public String _dtdList() {
StringBuilder sb = new StringBuilder();
StringBuilder ori = getOut();
this.setOut(sb);
final _dtdList __dtdList1 = new _dtdList(getOut());
{ __dtdList1.setActionRunners(getActionRunners()); }

// line 5
    __dtdList1.render(dtdList);
// line 6
p("\n" + 
"  ");// line 6

this.setOut(ori);
return sb.toString();
}
public String escapedDtdList() {
StringBuilder sb = new StringBuilder();
StringBuilder ori = getOut();
this.setOut(sb);
// line 9
    String escapsed = escapeJavaScript(_dtdList());// line 10
p("\n" + 
"    ");// line 10
p(escapsed);// line 11
p("\n" + 
"  ");// line 11

this.setOut(ori);
return sb.toString();
}
}