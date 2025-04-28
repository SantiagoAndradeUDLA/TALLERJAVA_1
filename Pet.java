public class Pet {
    private String name;
    private int age;
    private String type;

    public Pet(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public void speak() {
        switch (type.toLowerCase()) {
            case "perro":
                System.out.println(name + " dice: ¡Guau guau!");
                break;
            case "gato":
                System.out.println(name + " dice: ¡Miau!");
                break;
            case "pajaro":
                System.out.println(name + " dice: ¡Pio pio!");
                break;
            default:
                System.out.println(name + " hace un sonido desconocido.");
        }
    }

    public void birthday() {
        int realAge = 0;
        switch (type.toLowerCase()) {
            case "perro":
                realAge = age * 7;
                break;
            case "gato":
                realAge = age * 5;
                break;
            case "pajaro":
                realAge = age * 3;
                break;
            default:
                realAge = age;
        }
        age++;
        System.out.println(name + " ahora tiene " + realAge + " anos reales, pero en edad de mascota tiene " + age + " anos.");
    }

    public String getInfo() {
        return type + " llamado " + name + " de " + age + " anos.";
    }
}
