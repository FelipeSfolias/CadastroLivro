package br.edu.famper.cadastrolivro.service;

import br.edu.famper.cadastrolivro.repository.LivroRepository;
import br.edu.famper.cadastrolivro.model.Livro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;
    public Livro salvar(Livro livro) {
        return livroRepository.save(livro);
    }

    public List<Livro>findAll() {
        return livroRepository.findAll();
    }

    public Optional<Livro> findById(Long id) {
        return livroRepository.findById(id);
    }

    public Livro update(Livro livro){
        Livro salvo = livroRepository.findById(livro.getCodigo()).orElseThrow(()->
                new RuntimeException("Livro não encontrado")
        );

        salvo.setTitulo(livro.getTitulo());
        salvo.setAutor(livro.getAutor());
        salvo.setPreco(livro.getPreco());
        salvo.setAnoPublicacao(livro.getAnoPublicacao());
        return livroRepository.save(livro);

    }
    public void deleteById(Long id) {
        livroRepository.deleteById(id);
    }
}
