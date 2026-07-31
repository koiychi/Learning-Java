/*
IT 203 - Object-Oriented Programming
Rodriguez, Miles J.
BSIT 2H-G1

Activity 2 - Encapsulation and Constructors
*/
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("[Activity 2: Playlist]\n\n");
        System.out.println("//Original Playlist and Aliasing");
        Playlist koi = new Playlist("Koi", 2026);
        koi.addSong("To The Bone");
        koi.addSong("Tattoo");
        System.out.println(koi.displayInfo());

        //Adding songs through an alias (koiAlias = koi)
        Playlist koiAlias = koi;
        koiAlias.addSong("Arcade");
        koiAlias.addSong("Kalapastangan");
        koiAlias.addSong("Tahanan");
        System.out.println(koiAlias.displayInfo()); 


        System.out.println("\n\n//COPY VS. ORIGINAL PLAYLIST");
        Playlist koiCopy = new Playlist(koi);
        System.out.println(koiCopy.displayInfo());
        koiCopy.removeSong("Arcade"); //Removing a song on a copy playlist

        //COMPARISON BETWEEN THE ORIGINAL PLIST AND EDITED COPY
        System.out.println("\n//Copy of Original Playlist");
        System.out.println(koiCopy.displayInfo());
        System.out.println("\n//Original Playlist");
        System.out.println(koi.displayInfo());

        System.out.println("\n\n\n");

        System.out.println("[Temperature.java]");
        Temperature temp = new Temperature(100);
        Temperature newTemp = new Temperature(0);
        newTemp = temp.plus(37.5);

        System.out.println("Original Temp: " + temp.getDegreesCelsius());
        System.out.println("New Temp: " + newTemp.getDegreesCelsius());
        
    }
}

//PART F: REFLECTION
/*
1. Using your class, identify one field or method you made public and explain why it needed to be public rather than private. Then, in your own words, explain why
unboxing a null Integer (or other wrapper) throws a NullPointerException, and why
comparing two wrapper objects with == is risky.
ANSWER: In my Playlist class, I made the method addSong() public to let it be accessed to other classes and actually add songs to the playlist. Making it public also help me access the private variables in the Playlist class. On the other hand, integers are native or primitive to Java, so it expects a value other than null. If Java works in a null object like a null integer, it works on technically nothing, so a NullPointerException is triggered. Lastly, == is risky as this only checks the references or if two objects are the same and not the actual values they carry. For that, equals() method would be the best to use. 

2. In your own words, explain what would have gone wrong if your copy constructor
had not deep-copied the list field. Then, explain whether it would make sense to
redesign your class as a fully immutable class, referencing at least one specific
method.
ANSWER: If the copy constructor did not deep-copy the original object, the "copy" would just be another reference to the original, therefore, allowing me to edit the original list by editing the copy list. On the other hand, if I make the class immutable or final, something like with the temperature.java would happen. For example, everytime that I try to create a change to a value of the temperature, I need to create another object and save it to another variable as the original can no longer carry the new and changed value. This is not best to implement for a class like the Playlist, as it would make the managing of songs inefficient and frustrating in the long run.

*/