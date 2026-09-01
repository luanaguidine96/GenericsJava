public class Banana extends Alimento{

    String cor;

    public Banana(String Fabricante, int anoVal, int anoFab, String cor) {
        super(Fabricante, anoVal, anoFab);
        this.cor = cor;
    }

    public String text() {
        return "Banana [Fabricante=" + getFabricante()
                + ", anoVal=" + getAnoVal()
                + ", anoFab=" + getAnoFab()
                + ", cor=" + cor
                + "]";
    }

    public Integer comida() {
        return getComer() + 2;
    }

    @Override
    public String toString() {
        return text();
    }
}
