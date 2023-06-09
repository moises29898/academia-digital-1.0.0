package me.dio.academia.digital.controller;

//import ...
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.service.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll() {
        return service.getAll();

    }

    @PostMapping
    public Aluno create(@RequestBody AlunoForm form){
        return service.create(form);

    }

    @GetMapping
    public List<AvaliacaoFisica> getAllAvaliacaoFisica(){
    return service.getAllAvaliacaoFisica();

    }

}
