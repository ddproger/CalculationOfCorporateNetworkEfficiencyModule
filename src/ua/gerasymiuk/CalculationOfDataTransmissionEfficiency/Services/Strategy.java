package ua.gerasymiuk.CalculationOfDataTransmissionEfficiency.Services;

/**
 * Created by gerasymiuk on 18.10.17.
 */
public interface Strategy {
    int getN();
    double getT();
    double getB();
    double getP();
    double getWnorm();
    double getWeff();
    default double F(double i){
        return 0.5*ErrorFunction.erf(i/1.4121356237);
    }
}
