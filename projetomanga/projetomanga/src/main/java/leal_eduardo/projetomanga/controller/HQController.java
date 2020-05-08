package leal_eduardo.projetomanga.controller;

import leal_eduardo.projetomanga.model.HQEntity;
import leal_eduardo.projetomanga.repository.HQRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hq")
public class HQController { //classe controladora

    @Autowired
    private HQRepository hqRepository;

    @GetMapping
    public ResponseEntity<List<HQEntity>> findAll() { //GET
       return new ResponseEntity<List<HQEntity>>(
                (List<HQEntity>) this.hqRepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<HQEntity> findById(@PathVariable("id") long id) {
        if(this.hqRepository.findById(id).isPresent()) {
            return new ResponseEntity<HQEntity>(
                    this.hqRepository.findById(id).get(),
                    new HttpHeaders(), HttpStatus.OK);
        }
        return new ResponseEntity<HQEntity>(HttpStatus.NOT_FOUND);
    }
    @PostMapping
    public ResponseEntity<HQEntity> cadastrar (@RequestBody HQEntity hqEntity){
        return new ResponseEntity<HQEntity>(
                this.hqRepository.save(hqEntity),
                new HttpHeaders(), HttpStatus.CREATED);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<HQEntity> atualizar (@PathVariable("id") long id,
                                               @RequestBody HQEntity hqEntity) throws Exception {
        if (id == 0 || !this.hqRepository.existsById(id)){
            throw new Exception("NÃO ENCONTRADO OU Inexistente");
        }
        return new ResponseEntity<HQEntity>(
                this.hqRepository.save(hqEntity),
                new HttpHeaders(), HttpStatus.OK);
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<HQEntity> deletar(@PathVariable("id") long id) {
        this.hqRepository.deleteById(id);
        return new ResponseEntity<HQEntity>(
                new HttpHeaders(), HttpStatus.OK);
    }

}
