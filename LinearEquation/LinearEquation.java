public class LinearEquation {

    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;
    private double Dt;
    private double Dx;
    private double Dy;
    
    LinearEquation (double A, double B, double C, double D, double E, double F){
        this.a = A;
        this.b = B;
        this.c = C;
        this.d = D;
        this.e = E;
        this.f = F;
        this.Dt = a*d-b*c;
        this.Dx = (-1)*(b*f-d*e);
        this.Dy = a*f-e*c;
    }

    public boolean isSolvable(){
        if (this.Dt == 0){
            return false;
        } else {
            return true;
        }
    }

    private double[] solve(){
        double x = this.Dx / this.Dt;
        double y = this.Dy / this.Dt;
        return new double[] {x, y};
    }

    public double getX(){
        return solve()[0];
    }

    public double getY(){
        return solve()[1];
    }

}