public class Adapter extends Target {
    Adaptee sms = new Adaptee();

    public Adapter(Adaptee adaptee) {
        sms = adaptee;
    }

    @Override
    public void EnvioDeEmail() {
        sms.EnvioDeSMS();
    }
}
