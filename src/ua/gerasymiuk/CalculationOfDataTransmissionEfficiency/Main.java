package ua.gerasymiuk.CalculationOfDataTransmissionEfficiency;

import ua.gerasymiuk.CalculationOfDataTransmissionEfficiency.Services.ReturnToNStrategy;
import ua.gerasymiuk.CalculationOfDataTransmissionEfficiency.Services.Strategy;
import ua.gerasymiuk.CalculationOfDataTransmissionEfficiency.Services.Technologies;
import ua.gerasymiuk.CalculationOfDataTransmissionEfficiency.Services.Technology;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.printf("%.15f",getValue());
    }
    private static double getValue(){
        Technology technology = Technologies.new40_100GBEthernet();
         double p0=0.01;

         int L=1_000_000;
         long Vp=3_000_000_000L;
         double Tsh=0.01;
         double Trsh=0.01;
         int s=32;
         int r=16;
         int M=10;
         int sigma=2;
         double B=0.001d;
        Strategy strategy = new ReturnToNStrategy(technology, p0, L, Vp, Tsh, Trsh, s, r, M, sigma, B);
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
