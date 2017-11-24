package wildFarm;

import wildFarm.abstractions.Animal;
import wildFarm.implementators.Mouse;

public class Factory {

    public Animal getAnimal(String[] animalInfo){
        switch (animalInfo[0]){
            case "Mouse":  return new Mouse(animalInfo[1], animalInfo[2], Double.parseDouble(animalInfo[3]), Integer.parseInt(animalInfo[4]), animalInfo[5]);
            default: return null;
        }
    }
}
