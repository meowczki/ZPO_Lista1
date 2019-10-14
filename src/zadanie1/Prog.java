package zadanie1;
public class Prog {
    private double prog1;
    private double procent;
    private double prog2;

    public double getProg1() {
        return prog1;
    }

    public Prog(double procent,double prog1,  double prog2) {
        this.prog1 = prog1;
        this.procent = procent;
        this.prog2 = prog2;
    }

    public Prog(double prog2) {
        this.procent = procent;
        this.prog2 = prog2;
    }

    public void setProg1(double prog1) {
        this.prog1 = prog1;
    }

    public Prog(double procent,double prog1) {
        this.prog1 = prog1;
        this.procent = procent;
    }


    public double getProcent() {
        return procent;
    }

    public void setProcent(double procent) {
        this.procent = procent;
    }

    public double getProg2() {
        return prog2;
    }

    public void setProg2(double prog2) {
        this.prog2 = prog2;
    }
}