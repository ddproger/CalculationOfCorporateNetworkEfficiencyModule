package ua.gerasymiuk.CalculationOfDataTransmissionEfficiency.Services;

import com.sun.org.apache.bcel.internal.generic.RET;

import java.util.Random;

/**
 * Created by gerasymiuk on 18.10.17.
 */
public class ReturnToNStrategy implements Strategy{

    double p0=0d;
    private int n;
    private long C;
    private int L;
    private long Vp;
    private double Tsh;
    private double Trsh;
    private int s;
    private int r;
    private double sum=-1;
    private int M;
    private int sigma;
    private double Wnorm;
    private double Weff;
    private double B;
    public ReturnToNStrategy(Technology technology, double p0, int l, long Vp, double Tsh, double Trsh, int s, int r, int m, int sigma, double B){
        this.p0 = p0;
        this.n = technology.getN();
        this.Wnorm=technology.getWnorm();
        this.Weff=technology.getWeff();
        this.C = technology.getC();
        this.L = l;
        this.Vp = Vp;
        this.Tsh = Tsh;
        this. Trsh = Trsh;
        this.s = s;
        this.r = r;
        this.M=m;
        this.sigma = sigma;
        this.B = B;
    }
    @Override
    public int getN() {
        return n;
    }

    @Override
    public double getT() {
        double result;
        //System.out.printf("T=%.10f\n",(getSum()*(1-1/Math.pow(2,r)*(0.5-F((r+1-M)/sigma)))));
        result = n/C + L*1.0/Vp +Tsh+Trsh+ ((getSum()*(1-1/Math.pow(2,r)*(0.5-F((r+1-M)/sigma))))/(1-getSum()))*((n+s)/C+L*1.0/Vp);
        return result;
    }

    @Override
    public double getB() {
        return B;
    }

    @Override
    public double getP() {
        return (1-getSum())/(1-getSum()*(1-1/Math.pow(2,r)*(0.5-F((r+1-M)/sigma))));
    }

    @Override
    public double getWnorm() {
        return Wnorm;
    }

    @Override
    public double getWeff() {
        return Weff;
    }
    private double getSum() {
        if (sum < 0) {
            double res = 0;
            for (int i = 0; i < n; i++) {
                res += (1 - Math.pow(1 - p0, n + i)) * (F((i + 1 - M) / sigma) - F((i - M) / sigma));
                //System.out.printf("Res=%.20f", F(0.5));
            }
            sum = res;
        }
        //sum=0.999968877;
        //System.out.printf("Sum=%.10f\n",sum);
        return sum;
    }
}
