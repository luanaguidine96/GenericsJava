public abstract class Alimento implements Comer {
    private String Fabricante;
    private int anoVal;
    private int anoFab;
    private  int comer = 0;


    public Alimento(String Fabricante, int anoVal, int anoFab) {
    this.Fabricante = Fabricante;
    this.anoVal = anoVal;
    this.anoFab = anoFab;
   
}


    public int getAnoVal() {
        return anoVal;
        
    }

 @Override
public void come() {
    comer++;
}

    public void setAnoVal(int anoVal) {
        this.anoVal = anoVal;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public int getComer() {
        return comer;
    }

    public void setComer(int comer) {
        this.comer = comer;
    }


   
}
