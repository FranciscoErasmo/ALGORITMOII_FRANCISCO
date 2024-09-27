import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais;

    public Zoologico() {
        this.animais = new ArrayList<>();
    }

    public void cadastrarAnimal(Animal animal) {
        animais.add(animal);
        System.out.println("Animal " + animal.getNome() + " cadastrado com sucesso!");
    }

    public void listarAnimaisPorHabitat(Habitat habitat) {
        System.out.println("Animais no habitat " + habitat + ":");
        for (Animal animal : animais) {
            if (animal.getHabitat() == habitat) {
                System.out.println(animal.getNome() + " - Espécie: " + animal.getEspecie() + " - Idade: " + animal.getIdade() + " anos.");
                animal.caracteristicasAdicionais();
            }
        }
    }
}
