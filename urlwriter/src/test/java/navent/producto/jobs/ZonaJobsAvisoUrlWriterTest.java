package navent.producto.jobs;

import java.io.UnsupportedEncodingException;

import junit.framework.TestCase;

public class ZonaJobsAvisoUrlWriterTest extends TestCase {

	public void testGetURL() throws UnsupportedEncodingException {
		Aviso av = new Aviso();
		av.titulo = "Trabajá en McDonald's - Capital Federal";
		av.id = 1110755030L;
		URLWriter<Aviso> writer = new ZonaJobsAvisoUrlWriter();
		assertEquals("/empleo/trabaja-en-mcdonald-s-capital-federal-1110755030", writer.getURL(av));
	}

}
