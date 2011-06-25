package japidviews.backend.Admin;
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
// NOTE: This file was generated from: japidviews/backend/Admin/index.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public class index extends adminLayout
{	public static final String sourceTemplate = "japidviews/backend/Admin/index.html";
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


	public index() {
		super(null);
	}
	public index(StringBuilder out) {
		super(out);
	}
/* based on https://github.com/branaway/Japid/issues/12
 */
public static final String[] argNames = new String[] {/* args of the template*/"dtdList",  };
public static final String[] argTypes = new String[] {/* arg types of the template*/"List<DBObject>",  };
public static final Object[] argDefaults= new Object[] {null, };
public static java.lang.reflect.Method renderMethod = getRenderMethod(japidviews.backend.Admin.index.class);
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
//------
p("    ");// line 1
    p("\n" + 
"    ");// line 2
// line 4
p("\n" + 
"    ");// line 4
p("\n" + 
"\n" + 
"    ");// line 6
// line 9
p("\n" + 
"    ");// line 9
// line 11
    // line 15
// line 50
// line 119

	}

	@Override protected void moreStyles() {
		// line 119
p("<style>\n" + 
"	#editor {\n" + 
"	    position: relative;\n" + 
"	    width: 500px;\n" + 
"	    height: 400px;\n" + 
"	}\n" + 
"</style>\n");// line 119
;
	}
	@Override protected void title() {
		p("playSHOP Dashboard");;
	}
	@Override protected void leftCol() {
		// line 11
p("    <div>left-col</div>\n" + 
"    ");// line 11
;
	}
	@Override protected void rightCol() {
final ajaxForm _ajaxForm4 = new ajaxForm(getOut());
{ _ajaxForm4.setActionRunners(getActionRunners()); }

final ajax _ajax5 = new ajax(getOut());
{ _ajax5.setActionRunners(getActionRunners()); }

final japidviews.backend.DTD._dtdList _japidviews_backend_DTD__dtdList6 = new japidviews.backend.DTD._dtdList(getOut());
{ _japidviews_backend_DTD__dtdList6.setActionRunners(getActionRunners()); }

		// line 15
p("    <div>\n" + 
"        <div class=\"left\" style=\"width: 520px;\">\n" + 
"          <div id=\"editor\"></div>\n" + 
"\n" + 
"          ");// line 15
_ajaxForm4.render(new ajaxForm.DoBody(){
public void render() {
// line 20
p("              <input id=\"dtdJSON\" type=\"hidden\" name=\"json\" />\n" + 
"              <input type=\"submit\" value=\"save\" />\n" + 
"          ");// line 23

}
}
, named("id", "saveDTDForm"), named("beforeSerialize", "dtdEditor.save();"), named("action", "/DTD/save"), named("dataType", "json"), named("reRender", "statusMsg|#statusMsg, dtdList|#dtdListWrapper"));
// line 20
p("          <div>\n" + 
"            <a id=\"setupDTDButton\" href=\"#\">Setup DTD Storage</a>\n" + 
"          </div>\n" + 
"\n" + 
"          <div id=\"statusMsg\"></div>\n" + 
"\n" + 
"          ");// line 26
_ajax5.render(named("name", "setupDTD"), named("url", "/DTD/setup"), named("reRender", "#statusMsg"), named("event", "#setupDTDButton"));
// line 34
p("        </div>\n" + 
"\n" + 
"        <div class=\"left\" style=\"width: 300px;\">\n" + 
"          <h3>All DTD</h3>\n" + 
"          <div id=\"dtdListWrapper\">\n" + 
"            ");// line 36
_japidviews_backend_DTD__dtdList6.render(dtdList);
// line 42
p("          </div>\n" + 
"        </div>\n" + 
"\n" + 
"        <div class=\"clear\"></div>\n" + 
"    </div>\n" + 
"    ");// line 42
;
	}
	@Override protected void moreScripts() {
		// line 50
p("<script src=\"/public/js/ace/ace.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n" + 
"<script src=\"/public/js/ace/theme/theme-vibrant_ink.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n" + 
"<script src=\"/public/js/ace/mode/mode-javascript.js\" type=\"text/javascript\" charset=\"utf-8\"></script>\n" + 
"<script>\n" + 
"  var dtdEditor;\n" + 
"\n" + 
"	window.onload = function() {\n" + 
"	    var editor = ace.edit('editor');\n" + 
"	    editor.setTheme('ace/theme/vibrant_ink');\n" + 
"	    \n" + 
"	    var JavaScriptMode = require('ace/mode/javascript').Mode;\n" + 
"	    editor.getSession().setMode(new JavaScriptMode());\n" + 
"\n" + 
"      dtdEditor = new DTDEditor(editor);\n" + 
"\n" + 
"      $('.loadDTD').live('click', function() {\n" + 
"        var index = $(this).metadata().index;\n" + 
"        var content = $('#json_'+index).text().trim();\n" + 
"        dtdEditor.load(content);\n" + 
"      });\n" + 
"\n" + 
"      $('.hideshowDTD').live('click', function() {\n" + 
"        var index = $(this).metadata().index;\n" + 
"        Utils.blindUpDown($('#json_'+index));\n" + 
"      });\n" + 
"	};\n" + 
"\n" + 
"  function DTDEditor(aceEditor) {\n" + 
"    this.aceEditor = aceEditor;\n" + 
"\n" + 
"    this.save = function() {\n" + 
"      $('#dtdJSON').attr('value', this.aceEditor.getSession().getValue());\n" + 
"    }\n" + 
"\n" + 
"    this.load = function(content) {\n" + 
"      var currDepth = 0;\n" + 
"      for(var i=0; i<content.length; i++) {\n" + 
"        var token = '\\n';\n" + 
"\n" + 
"        if(content.charAt(i) == '{') {\n" + 
"          currDepth++;\n" + 
"          for(var j=0; j<currDepth; j++) token += '\\t';\n" + 
"\n" + 
"          content = content.substring(0, i+1) + token + content.slice(i+1);\n" + 
"          i += 1 + currDepth;\n" + 
"        }\n" + 
"        else if(content.charAt(i) == '}') {\n" + 
"          currDepth--;\n" + 
"          for(var j=0; j<currDepth; j++) token += '\\t';\n" + 
"\n" + 
"          content = content.substring(0, i) + token + content.slice(i);\n" + 
"          i += 1 + currDepth;\n" + 
"        }\n" + 
"        else if(content.charAt(i) == ',') {\n" + 
"          for(var j=0; j<currDepth; j++) token += '\\t';\n" + 
"\n" + 
"          content = content.substring(0, i+1) + token + content.slice(i+1);\n" + 
"          i += 1 + currDepth;\n" + 
"        }\n" + 
"      }\n" + 
"\n" + 
"      this.aceEditor.getSession().setValue(content);\n" + 
"    }\n" + 
"  };\n" + 
"\n" + 
"</script>\n");// line 50
;
	}
}