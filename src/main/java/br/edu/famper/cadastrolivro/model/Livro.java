package br.edu.famper.cadastrolivro.model;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Entity
@Table(name="tbl_livro")
@Data
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(nullable = false, name = "Livro_id")
    private Long codigo;
    @Column(nullable = false, name= "Título", length=100)
    private String titulo;
    @Column(nullable = false, name="Autor", length=100)
    private String autor;
    @Column(nullable = false, name = "Preço", length=10)
    private float preco;
    @Column(nullable = false, name = "Ano de Publicação", length=4)
    private int anoPublicacao;

}
