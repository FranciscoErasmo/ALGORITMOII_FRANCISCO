public abstract class Animal {
    private String nome;
    private String especie;
    private int idade;
    private Habitat habitat;

    public Animal(String nome, String especie, int idade, Habitat habitat) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public abstract void caracteristicasAdicionais();
}
