import java.util.ArrayList;

public class Owner {
    private String name;
    private ArrayList<Pet> pets;

    public Owner(String name) {
        this.name = name;
        this.pets = new ArrayList<>();
    }

    public void adoptPet(Pet pet) {
        pets.add(pet);
        System.out.println(name + " ha adoptado a un " + pet.getInfo());
    }

    public void introducePets() {
        System.out.println(name + " presenta a sus mascotas:");
        for (Pet pet : pets) {
            System.out.println("- " + pet.getInfo());
            pet.speak();
        }
    }

    public void celebrateBirthdays() {
        System.out.println(name + " celebra el cumpleaños de todas sus mascotas:");
        for (Pet pet : pets) {
            pet.birthday();
        }
    }
}
