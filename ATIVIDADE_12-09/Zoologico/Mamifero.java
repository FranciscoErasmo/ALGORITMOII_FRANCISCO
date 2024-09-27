public class Mamifero extends Animal {
    public Mamifero(String nome, String especie, int idade, Habitat habitat) {
        super(nome, especie, idade, habitat);
    }

    @Override
    public void caracteristicasAdicionais() {
        System.out.println(getNome() + " é um mamífero e pode amamentar.");
    }
}
