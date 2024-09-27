public class Main {
    public static void main(String[] args) {
        // Criando zoológico
        Zoologico zoologico = new Zoologico();

        // Cadastrando animais
        Animal leao = new Mamifero("Leão", "Panthera leo", 8, Habitat.TERRESTRE);
        Animal golfinho = new Mamifero("Golfinho", "Delphinus delphis", 12, Habitat.AQUATICO);
        Animal aguia = new Animal("Águia", "Haliaeetus leucocephalus", 5, Habitat.AEREO) {
            @Override
            public void caracteristicasAdicionais() {
                System.out.println(getNome() + " é uma ave e pode voar.");
            }
        };

        zoologico.cadastrarAnimal(leao);
        zoologico.cadastrarAnimal(golfinho);
        zoologico.cadastrarAnimal(aguia);

        // Listando animais por habitat
        zoologico.listarAnimaisPorHabitat(Habitat.TERRESTRE);
        zoologico.listarAnimaisPorHabitat(Habitat.AQUATICO);
        zoologico.listarAnimaisPorHabitat(Habitat.AEREO);
    }
}
