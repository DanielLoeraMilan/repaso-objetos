package uaslp.objetos.figuras;

public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        super("Triangulo");
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(){
        super("Triangulo");
    }

    public Triangulo(String tipoTriangulo){
        super(tipoTriangulo);
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getBase(){
        return base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }

    public double getArea(){
        return (base * altura)/2;
    }

    public String getDescription(){
        return "Cualquier triangulo";
    }
}
