package navent.producto.jobs;

public class Aviso {
	
	public Long id;
	public String titulo;
	
	public Aviso(Long id, String titulo) {
		super();
		this.id = id;
		this.titulo = titulo;
	}
	public Aviso() {
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
