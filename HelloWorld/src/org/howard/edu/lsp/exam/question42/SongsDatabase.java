package org.howard.edu.lsp.exam.question42;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {

	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();


	/* Add a song title to a genre */
	public void addSong(String genre, String songTitle) {
			if (map.containsKey(genre) ==false) {
				Set<String> temp = new HashSet<String>();
				temp.add(songTitle);
				map.put(genre,temp);
			}
			else {
				map.get(genre).add(songTitle);
			}
		}


	/* Return the Set that contains all songs for a genre */
	public Set<String> getSongs(String genre) {
			return map.get(genre);
	}

	/* Return genre, i.e., jazz, given a song title */
	public String getGenreOfSong(String songTitle) {
			Set<String> temp = new HashSet<String>();
			for (Set<String> i : map.values()) {
				if (i.contains(songTitle)) {
					temp = i;
				}
			}
			for (String i : map.keySet()) {
				  if (map.get(i) == temp) {
					  return i;
				  }
			}
			return "Does Not Exsist";
	}


	public int size() {
		return map.size();
	}



	
}

