public class PlaylistDemo {

    public static void main(String[] args) {

        // Create a playlist
        PlaylistOnArray playlist = new PlaylistOnArray();

        // Create a track
        Track track1 = new playlist.Track();
        track1.title = "Song 1";
        track1.artist = "Artist 1";
        track1.isrc = "ISRC001";

        // Add track
        playlist.add(track1);

        // Verify track count
        System.out
                .println("Track count after adding: " + playlist.trackCount());

        // Remove track
        playlist.remove(track1);

        // Verify track count
        System.out.println(
                "Track count after removing: " + playlist.trackCount());
    }

}
