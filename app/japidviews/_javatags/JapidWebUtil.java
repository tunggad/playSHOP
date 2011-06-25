package japidviews._javatags;

import play.Logger;

/**
 * a well-know place to add all the static method you want to use in your
 * templates.
 * 
 * All the public static methods will be automatically "import static " to the
 * generated Java classes by the Japid compiler.
 * 
 */
public class JapidWebUtil {
  /**
   *
   * @param bindDirective   Examples: "#someDivId" or "#otherDivId | click" or ".someClass | mouseover | live"
   * @param handlerSnip
   * @param onDocumentReady
   * @return
   */
  public static String eventBindingSnip(String bindDirective, String handlerSnip, Boolean onDocumentReady) {
    Logger.debug("bindDirective = %s", bindDirective);
    if(bindDirective.equals("")) return "";
    
    String[] elements = bindDirective.split("\\|"); // [".someClass", "mouseover", "live"]

    StringBuilder sb = new StringBuilder("");
    if(onDocumentReady) sb.append("$(document).ready(function() {\n");

    if(elements.length == 1) f(sb, "$('%s').click(function(e){ %s });\n", elements[0], handlerSnip);
    else if(elements.length == 2) f(sb, "$('%s').bind('%s', function(e) { %s });\n", elements[0], elements[1], handlerSnip);
    else if(elements.length == 3) f(sb, "$('%s').%s('%s', function(e) { %s });\n", elements[0], elements[2], elements[1], handlerSnip);

    if(onDocumentReady) sb.append("});\n");

    return sb.toString();
  }

  /**
   *
   * @param reRender  Examples html: "#someDivId", "#otherDivId | html, .someClass|append"
   *                  Examples json: "jsonKey1 | #otherDivId, jsonKey2|.someClass", "jsonKey1|#someDivId|append, jsonKey2|.someClass|replace"
   *
   * @param dataType  "html" or "json"
   * @return
   */
  public static String reRenderSnip(String reRender, String dataType) {
    Logger.debug("reRender attribute = '%s'", reRender);
    if(reRender.equals("")) return "";

    StringBuilder sb = new StringBuilder("");

    String[] reRenderDirectives = reRender.split("\\,");
    Logger.debug("reRenderDirectives size = %s", reRenderDirectives.length);
    for(int i=0; i<reRenderDirectives.length; i++) {
      processOneDirective(reRenderDirectives[i].trim(), dataType, sb);
    }

    return sb.toString();
  }

  private static void processOneDirective(String directive, String dataType, StringBuilder sb) {
    Logger.debug("one directive = %s", directive);
    if(directive.equals("")) return;

    String[] elements = directive.split("\\|");
    Logger.debug("elements size = %s", elements.length);
    if(elements.length == 1) {
      if(dataType == null || dataType.equals("html") || dataType.equals("")) {
        sb.append(String.format("$('%s').html(data); \n", elements[0].trim()));
      }
    }
    else if(elements.length == 2) {
      if(dataType.equals("json")) {
        sb.append(String.format("if(data.%s != undefined) $('%s').html(data.%s); \n",
                elements[0].trim(), elements[1].trim(), elements[0].trim()));
      }
      else if(dataType == null || dataType.equals("html") || dataType.equals("")) {
        sb.append(String.format("$('%s').%s(data); \n", elements[0].trim(), elements[1].trim()));
      }
    }
    else if(elements.length == 3) {
      if(dataType.equals("json")) {
        sb.append(String.format("if(data.%s != undefined) $('%s').%s(data.%s); \n",
                elements[0].trim(), elements[1].trim(), elements[2].trim(), elements[0].trim()));
      }
    }
  }

  public static String f(String template, Object... args) {
    return String.format(template, args);
  }

  public static void f(StringBuilder sb, String template, Object... args) {
    sb.append(String.format(template, args));
  }
}
