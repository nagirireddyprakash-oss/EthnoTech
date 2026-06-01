/*import java.util.*;
class ArrayListPlayListSongs
{
	public static void main(String arg[])
	{
		java.util.ArrayList<String> playlist = new java.util.ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first song:");
		String firstsong = sc.nextLine();
		playlist.add(firstsong);
		System.out.println("Enter the second song:");
		String secondsong = sc.nextLine();
		playlist.add(secondsong);
		System.out.println("Enter the third song:");
		String thirdsong = sc.nextLine();
		playlist.add(thirdsong);
		playlist.remove(1);
		playlist.get(0);
		playlist.contains(2);
		System.out.println("Playlist:" + playlist);
	}
}*/


import java.util.*;
public class ArrayListPlayListSongs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> playlist = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter song " + i + ": ");
            String song = scanner.nextLine();
            playlist.add(song);
        }

        System.out.println(playlist.get(1));

        System.out.println(playlist.remove(1));

        System.out.println( playlist.contains("Animal"));

        System.out.println(playlist.size());
        System.out.println(playlist.isEmpty());

        System.out.println("\nSongs in Playlist :");
        playlist.forEach(System.out::println);

        scanner.close();
    }
}