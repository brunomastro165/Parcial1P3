package com.example.springbootapirest.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "persona")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Persona extends Base {

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "dni")
    private int dni;

    // Establecer una relación One-to-One con la entidad Domicilio.
    @OneToOne(cascade = CascadeType.ALL)
    // Especificar la columna de unión en la base de datos como "fk_domicilio".
    @JoinColumn(name = "fk_domicilio")
    private Domicilio domicilio;

    // Establecer una relación One-to-Many con la entidad Libro.
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)

    // Esta anotación define una tabla de unión personalizada llamada "persona_libro" para la relación One-to-Many con Libro.
    /*
        En el contexto de JPA (Java Persistence API), @JoinTable se utiliza para definir una tabla de unión personalizada que
        se utiliza generalmente para gestionar una relación Many-to-Many entre dos entidades. Los parámetros joinColumns e
        inverseJoinColumns se utilizan para especificar cómo se mapean las columnas de las entidades en esta tabla de unión.


        joinColumns: Este parámetro se utiliza para especificar las columnas de la tabla de la entidad actual (Persona, en este caso)
        que se utilizarán para unirse a la tabla de unión. En otras palabras, estas columnas representan la parte de la relación que
        pertenece a la entidad actual.

        inverseJoinColumns: Este parámetro se utiliza para especificar las columnas de la tabla de la entidad objetivo (Libro)
        que se utilizarán para unirse a la tabla de unión. Estas columnas representan la parte de la relación que pertenece a la
        entidad objetivo.

        En resumen, joinColumns se refiere a las columnas de la entidad actual en la relación Many-to-Many, mientras que
        inverseJoinColumns se refiere a las columnas de la entidad objetivo en la relación Many-to-Many.
        Estos parámetros permiten definir cómo se almacena y se recupera la información de la relación en la tabla de unión.
     */
    @JoinTable(name = "persona_libro",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "libro_id")
    )
    private List<Libro> libros = new ArrayList<Libro>();
}
