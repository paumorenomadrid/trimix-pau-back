package com.example.trimixpau.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "persona")
public class Persona {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "per_id")
	private Long perId;
	
	@Column (name = "per_apellido")
	@Nonnull
	private String perApellido;
	
	@Column (name = "per_fecha_nacimiento")
	private String perFechaNacimiento;
	
	@Column (name = "per_nombre")
	@Nonnull
	private String perNombre;
	
	@Column (name = "per_numero_documento")
	@Nonnull
	private Long perNumeroDocumento;
	
	@Column (name = "per_tipo_documento")
	private String perTipoDocumento;

	public Long getPerId() {
		return perId;
	}

	public void setPerId(Long perId) {
		this.perId = perId;
	}

	public String getPerApellido() {
		return perApellido;
	}

	public void setPerApellido(String perApellido) {
		this.perApellido = perApellido;
	}

	public String getPerFechaNacimiento() {
		return perFechaNacimiento;
	}

	public void setPerFechaNacimiento(String perFechaNacimiento) {
		this.perFechaNacimiento = perFechaNacimiento;
	}

	public String getPerNombre() {
		return perNombre;
	}

	public void setPerNombre(String perNombre) {
		this.perNombre = perNombre;
	}

	public Long getPerNumeroDocumento() {
		return perNumeroDocumento;
	}

	public void setPerNumeroDocumento(Long perNumeroDocumento) {
		this.perNumeroDocumento = perNumeroDocumento;
	}

	public String getPerTipoDocumento() {
		return perTipoDocumento;
	}

	public void setPerTipoDocumento(String perTipoDOcumento) {
		this.perTipoDocumento = perTipoDOcumento;
	}
	
}
