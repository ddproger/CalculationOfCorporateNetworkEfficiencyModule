package ua.gerasymiuk.CalculationOfDataTransmissionEfficiency.Services;

/**
 * Created by gerasymiuk on 18.10.17.
 */
public class Technologies {
    private Technologies(){}
    public static Technology newEthernet(){
        return new implTechnology(1518,10_000_000,0.95,0.006,1,3,216,0.1875) ;
    }
    public static Technology newFastEthernet(){
        return new implTechnology(1518,10_000_000L,0.95,0.006,2,3,432,0.3750) ;

    }
    public static Technology newGigabytEthernet(){
        return new implTechnology(1518,1_000_000_000L,0.9999,0.006,3,3,864,0.75) ;
    }
    public static Technology new10GBEthernet(){
        return new implTechnology(1518,10_000_000_000L,0.9999,0.006,4,3,1152,1) ;
    }
    public static Technology new40_100GBEthernet(){
        return new implTechnology(1518,100_000_000_000L,0.9999,0.006,5,3,720,0.625) ;
    }
}
