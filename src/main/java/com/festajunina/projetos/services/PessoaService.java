package com.festajunina.projetos.services;
import com.festajunina.projetos.domain.Comida;
import com.festajunina.projetos.domain.Pessoa;
import com.festajunina.projetos.dto.PessoaDTO;
import com.festajunina.projetos.repositories.ComidaRepository;
import com.festajunina.projetos.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PessoaService {
    @Autowired
    PessoaRepository pessoaRepository;
    @Autowired
    ComidaRepository comidaRepository;
    public List<Pessoa> findAll(){
        return pessoaRepository.findAll();
    }
      public PessoaDTO insert(PessoaDTO obj){
       Pessoa inseriu = pessoaRepository.save(new Pessoa(obj.getNome()));
       return new PessoaDTO(inseriu.getId(),inseriu.getNome(),inseriu.getSituacao());
    }
    public void delete(Long id){
        pessoaRepository.deleteById(id);
    }

    public PessoaDTO update(PessoaDTO obj) {
        Pessoa entity = pessoaRepository.getReferenceById(obj.getId());
        entity.setNome(obj.getNome());
        Pessoa salvou = pessoaRepository.save(entity);
        return new PessoaDTO(salvou.getId(),salvou.getNome(), salvou.getSituacao());
    }

    public PessoaDTO atualizaPagamento(Long obj) {
        Pessoa entity = pessoaRepository.getReferenceById(obj);
        if (entity.getSituacao() == "Pendente") {
            entity.setSituacao("Pago");
        } else {
            entity.setSituacao("Pendente");
        }

        Pessoa salvou = pessoaRepository.save(entity);
        return new PessoaDTO(salvou.getId(),salvou.getNome(), salvou.getSituacao());
    }
    @Autowired
    private PessoaRepository repository;
    public PessoaDTO findById(Long id){
    Pessoa entity = repository.findById(id).get();
    PessoaDTO dto = new PessoaDTO(entity.getId(),entity.getNome(),entity.getSituacao());
    return dto;
    }

    public PessoaDTO associarComida(Long idPessoa,Long idComida) {
        //Pegando a pessoa no banco de dados pelo ID//
        Pessoa entity = pessoaRepository.getReferenceById(idPessoa);
        //Pegando a comida no banco de dados pelo ID//
        Comida comida = comidaRepository.getReferenceById(idComida);
        //Pegando a lista de comida de uma nova pessoa e add uma nova comida//
        comida.setPessoa(entity);
        comidaRepository.save(comida);
        Pessoa salvou = pessoaRepository.getReferenceById(idPessoa);
        return new PessoaDTO(salvou.getId(),salvou.getNome(), salvou.getSituacao());
    }
}