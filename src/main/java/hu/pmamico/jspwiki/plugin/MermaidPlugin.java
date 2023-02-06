package hu.pmamico.jspwiki.plugin;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.wiki.WikiContext;
import org.apache.wiki.api.exceptions.PluginException;
import org.apache.wiki.api.plugin.WikiPlugin;


public class MermaidPlugin implements WikiPlugin {

	private static final Logger log = Logger.getLogger(MermaidPlugin.class);

	@Override
	public String execute(WikiContext wikiContext, Map<String, String> params) throws PluginException {
		log.info("start");
		String html = "<script type=\"module\">  import mermaid from 'https://cdn.jsdelivr.net/npm/mermaid@9/dist/mermaid.esm.min.mjs';  mermaid.initialize({ startOnLoad: true });</script>";
		try {
			String body = params.get("_body");
			log.warn("\n"+body);
			html += "<pre class=\"mermaid\">\n" + body+"\n</pre>";
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return html;
	}

}