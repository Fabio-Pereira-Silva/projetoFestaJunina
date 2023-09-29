package com.festajunina.projetos;
import com.festajunina.projetos.domain.Comida;
import com.festajunina.projetos.domain.Pessoa;
import com.festajunina.projetos.repositories.ComidaRepository;
import com.festajunina.projetos.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Arrays;

@SpringBootApplication
public class ProjetosApplication implements CommandLineRunner {

    @Autowired
    private PessoaRepository pessoaRepository;
    @Autowired
    private ComidaRepository comidaRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProjetosApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {

        Pessoa p1 = new Pessoa(null, "Fabio Pereira", "Pago");
        Pessoa p2 = new Pessoa(null, "Elisangela Pereira", "Pago");
        Pessoa p3 = new Pessoa(null, "Rafael Pereira", "Pendente");
        Pessoa p4 = new Pessoa(null, "Carol Pereira", "Pendente");
        Pessoa p5 = new Pessoa(null, "Bruno Scariolle", "Pago");
        Pessoa p6 = new Pessoa(null, "Fernanda Scariolle", "Pendente");
        Pessoa p7 = new Pessoa(null, "Otoniel Viera", "Pago");
        Pessoa p8 = new Pessoa(null, "Lara Araujo", "Pago");
        Pessoa p9 = new Pessoa(null, "Atenagores Viera", "Pendente");
        Pessoa p10 = new Pessoa(null, "Thalita Viera", "Pendente");
        Pessoa p11 = new Pessoa(null, "Romario Viera", "Pago");
        Pessoa p12 = new Pessoa(null, "Natalia Viera", "Pago");
        Pessoa p13 = new Pessoa(null, "Daniela Pivato", "Pago");
        Pessoa p14 = new Pessoa(null, "Marcos Pivato", "Pago");
        Pessoa p15 = new Pessoa(null, "Quiteria Pereira", "Pago");
        Pessoa p16 = new Pessoa(null, "Macario Dias", "Pago");
        pessoaRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16));

        Comida c1 = new Comida(null, "Salgados + Mini churros");
        Comida c2 = new Comida(null, "Paçoca");
        Comida c3 = new Comida(null, "Torta Salgada Frango");
        Comida c4 = new Comida(null, "Bolo de Aipim");
        Comida c5 = new Comida(null, "Salgados + Mini churros");
        Comida c6 = new Comida(null, "Pão + Carne louca");
        Comida c7 = new Comida(null, "Milho cozido");
        Comida c8 = new Comida(null, "Caldo Verde");
        Comida c9 = new Comida(null, "Caldo de Abobora");
        Comida c10 = new Comida(null, "Cachorro quente");
        Comida c11 = new Comida(null, "Maçã do Amor");
        Comida c12 = new Comida(null, "Espetinho de chocolate");
        Comida c13 = new Comida(null, "Pipoca Salgada");
        Comida c14 = new Comida(null, "Vinho Quente");
        Comida c15 = new Comida(null, "Caipirinha");
        Comida c16 = new Comida(null, "Barriu de Chop");
        Comida c17 = new Comida(null, "Pipoca Salgada");
        comidaRepository.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17));
    }

    }

