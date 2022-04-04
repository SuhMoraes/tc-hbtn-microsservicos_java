package com.song.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SongRepository {
	private List<Song> list = new ArrayList<Song>();

    public List<Song> getAllSongs() {
     return list;
    }

    public Song getSongById(Integer id) {
		return list.get(id);
       
    }

    public Song addSong(Song s) {
      list.add(s);
	return s;
    }

    public Song updateSong(Song s) {
      list.add(s);
	return s;
     }

    public void removeSong(Song s) {
      list.remove(s);
    }


}
