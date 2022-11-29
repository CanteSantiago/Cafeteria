package com.tuempresa.cafeteria.modelo;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Bebidas extends Identificable{
	@Column
	String nombre;
	
	@Money
    BigDecimal precio;
	
	@Column (length = 50)
	String descripcion;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @DescriptionsList
    CategoriaBebidas categoriabebidas;
}
