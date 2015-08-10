/**
 * Created by Apoorva Mittal on 10-08-2015.
 */
public class MaterialUtility {

    public boolean lengthEqual(Length leng) {
        if (material1.lengthOfMaterial.lengthUnit.equals("metre")) {
            material1.lengthOfMaterial.lengthValue *= 100;
            material1.lengthOfMaterial.lengthUnit = "centimetre";
        } else {
            material2.lengthOfMaterial.lengthValue *= 100;
            material2.lengthOfMaterial.lengthUnit = "centimetre";
        }

        return (material1.lengthOfMaterial.lengthValue == material2.lengthOfMaterial.lengthValue);
    }
}
