package ascii.lands;

public class Donkey implements TalkingAnimal {

    @Override
    public void say(String message) {
        System.out.printf("""
                                    _______\s
                                   < %s >
                                    -------\s
                            ^__^   /       \s
                    _______/(oo)  /        \s
                /\\/(       /(__)           \s
                   | w----||               \s
                   ||     ||   \s
                   """, message);
    }
}
