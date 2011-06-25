package japidviews._tags;
import java.util.*;
import java.io.*;
import cn.bran.japid.tags.Each;
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
// NOTE: This file was generated from: japidviews/_tags/ajaxForm.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class ajaxForm extends cn.bran.japid.template.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/_tags/ajaxForm.html";
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


	public ajaxForm() {
		super(null);
	}
	public ajaxForm(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
public static final String[] argNames = new String[] {/* args of the template*/"id", "action", "target", "reRender", "dataType", "beforeSerialize", "beforeSubmit", "success", "clearForm", "cssClass", "onOverlay",  };
public static final String[] argTypes = new String[] {/* arg types of the template*/"String", "String", "String", "String", "String", "String", "String", "String", "Boolean", "String", "Boolean",  };
public static final Object[] argDefaults= new Object[] {null,null,null,null,"html",null,null,null,true,null,null, };
public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.ajaxForm.class);
{
	setRenderMethod(renderMethod);
	setArgNames(argNames);
	setArgTypes(argTypes);
	setArgDefaults(argDefaults);
}
////// end of named args stuff

	private String id;
	private String action;
	private String target;
	private String reRender;
	private String dataType;
	private String beforeSerialize;
	private String beforeSubmit;
	private String success;
	private Boolean clearForm;
	private String cssClass;
	private Boolean onOverlay;
public cn.bran.japid.template.RenderResult render(DoBody body, cn.bran.japid.compiler.NamedArgRuntime... named) {
    Object[] args = buildArgs(named, body);
    return runRenderer(args);
}

	private DoBody body;
	public static interface DoBody {
		 void render();
	}
	public cn.bran.japid.template.RenderResult render(String id,String action,String target,String reRender,String dataType,String beforeSerialize,String beforeSubmit,String success,Boolean clearForm,String cssClass,Boolean onOverlay, DoBody body) {
		this.body = body;
		this.id = id;
		this.action = action;
		this.target = target;
		this.reRender = reRender;
		this.dataType = dataType;
		this.beforeSerialize = beforeSerialize;
		this.beforeSubmit = beforeSubmit;
		this.success = success;
		this.clearForm = clearForm;
		this.cssClass = cssClass;
		this.onOverlay = onOverlay;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
//------
;// line 1
p("\n" + 
"\n" + 
"        <form id=\"");// line 5
p(id);// line 7
p("\" action=\"");// line 7
p(action);// line 7
p("\" method=\"post\">\n" + 
"          ");// line 7
if (body != null)
	body.render();
p("\n" + 
"        </form>\n" + 
"\n" + 
"\n" + 
"        ");// line 8
String initSnip=null;// line 12
p("\n" + 
"        \n" + 
"        ");// line 12
if(asBoolean(onOverlay)) {// line 14
          initSnip = "setTimeout('initAjaxForm_"+id+"()',10);\n            function initAjaxForm_"+id+"()";// line 15
p("\n" + 
"        ");// line 16
}// line 17
        else initSnip = "$(document).ready(function()";// line 18
p("\n" + 
"\n" + 
"\n" + 
"        ");// line 18
String targetSnip = "";// line 21
        String dataTypeSnip = "dataType: '"+dataType+"',";// line 22
p("\n" + 
"        ");// line 22
if( dataType.equals("html") && target != "" ) {// line 23
          targetSnip = "target: '"+target+"',";// line 24
p("\n" + 
"          ");// line 24
dataTypeSnip = "";// line 25
p("\n" + 
"        ");// line 25
}// line 26
p("\n" + 
"        ");// line 26
String successSnip = "";// line 28
        String callbackSnip = "";// line 29
        if ( dataType.equals("html") ) {// line 30
          successSnip = "success: htmlSuccess_"+id+",";// line 31
p("\n" + 
"          ");// line 31
callbackSnip = "function htmlSuccess_"+id+" (responseText, statusText, xhr, jqForm) {\n                                var data = responseText;\n                                "+reRenderSnip(reRender, dataType)+"\n                                "+success+"\n          }";// line 32
p("\n" + 
"\n" + 
"        ");// line 36
} else if ( dataType.equals("json") ) {// line 38
          successSnip = "success: jsonSuccess_"+id+",";// line 39
p("\n" + 
"          ");// line 39
callbackSnip = "function jsonSuccess_"+id+" (data) {\n                            "+reRenderSnip(reRender, dataType)+"\n                            "+success+"\n          }";// line 40
p("\n" + 
"\n" + 
"        ");// line 43
} else if ( dataType.equals("xml") ) {// line 45
          successSnip = "success: xmlSuccess_"+id+",";// line 46
p("\n" + 
"          ");// line 46
callbackSnip = "function xmlSuccess_"+id+" (responseXML, statusText, xhr, jqForm) {\n                              "+success+"\n          }";// line 47
p("\n" + 
"        ");// line 49
}// line 50
p("\n" + 
"        ");// line 50
String bindSnip = "$('#"+id+"').ajaxForm(options);";// line 52
p("\n" + 
"\n" + 
"        <script type='text/javascript'>\n" + 
"          ");// line 52
p(initSnip);// line 55
p(" {\n" + 
"            var options = {\n" + 
"              ");// line 55
p(targetSnip);// line 57
p("\n" + 
"              ");// line 57
p(dataTypeSnip);// line 58
p("\n" + 
"              clearForm: ");// line 58
p(clearForm);// line 59
p(",\n" + 
"              beforeSerialize: beforeSerialize_");// line 59
p(id);// line 60
p(",\n" + 
"              beforeSubmit: beforeSubmit_");// line 60
p(id);// line 61
p(",\n" + 
"              ");// line 61
p(successSnip);// line 62
p("\n" + 
"              cache: false\n" + 
"            };\n" + 
"\n" + 
"            // init ajaxForm plugin\n" + 
"            ");// line 62
p(bindSnip);// line 67
p("\n" + 
"          }");// line 67
p(asBoolean(onOverlay) ? "" : ");");// line 68
p("\n" + 
"\n" + 
"          function beforeSerialize_");// line 68
p(id);// line 70
p(" (jqForm, options) {\n" + 
"            ");// line 70
p(asBoolean(beforeSerialize) ? "return "+beforeSerialize+"" : "return true;");// line 71
p("\n" + 
"          }\n" + 
"\n" + 
"          function beforeSubmit_");// line 71
p(id);// line 74
p(" (formData, jqForm, options) {\n" + 
"            ");// line 74
p(asBoolean(beforeSubmit) ? "return "+beforeSubmit+"" : "return true;");// line 75
p("\n" + 
"          }\n" + 
"\n" + 
"          ");// line 75
p(callbackSnip);// line 78
p("\n" + 
"        </script>\n");// line 78

	}

}