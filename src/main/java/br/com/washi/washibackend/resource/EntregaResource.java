package br.com.washi.washibackend.resource;

import br.com.washi.washibackend.entity.Entrega;
import br.com.washi.washibackend.repository.EntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("entrega")
public class EntregaResource {

    @Autowired
    private EntregaRepository repository;

    @GetMapping
    public List<Entrega> listar() {
        return repository.findAll();
    }

    @GetMapping("{id}")
    public Entrega buscar(@PathVariable int id) {
        return repository.findById(id).get();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Entrega cadastrar(@RequestBody Entrega pessoa) {
        return repository.save(pessoa);
    }

    @PutMapping("{id}")
    public Entrega atualizar(@RequestBody Entrega pessoa,
                            @PathVariable int id) {
        pessoa.setCodigo(id);
        return repository.save(pessoa);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable int id){
        repository.deleteById(id);
    }

}
