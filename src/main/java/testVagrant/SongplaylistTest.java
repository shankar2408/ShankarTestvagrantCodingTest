package testVagrant;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SongplaylistTest {

	// tested with given testcase
	@Test
	public void test1() {
		SongPlaylist store = new SongPlaylist(3);

		store.addSong("user1", "S1");
		store.addSong("user1", "S2");
		store.addSong("user1", "S3");
		// When S4 Song is played
		store.addSong("user1", "S4");
		// When S2 Song is played
		store.addSong("user1", "S2");
		// When S1 Song is played
		store.addSong("user1", "S1");

		// Output: [S4, S2, S1]
		List<String> actual = store.getRecentlyPlayed("user1");
		List<String> expected = Arrays.asList("S4", "S2", "S1");
		System.out.println("actual:" + actual);
		System.out.println("exp:" + expected);
		Assert.assertEquals(actual, expected);
	}

	// tested with 2 songs
	@Test
	public void test2() {
		SongPlaylist store = new SongPlaylist(3);

		store.addSong("user2", "S1");
		store.addSong("user2", "S2");

		List<String> actual = store.getRecentlyPlayed("user2");
		List<String> expected = Arrays.asList("S1", "S2");
		System.out.println("actual:" + actual);
		System.out.println("exp:" + expected);
		Assert.assertEquals(actual, expected);
	}

	// tested with 1 song
	@Test
	public void test3() {
		SongPlaylist store = new SongPlaylist(3);

		store.addSong("user3", "S1");

		List<String> actual = store.getRecentlyPlayed("user3");
		List<String> expected = Arrays.asList("S1");
		System.out.println("actual:" + actual);
		System.out.println("exp:" + expected);
		Assert.assertEquals(actual, expected);
	}

	// tested with empty song
	@Test
	public void test4() {
		SongPlaylist store = new SongPlaylist(3);

		store.addSong("user4", "");

		List<String> actual = store.getRecentlyPlayed("user4");
		List<String> expected = Arrays.asList("");
		System.out.println("actual:" + actual);
		System.out.println("exp:" + expected);
		Assert.assertEquals(actual, expected);
	}

	// tested with 3 songs
	@Test
	public void test5() {
		SongPlaylist store = new SongPlaylist(3);

		store.addSong("user5", "S1");
		store.addSong("user5", "S2");
		store.addSong("user5", "S3");

		List<String> actual = store.getRecentlyPlayed("user5");
		List<String> expected = Arrays.asList("S1", "S2", "S3");
		System.out.println("actual:" + actual);
		System.out.println("exp:" + expected);
		Assert.assertEquals(actual, expected);
	}

	// tested with same song again
	@Test
	public void test6() {
		SongPlaylist store = new SongPlaylist(3);

		store.addSong("user6", "S1");
		store.addSong("user6", "S2");
		store.addSong("user6", "S1");

		List<String> actual = store.getRecentlyPlayed("user6");
		List<String> expected = Arrays.asList("S2", "S1");
		System.out.println("actual:" + actual);
		System.out.println("exp:" + expected);
		Assert.assertEquals(actual, expected);
	}

}
