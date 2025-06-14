package ex3;

import java.util.List;

public class Pessoa {

    private String nome;
    private Integer idade;

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }


    public static Double media(List<Pessoa> pessoas){
        double media = 0;
        for (Pessoa p : pessoas) {
            media += p.idade;
        }
        return media/ pessoas.size();
    }
}
