package org.howard.edu.lsp.exam.question42;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SongsDatabaseTest {

	@Test
	@DisplayName("Test case for adding songs")
	void testAddSong() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		int answer = db.size();
		assertEquals(2,answer);
	}

	@Test
	@DisplayName("Test cases for getting songs")
	void testGetSongs() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		Set<String> songs = db.getSongs("Rap");
		Set<String> answer = new HashSet();
		answer.add("Savage");
		answer.add("Gin and Juice");
		assertEquals(songs, answer);
	}

	@Test
	@DisplayName("Test cases for getting genre of a song")
	void testGetGenreOfSong() {
		SongsDatabase db = new SongsDatabase();
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		String genre = db.getGenreOfSong("Savage");
		String genre1 = db.getGenreOfSong("Always There");
		
		assertEquals(genre, "Rap");
		assertEquals(genre1, "Jazz");
	}

}
