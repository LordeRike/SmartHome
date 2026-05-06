public class Termostato {
    double temperaturaInicial;

    public Termostato(double temperaturaInicial) {
        this.temperaturaInicial = -10.0;
    }

    public void ativarEconomia(){
        temperaturaInicial = 18;
    }
}