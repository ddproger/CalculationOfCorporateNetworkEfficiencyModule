package ua.gerasymiuk.CalculationOfDataTransmissionEfficiency.Services;

/**
 * Created by gerasymiuk on 18.10.17.
 */
public class implTechnology implements Technology {
    int n,v,capacity;
    double p,t,Weff,Wnorm;
    long C;
    public implTechnology(int n, long C,double p, double t, int v, int capacity, double weff,double wnorm){
        this.n = n;
        this.p = p;
        this.t = t;
        this.v = v;
        this.capacity = capacity;
        this.Weff =weff;
        this.Wnorm = wnorm;
        this.C = C;
    }
    @Override
    public int getN() {
        return n;
    }

    @Override
    public double getP() {
        return p;
    }

    @Override
    public double getT() {
        return t;
    }

    @Override
    public int getV() {
        return v;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public double getWeff() {
        return Weff;
    }

    @Override
    public double getWnorm() {
        return Wnorm;
    }
    @Override
    public long getC() {
        return C;
    }
}
