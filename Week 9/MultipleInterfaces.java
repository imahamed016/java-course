// This program demonstrates how a class can implement multiple interfaces.
// This is Java's way of achieving "multiple inheritance" of type.

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

// ============================================================
// A class implementing THREE interfaces
// ============================================================
class Smartphone implements Camera, MusicPlayer, Phone {

private String model;

public Smartphone(String model) {
this.model = model;
}

// Implementation of Camera interface
@Override
public void takePhoto() {
System.out.println(model + " is taking a photo... Click!");
}

// Implementation of MusicPlayer interface
@Override
public void playMusic() {
System.out.println(model + " is playing music... ");
}



// Implementation of Phone interface
@Override
public void makeCall(String number) {
System.out.println(model + " is calling " + number + "... ");
}
}

public class MultipleInterfaces {
public static void main(String[] args) {
// Create a Smartphone object.
Smartphone myPhone = new Smartphone("Samsung Galaxy");

// You can use the object to call all its methods.
myPhone.takePhoto();
myPhone.playMusic();
myPhone.makeCall("0712345678");

System.out.println("\n=== POLYMORPHISM WITH INTERFACES ===");

// Polymorphism: We can treat the Smartphone as any of its interface types.
Camera cam = myPhone; // A Smartphone IS-A Camera
MusicPlayer mp = myPhone; // A Smartphone IS-A MusicPlayer

// cam can only access camera methods.
cam.takePhoto();



// cam.playMusic(); // ERROR! The Camera interface doesn't know about playMusic().

// mp can only access music methods.
mp.playMusic();
}
}