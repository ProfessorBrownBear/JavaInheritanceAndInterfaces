interface PetStore {
        String makeNoise(String typeOfPet);
    }

    public class Pet implements PetStore 
    {
        String typeOfPet;
        @Override
        public String makeNoise(String typeOfPet) {
            return "I am a " + typeOfPet + " and I go " + getNoise(typeOfPet);
        } 

        public static void main(String[] args) {
            Pet Peanut = new Pet("dog");
        }
        public Pet(String typeOfPet) {
            this.typeOfPet = typeOfPet;
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
