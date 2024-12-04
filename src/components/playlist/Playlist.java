public interface Playlist extends PlaylistKernel {

    /**
     * Shuffles (randomizes the order) {@code source} and returns the shuffled
     * playlist.
     *
     * @param source
     *            The playlist to be shuffled
     * @return A shuffled version of {@code source}
     */
    shuffle(Playlist source);

}
