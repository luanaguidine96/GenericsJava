public class Maca extends Alimento {

    String cor;

    public Maca(String Fabricante, int anoVal, int anoFab, String cor) {
        super(Fabricante, anoVal, anoFab);
        this.cor = cor;
    }

    public String text() {
        return "Maca [Fabricante=" + getFabricante()
                + ", anoVal=" + getAnoVal()
                + ", anoFab=" + getAnoFab()
                + ", cor=" + cor
                + "]";
    }

    public Integer comida() {
        return getComer();
    }

    @Override
    public String toString() {
        return text();
    }
}