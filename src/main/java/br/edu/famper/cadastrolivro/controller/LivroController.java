package br.edu.famper.cadastrolivro.controller;
import br.edu.famper.cadastrolivro.model.Livro;
import br.edu.famper.cadastrolivro.service.LivroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/livro")
public class LivroController {
    @Autowired
    private LivroService livroService;

    @GetMapping
    public ResponseEntity<List<Livro>> findAll() {
        return ResponseEntity.status(HttpStatus.FOUND).body(livroService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Livro>> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.FOUND).body(livroService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Livro> create(@RequestBody Livro livro) {
        return ResponseEntity.status(HttpStatus.CREATED).body(livroService.salvar(livro));
    }


    @PutMapping("/{id}")
    public ResponseEntity<Livro> update(@RequestBody Livro livro) {
        return ResponseEntity.status(HttpStatus.OK).body(livroService.update(livro));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        livroService.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
