

import java.util.HashMap;
public class Hash_Maps {
    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<String, String>();

        capitalCities.put("England", "London");
        capitalCities.put("Germany", "berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Waashington");
        System.out.println(capitalCities);

        for (String i : capitalCities.values()) {
            //    capitalCities.put("England", "London");
            //    capitalCities.put("Germany", "berlin");
            //   capitalCities.put("Norway", "Oslo");
            //   capitalCities.put("USA", "Waashington");
            System.out.println(i);
        }

    }
}
