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
// NOTE: This file was generated from: japidviews/_tags/ajax.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class ajax extends cn.bran.japid.template.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/_tags/ajax.html";
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


	public ajax() {
		super(null);
	}
	public ajax(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
public static final String[] argNames = new String[] {/* args of the template*/"name", "url", "type", "data", "reRender", "dataType", "beforeSend", "success", "jsData", "cache", "event",  };
public static final String[] argTypes = new String[] {/* arg types of the template*/"String", "String", "String", "String", "String", "String", "String", "String", "String", "Boolean", "String",  };
public static final Object[] argDefaults= new Object[] {null,null,null,null,null,"html",null,null,null,null,null, };
public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews._tags.ajax.class);
{
	setRenderMethod(renderMethod);
	setArgNames(argNames);
	setArgTypes(argTypes);
	setArgDefaults(argDefaults);
}
////// end of named args stuff

	private String name;
	private String url;
	private String type;
	private String data;
	private String reRender;
	private String dataType;
	private String beforeSend;
	private String success;
	private String jsData;
	private Boolean cache;
	private String event;
	public cn.bran.japid.template.RenderResult render(String name,String url,String type,String data,String reRender,String dataType,String beforeSend,String success,String jsData,Boolean cache,String event) {
		this.name = name;
		this.url = url;
		this.type = type;
		this.data = data;
		this.reRender = reRender;
		this.dataType = dataType;
		this.beforeSend = beforeSend;
		this.success = success;
		this.jsData = jsData;
		this.cache = cache;
		this.event = event;
		long t = -1;
		super.layout();
		return new cn.bran.japid.template.RenderResultPartial(this.headers, getOut(), t, actionRunners);
	}
	@Override protected void doLayout() {
//------
p("    ");// line 1
p("\n" + 
"\n" + 
"        ");// line 4
String typeSnip = "GET";// line 6
p("\n" + 
"        ");// line 6
if(asBoolean(type)) {// line 7
          typeSnip = type;// line 8
p("\n" + 
"        ");// line 8
}// line 9
p("\n" + 
"        ");// line 9
String dataSnip = "{}";// line 11
p("\n" + 
"        ");// line 11
if(asBoolean(data)) {// line 12
          dataSnip = data;// line 13
p("\n" + 
"        ");// line 13
}// line 14
p("\n" + 
"        ");// line 14
String mergingParamsSnip = "";// line 16
p("\n" + 
"        ");// line 16
if(asBoolean(jsData)) {// line 17
          mergingParamsSnip = "Utils.mergeParams( params, "+jsData+");\n";// line 18
p("\n" + 
"        ");// line 18
}// line 19
p("\n" + 
"        <script type=\"text/javascript\">\n" + 
"            var ");// line 19
p(name);// line 22
p(" =  function(jsParams_");// line 22
p(name);// line 22
p(") {\n" + 
"                var params = ");// line 22
p(dataSnip);// line 23
p(";\n" + 
"                ");// line 23
p(mergingParamsSnip);// line 24
p("\n" + 
"                if( jsParams_");// line 24
p(name);// line 25
p(" ) params = Utils.mergeParams(params, jsParams_");// line 25
p(name);// line 25
p(");\n" + 
"\n" + 
"                $.ajax({\n" + 
"                    type:       '");// line 25
p(typeSnip);// line 28
p("',\n" + 
"                    url:        '");// line 28
p(url);// line 29
p("',\n" + 
"                    data:       params,\n" + 
"                    dataType:   '");// line 29
p(dataType);// line 31
p("',\n" + 
"\n" + 
"                    beforeSend: function(jqXHR, settings) {\n" + 
"                        ");// line 31
p(beforeSend);// line 34
p("\n" + 
"                    },\n" + 
"\n" + 
"                    success:    function(data, textStatus, jqXHR) {\n" + 
"                        ");// line 34
p(reRenderSnip(reRender, dataType));// line 38
p("\n" + 
"\n" + 
"                        ");// line 38
p(success);// line 40
p("\n" + 
"                    }\n" + 
"                });\n" + 
"            }\n" + 
"\n" + 
"            ");// line 40
p(eventBindingSnip(event, name+"();", false));// line 45
p("\n" + 
"        </script>");// line 45

	}

}