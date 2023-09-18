package com.festajunina.projetos.services;
import com.festajunina.projetos.domain.Comida;
import com.festajunina.projetos.repositories.ComidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ComidaService {
    @Autowired
    ComidaRepository comidaRepository;
    public List<Comida> findAll(){
        return comidaRepository.findAll();
    }
    public Comida findById ( Long id){
        Optional<Comida> obj = comidaRepository.findById(id);
        return obj.get();
    }
    public Comida insert(Comida obj){
        return comidaRepository.save(obj);
    }
    public void delete(Long id){
        comidaRepository.deleteById(id);
    }
    public Comida update(Long id, Comida obj){
        Comida entity = comidaRepository.getReferenceById(id);
        updateData(entity, obj);
        return comidaRepository.save(entity);
    }
    private void updateData(Comida entity, Comida obj) {
        entity.setNome(obj.getNome());
    }
}
