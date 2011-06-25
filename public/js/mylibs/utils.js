/*
   Hilfe Class
*/	
function Utils()
{
	
};	


/*
	@return array of [curleft, curtop]
 */
Utils.findPos = function(obj)
{
    var curleft = curtop = 0;
    if (obj.offsetParent)
    {
       do
   	   {
         curleft += obj.offsetLeft;
         curtop  += obj.offsetTop;
       } while (obj = obj.offsetParent);

      return [curleft,curtop];
     }
};



Utils.setToolTipPosition = function(obj, toolTipId){
      var offsetMap = obj.offset();
      var toolTipTop = offsetMap.top - 20;
      var toolTipLeft =  offsetMap.left  + obj[0].offsetWidth + 15;
      $("#"+toolTipId).css("position", "fixed" );
      $("#"+toolTipId).css('top',  toolTipTop);
      $("#"+toolTipId).css('left', toolTipLeft);
      $("#"+toolTipId).css('display', 'block');
};


/**
 * Blinds up or down an block element.
 *
 * @param ele - element id as String or jQuery object.
 */
Utils.blindUpDown = function(ele) {
    if(ele instanceof Object) {
        if(ele.is(':hidden'))
        {
            ele.slideDown("slow");
        }
        else
        {
            ele.slideUp("slow");
        }
    }
    else {
        if($('#'+ele).is(':hidden'))
        {
            $('#'+ele).slideDown("slow");
        }
        else
        {
            $('#'+ele).slideUp("slow");
        }
    }
}


Utils.mergeParams = function (mergeParams, jsParamsMap)
{
    for (var key in jsParamsMap) {
        mergeParams[key] = jsParamsMap[key];
    }

    return mergeParams;
}


Utils.gotoAnchor = function (anchorName)
{
      log.debug("anchorName: " + anchorName);
      var anchorRef = "#"+anchorName;
      var urlWithoutAnchor = document.location;
      if(document.location.toString().match("#"))
      {
          urlWithoutAnchor = document.location.toString().split("#")[0];
      }

      document.location=urlWithoutAnchor + anchorRef;
}


Utils.disableLinksByElement = function(el) {
  if (document.getElementById && document.getElementsByTagName) {
    if (typeof(el) == 'string') {
      el = document.getElementById(el);
    }
    var anchors = el.getElementsByTagName('a');
    for (var i=0, end=anchors.length; i<end; i++) {
      anchors[i].onclick = function() {
        return false;
      };
    }
  }
}
