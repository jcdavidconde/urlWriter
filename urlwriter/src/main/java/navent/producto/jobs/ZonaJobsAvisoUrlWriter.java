package navent.producto.jobs;

import java.io.UnsupportedEncodingException;

public class ZonaJobsAvisoUrlWriter implements URLWriter<Aviso> {

	/**
	 * Ejemplo
	 * /empleo/gerente-administrativo-contable-1641013
	 * @throws UnsupportedEncodingException 
	 */
	@Override
	public String getURL(Aviso o) throws UnsupportedEncodingException {
		StringBuffer sb = new StringBuffer();
		sb.append("/empleo/");
		sb.append(URLHelper.toSeoFriendly(o.titulo));
		sb.append("-");
		sb.append(o.id);
		return sb.toString();
	}

}
