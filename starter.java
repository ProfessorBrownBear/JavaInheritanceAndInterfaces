interface PetStore {
    String makeNoise(String typeOfPet);
}


public class Pet implements PetStore 
{
    @Override
    public String makeNoise(String typeOfPet) {
        return "I am a " + typeOfPet + " and I go " + getNoise(typeOfPet);
    } 

}
