package testVagrant;

import java.util.*;



class SongPlaylist {
	private final int initialCapacity;
	private Map<String, LinkedList<String>> songStore;

	public SongPlaylist(int initialCapacity) {
		this.initialCapacity = initialCapacity;
		this.songStore = new HashMap<>();
	}

	public void addSong(String user, String song) {
		songStore.putIfAbsent(user, new LinkedList<String>());
		LinkedList<String> playlist = songStore.get(user);
		
        // Remove the song if it already exists
		playlist.remove(song);

		if (playlist.size() >= initialCapacity) {
			// Remove the least recently played song
			playlist.removeFirst(); 
		}
		// Add the new song to the playlist
		playlist.add(song); 
	}

	public List<String> getRecentlyPlayed(String user) {
		return songStore.getOrDefault(user, new LinkedList<String>());
	}


}
