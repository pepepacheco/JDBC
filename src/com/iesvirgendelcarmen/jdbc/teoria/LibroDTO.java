package com.iesvirgendelcarmen.jdbc.teoria;
/*id INTEGER PRIMARY KEY AUTOINCREMENT,
        nombre TEXT,
        autor TEXT,
        editorial TEXT,
        categoria TEXT,
        FOREIGN KEY(categoria) REFERENCES categoria(tipo) ON DELETE CASCADE ON UPDATE CASCADE
*/
public class LibroDTO {
	
	private String nombreLibro;
	private String nombreAutor;
	private String editorial;
	private String nombreCategoria;
	
	public LibroDTO(String nombreLibro, String nombreAutor, String editorial, String nombreCategoria) {
		this.nombreLibro = nombreLibro;
		this.nombreAutor = nombreAutor;
		this.editorial = editorial;
		this.nombreCategoria = nombreCategoria;
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	@Override
	public String toString() {
		return "LibroDTO [nombreLibro=" + nombreLibro + ", nombreAutor=" + nombreAutor + ", editorial=" + editorial
				+ ", nombreCategoria=" + nombreCategoria + "]";
	}
	
	
}
