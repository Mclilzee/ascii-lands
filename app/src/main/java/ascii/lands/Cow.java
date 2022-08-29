package ascii.lands;

public class Cow implements TalkingAnimal {

    @Override
    public void say(String message) {
        System.out.println("                    _______ ");
        System.out.printf("                   < %s >\n", message);
        System.out.println("                    ------- ");
        System.out.println("            ^__^   /        ");
        System.out.println("    _______/(oo)  /         ");
        System.out.println("/\\/(       /(__)            ");
        System.out.println("   | w----||                ");
        System.out.println("   ||     ||                ");
    }
}
