package modelo.entidades;

import java.io.Serializable;
import java.util.Objects;

public class Departamento implements Serializable {
	/* tenho que implementar se eu quiser que meu objeto
	 * seja carregado em bits ou arquivos
	 */	

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	
	public Departamento() {
		
	}

	public Departamento(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Departamento other = (Departamento) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Departamento [id=" + id + ", name=" + name + "]";
	}
	


}
