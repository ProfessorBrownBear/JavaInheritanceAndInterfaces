interface PetStore {
    String makeNoise(String typeOfPet);
}

public class Pet implements PetStore 
{
    @Override
    public String makeNoise(String typeOfPet) {
        return "I am a " + typeOfPet + " and I go " + getNoise(typeOfPet);
    } 

    public static void main(String[] args) {
        System.out.println("Starting Program");
    }

    String getNoise(String typeOfPet) {
        switch(typeOfPet) {
            case "dog":
                return "woof";
            case "cat":
                return "meow";
            case "bird":
                return "chirp";
            default:
                return "I don't know what I am";
        }
    }   
}
