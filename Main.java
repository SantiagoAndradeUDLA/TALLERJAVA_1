public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Carlos");

        Pet pet1 = new Pet("Firulais", 3, "Perro");
        Pet pet2 = new Pet("Michi", 2, "Gato");
        Pet pet3 = new Pet("Piolin", 1, "Pajaro");

        owner.adoptPet(pet1);
        owner.adoptPet(pet2);
        owner.adoptPet(pet3);

        System.out.println();
        owner.introducePets();

        System.out.println();
        owner.celebrateBirthdays();
    }
}
