// This program demonstrates how a class can implement multiple interfaces.
// This is Java's way of achieving "multiple inheritance" of type.

public class MultipleInterfaces {

    // First Interface
    interface Camera {
        void takePhoto();
    }

    // Second Interface
    interface MusicPlayer {
        void playMusic();
    }

    // Third Interface
    interface Phone {
        void makeCall(String number);
    }

    // A class implementing three interfaces
    class Smartphone implements Camera, MusicPlayer, Phone {

        private final String model;

        public Smartphone(String model) {
            this.model = model;
        }

        @Override
        public void takePhoto() {
            System.out.println(model + " is taking a photo... Click!");
        }

        @Override
        public void playMusic() {
            System.out.println(model + " is playing music... ");
        }

        @Override
        public void makeCall(String number) {
            System.out.println(model + " is calling " + number + "... ");
        }
    }

    public static void main(String[] args) {
        MultipleInterfaces program = new MultipleInterfaces();
        Smartphone myPhone = program.new Smartphone("Samsung Galaxy");

        myPhone.takePhoto();
        myPhone.playMusic();
        myPhone.makeCall("0712345678");

        System.out.println("\n=== POLYMORPHISM WITH INTERFACES ===");

        Camera cam = myPhone;
        MusicPlayer mp = myPhone;

        cam.takePhoto();
        mp.playMusic();
    }
}
