package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

    private final AlunoRepository repository;

    public AlunoServiceImpl(AlunoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Aluno create(AlunoForm form){
        Aluno aluno = new aluno();
        aluno.setNome(form.GetNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairo());
        aluno.setDataDeNascimento(form.getDataDeNascimento);

        return repository.save(aluno);

    }

    @Override
    public Aluno get(Long id){
        return null;
    }

    public List<Aluno> getAll(){
        return repository.findAll();

    }

    @Override
    public Aluno update (Long id, AlunoUpdateForm formUpdate){
        //return null;
    }

    @Override
    public void delete(long id){

    }

    public List<AvaliacaoFisica> getAllAvaliacaoFisica() {
    }
}
