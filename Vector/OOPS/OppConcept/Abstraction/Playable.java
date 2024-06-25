public abstract class Playable {

    public abstract void play();

    public static void main(String[] args) {
        Playable piano = new Piano();
        piano.play();

        Playable guitar = new Guitar();
        guitar.play();
    }
}
