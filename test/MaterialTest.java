/**
 * Created by Apoorva Mittal on 10-08-2015.
 */

import static org.junit.Assert.assertTrue;

import C:\Users\Apoorva Mittal\IdeaProjects\Day-1\src\MaterialUtility.java;
import org.junit.Assert;
import org.junit.Test;
public class MaterialTest


{
    @Test
    public void compare( ){

        Material material1 = new Material();
        Length length1 = new Length(100, "centimetre");
        material1.lengthOfMaterial = length1;
        Material material2 = new Material();
        Length length2 = new Length(1, "metre");
        material2.lengthOfMaterial = length2;

        assertTrue(lengthEqual(material1,material2));



    }

}