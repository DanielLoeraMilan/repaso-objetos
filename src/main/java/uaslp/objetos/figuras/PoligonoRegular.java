package uaslp.objetos.figuras;

public class PoligonoRegular {
    private double lado;
    private int numeroDeLados;

    public PoligonoRegular(int numeroDeLados){
        this.numeroDeLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado){
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getArea(){
        double apotema = lado / (2 * Math.tan(((360 / numeroDeLados) * (Math.PI / 180))/2));
        return (numeroDeLados * lado * apotema)/2;
    }

    public double getLado(){
        return lado;
    }
}
