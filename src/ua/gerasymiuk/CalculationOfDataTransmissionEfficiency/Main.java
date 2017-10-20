package ua.gerasymiuk.CalculationOfDataTransmissionEfficiency;

import ua.gerasymiuk.CalculationOfDataTransmissionEfficiency.Services.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.printf("%.15f",getValue());
    }
    private static double getValue(){
        Technology technology = Technologies.newGigabytEthernet();
         double p0=0.01;

         int L=1_000_000;
         long Vp=30_000_000L;
         double Tsh=0.01;
         double Trsh=0.01;
         int s=2048;
         int r=8;
         int M=10;
         int sigma=2;
         double B=0.001d;
        Strategy strategy = new SlidingWindow(technology, p0, L, Vp, Tsh, Trsh, s, r, M, sigma, B);
        System.out.printf("T=%.10f\n",strategy.getT());
        System.out.printf("P=%.10f\n",strategy.getP());
        //System.out.printf("213=%d\n", strategy.getB());


        double result = (strategy.getN()-strategy.getT())/strategy.getN()*
                strategy.getB()*
                strategy.getP()*
                strategy.getWeff()*
                strategy.getWnorm();
        return result;
    }
}
