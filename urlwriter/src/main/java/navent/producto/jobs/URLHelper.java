package navent.producto.jobs;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class URLHelper {
	
	private static String original = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
	private static String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
	
	public static String toUrlFriendly(String input) throws UnsupportedEncodingException {
		String output = input.trim();
		output = output.toLowerCase();
		output = output.replaceAll("[\\W&&[^"+original+"\\s]]", "");
	    for (int i=0; i<original.length(); i++) {
	        // Reemplazamos los caracteres especiales.
	        output = output.replace(original.charAt(i), ascii.charAt(i));
	    }//for i
	    output = URLEncoder.encode(output, "UTF-8");
	    output = output.replaceAll("\\+", "\\-");
	    output = output.replaceAll("(-+)", "-");
	    if ( output.endsWith("-") ) {
	    	output = output.substring(0, output.length()-1);
		}
		return output;
	}
	
	public static String toSeoFriendly(String text) {
        String seoFriendlyText = null;

        seoFriendlyText = text.toLowerCase()
            .replaceAll("à", "a")
            .replaceAll("á", "a")
            .replaceAll("è", "e")
            .replaceAll("é", "e")
            .replaceAll("ì", "i")
            .replaceAll("í", "i")
            .replaceAll("ò", "o")
            .replaceAll("ó", "o")
            .replaceAll("ù", "u")
            .replaceAll("ú", "u")
            .replaceAll("ñ", "n")
            .replaceAll("[^\\w]", "-")
            .replaceAll("-+", "-")
        ;

        return seoFriendlyText;
    }

}
