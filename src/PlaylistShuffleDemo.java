public class PlaylistShuffleDemo {

    public static void main(String[] args) {

        // Create a playlist
        PlaylistOnArray playlist = new PlaylistOnArray();

        // Add tracks
        Track track1 = new playlist.Track();
        track1.title = "Song 1";
        track1.artist = "Artist 1";
        track1.isrc = "ISRC001";
        playlist.add(track1);

        Track track2 = new playlist.Track();
        track2.title = "Song 2";
        track2.artist = "Artist 2";
        track2.isrc = "ISRC002";
        playlist.add(track2);

        Track track3 = new playlist.Track();
        track3.title = "Song 3";
        track3.artist = "Artist 3";
        track3.isrc = "ISRC003";
        playlist.add(track3);

        // Shuffle the playlist
        PlaylistSecondary playlistSecondary = new PlaylistOnArray();
        playlistSecondary.shuffle(playlist);

        // Verify shuffled playlist
        System.out.println("Playlist shuffled!");
    }

}
