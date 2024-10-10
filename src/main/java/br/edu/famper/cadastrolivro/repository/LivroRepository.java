package br.edu.famper.cadastrolivro.repository;
import br.edu.famper.cadastrolivro.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LivroRepository extends JpaRepository<Livro, Long> {
}
