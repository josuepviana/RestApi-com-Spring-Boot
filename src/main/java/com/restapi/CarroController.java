package com.restapi;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CarroController {
    
    CarroRepository repository;

    //CRUD
    @PostMapping("/carro")
    public Carro saveCarro(@RequestBody Carro carro){
        return repository.save(carro);
    }

    @GetMapping("/carro")
    public List<Carro> getAllCarros(){
        return repository.findAll();
    }

    @GetMapping("/carro/{id}")
    public Carro getCarroById(@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/carro/{id}")
    public Carro updateCarro(@PathVariable Long id, @RequestBody Carro carro){
        carro.setId(id);
        return repository.save(carro);
    }

    @DeleteMapping("/carro/{id}")
    public void deleteCarro(@PathVariable Long id){
        repository.deleteById(id);
    }

}
