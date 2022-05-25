package uaslp.objetos.figuras;

public class PoligonoRegular extends Figura{
    private double lado;
    private int numeroDeLados;

    public PoligonoRegular(int numeroDeLados){
        super("Poligono Regular");
        this.numeroDeLados = numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado){
        super("Poligono Regular");
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
