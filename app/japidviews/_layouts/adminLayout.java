package japidviews._layouts;
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
// NOTE: This file was generated from: japidviews/_layouts/adminLayout.html
// Change to this file will be lost next time the template file is compiled.
//
@cn.bran.play.NoEnhance
public abstract class adminLayout extends cn.bran.japid.template.JapidTemplateBase
{	public static final String sourceTemplate = "japidviews/_layouts/adminLayout.html";
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


	public adminLayout() {
		super(null);
	}
	public adminLayout(StringBuilder out) {
		super(out);
	}
	@Override public void layout() {
		p("<!DOCTYPE html>\n" + 
"\n" + 
"<!--[if lt IE 7 ]> <html class=\"no-js ie6\" lang=\"en\"> <![endif]-->\n" + 
"<!--[if IE 7 ]>    <html class=\"no-js ie7\" lang=\"en\"> <![endif]-->\n" + 
"<!--[if IE 8 ]>    <html class=\"no-js ie8\" lang=\"en\"> <![endif]-->\n" + 
"<!--[if (gte IE 9)|!(IE)]><!--> <html class=\"no-js\" lang=\"en\"> <!--<![endif]-->\n" + 
"    <head>\n" + 
"        <title>");// line 1
	title();// line 8
p("</title>\n" + 
"        <meta charset=\"utf-8\">\n" + 
"        <link rel=\"shortcut icon\" href=\"/public/favicon.ico\">\n" + 
"        \n" + 
"        <link rel=\"stylesheet\" href=\"/public/css/style.css?v=2\">\n" + 
"        <link rel=\"stylesheet\" href=\"/public/css/css3.css\">\n" + 
"        <link rel=\"stylesheet\" href=\"/public/css/general.css\">\n" + 
"        <link rel=\"stylesheet\" href=\"/public/css/grid.css\">\n" + 
"        ");// line 8
	moreStyles();// line 16
p("\n" + 
"        \n" + 
"        <!-- All JavaScript at the bottom, except for Modernizr which enables HTML5 elements & feature detects -->\n" + 
"  			<script src=\"/public/js/libs/modernizr-1.7.min.js\"></script>\n" + 
"        <!-- Grab Google CDN's jQuery, with a protocol relative URL; fall back to local if necessary -->\n" + 
"	  	  <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.5.2/jquery.js\"></script>\n" + 
"		    <script>window.jQuery || document.write(\"<script src='/public/js/libs/jquery-1.5.2.min.js'>\\x3C/script>\")</script>\n" + 
"    </head>\n" + 
"    <body>\n" + 
"    \n" + 
"    	<div id=\"container\">\n" + 
"    		<header>\n" + 
"   				<nav>\n" + 
"						<ul>\n" + 
"							<li><a href=\"#\">Home</a></li>\n" + 
"							<li><a href=\"#\">About</a></li>\n" + 
"							<li><a href=\"#\">Services</a></li>\n" + 
"							<li><a href=\"#\">Contact</a></li>\n" + 
"						</ul>\n" + 
"					</nav>\n" + 
"   			</header>\n" + 
"    		\n" + 
"        <div id=\"main\" role=\"main\">\n" + 
"        	<section>\n" + 
"        		<h1>");// line 16
	title();// line 40
p("</h1>\n" + 
"        		\n" + 
"        		<div>\n" + 
"        			<div id=\"leftCol\" style=\"width:300px; min-height:400px; float: left;\">\n" + 
"			        	");// line 40
	leftCol();p("			        </div>\n" + 
"			        <div id=\"rightCol\" style=\"margin-left:300px; min-width:600px; min-height:400px;\">\n" + 
"			        	");// line 44
	rightCol();p("			        </div>\n" + 
"			        \n" + 
"			        <div style=\"clear: both;\"></div>\n" + 
"        		</div>\n" + 
"        	</section>\n" + 
"        </div>\n" + 
"        \n" + 
"        <footer>\n" + 
"        	<p>copyright &copy; 2011-2020</p>\n" + 
"        </footer>\n" + 
"    	</div>\n" + 
"    	\n" + 
"    	\n" + 
"    	<!-- JavaScript at the bottom for fast page loading -->\n" + 
"\n" + 
"\n" + 
"		  \n" + 
"		  <!-- scripts concatenated and minified via ant build script-->\n" + 
"		  <script src=\"/public/js/plugins.js\"></script>\n" + 
"		  <script src=\"/public/js/script.js\"></script>\n" + 
"      <script src=\"/public/js/mylibs/jquery.form.js\"></script>\n" + 
"      <script src=\"/public/js/mylibs/jquery.metadata.js\"></script>\n" + 
"		  <script src=\"/public/js/mylibs/utils.js\"></script>\n" + 
"\n" + 
"		  ");// line 47
	moreScripts();p("		  <!-- end scripts-->\n" + 
"		\n" + 
"		\n" + 
"		  <!--[if lt IE 7 ]>\n" + 
"		    <script src=\"js/libs/dd_belatedpng.js\"></script>\n" + 
"		    <script>DD_belatedPNG.fix(\"img, .png_bg\"); // Fix any <img> or .png_bg bg-images. Also, please read goo.gl/mZiyb </script>\n" + 
"		  <![endif]-->\n" + 
"  \n" + 
"  \n" + 
"    </body>\n" + 
"</html>");// line 72
	}
	 protected void moreStyles() {};
	 protected void title() {};
	 protected void leftCol() {};
	 protected void rightCol() {};
	 protected void moreScripts() {};

	protected abstract void doLayout();
}