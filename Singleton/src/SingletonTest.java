public class SingletonTest {
    public static void main(String[] args) {
        Singleton sing1 = Singleton.getInstance();
        sing1.setText("surround");

        System.out.println(Singleton.getInstance().getText());
    }
}
