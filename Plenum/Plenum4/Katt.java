public class Katt extends Husdyr {
    public Katt(String navn, int alder) {
        super(navn, alder);
    }

    @Override
    public void lagLyd() {
        System.out.println("Mjua Mjua sa " + navn);
    }

    @Override
    public int hentAlder() {
      return super.hentAlder()*10;
    }
}
