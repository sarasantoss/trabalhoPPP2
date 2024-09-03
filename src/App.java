public class App {
    public static void main(String[] args) throws Exception {
        Adaptee enviarSMS = new Adaptee();
        Adapter a1 = new Adapter(enviarSMS);

        a1.EnvioDeEmail();
    }
}
