import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args){


        ArrayList<Asset>myAssets = new ArrayList<>();
        myAssets.add(new House("My first house",
                "2029-07-15",
                new BigDecimal("250000"),
                "1221 Niel road",2,2000,5000 ));
        for (Asset asset : myAssets){
            System.out.println("---------------------------------");
            System.out.println("Description:   " + asset.getDescription());
            System.out.println("Data Acquired: " + asset.getDataAcquired());
            System.out.println("Original Cost: " + asset.getOriginalCost());
            System.out.println("Current Value: " + asset.getValue());
        }
//        Asset wallet = new Asset("cash in wallet", "2026-01-01", new BigDecimal(350));
//
//        ArrayList<Asset> myAsset = new ArrayList<>();
//
//        myAsset.add(wallet);
//        myAsset.add(bedStach);
//        for ()
//        System.out.println(wallet);
    }
}
