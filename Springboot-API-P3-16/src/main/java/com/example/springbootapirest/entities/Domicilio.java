package com.example.springbootapirest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "domicilio")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Domicilio extends Base {
    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private String numero;

    // Establecer una relación Many-to-One con la entidad Localidad.
    @ManyToOne(optional = false)
    // Especificar la columna de unión en la base de datos como "fk_localidad".
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;
}