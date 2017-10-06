/*** JAM a html template render engine 
 *   @autthor		: arpanpathak & pranitbose
 *   version 		: 0.0.1
 *   date_modified	: 10-SEPT-2017
 */
package jam;

import java.util.Map;

public class TemplateEngine 
{
	// This string will be returned to the user.It'll contain pure HTML tags after processing
	private String render = "";
	
	// This is used to hold key value pairs passed to Template Engine
	private Map<String,String> dict;
	
	public TemplateEngine()
	{
		
	}
	
	public TemplateEngine( String html )
	{
		this.render = html;
	}
	
	public TemplateEngine( String html,Map<String,String> dict )
	{
		this.dict   = dict;
		this.render = html;
		
	}
	
	// This method is used to push html and dictionary to existing template
	public void push( String html,Map<String,String> dict )
	{
		
	}
}
