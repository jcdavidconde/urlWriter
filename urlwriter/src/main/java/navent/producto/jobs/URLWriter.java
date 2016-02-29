package navent.producto.jobs;

import java.io.UnsupportedEncodingException;

public interface URLWriter<T> {

	public String getURL(T o) throws UnsupportedEncodingException;
	
}
