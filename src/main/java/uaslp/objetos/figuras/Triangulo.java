package uaslp.objetos.figuras;

import uaslp.objetos.figuras.Exception.AlturaNoProvistaException;
import uaslp.objetos.figuras.Exception.BaseNoProvistaException;

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

    public double getArea() throws BaseNoProvistaException, AlturaNoProvistaException {
        if(base==0){
            throw new BaseNoProvistaException();
        }
        if(altura==0){
            throw new AlturaNoProvistaException();
        }
        return (base * altura)/2;
    }

    public String getDescription(){
        return "Cualquier triangulo";
    }
}
