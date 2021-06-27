package com.company;

import com.company.model.Artist;
import com.company.model.Datasource;
import com.company.model.SongArtist;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if(!datasource.open()){
            System.out.println("Can't open datasource");
            return;
        }
        List<Artist> artists = datasource.queryArtists(Datasource.ORDER_BY_ASC);
        if(artists == null){
            System.out.println("No artists");
            return;
        }
        for(Artist artist : artists){
            System.out.println("ID = "+artist.getId()+" Name = "+artist.getName());
        }

        List<String> albumsFromArtist = datasource.queryAlbumsFromArtist("Iron Maiden",Datasource.ORDER_BY_ASC);
        if(albumsFromArtist == null){
            System.out.println("No albums from artist Iron Maiden");
            return;
        }
        for(String albums : albumsFromArtist){
            System.out.println(albums);
        }

        List<SongArtist> songArtists = datasource.queryArtistsForSong("Go Your Own Way",Datasource.ORDER_BY_ASC);
        if(songArtists == null){
            System.out.println("Couldn't find artist for the song");
            return;
        }
        for(SongArtist songArtist : songArtists){
            System.out.println("Artist name : "+songArtist.getArtistName()+" "+
                    "Album name : "+songArtist.getAlbumName()+" "+
                    "Track : "+songArtist.getTrack());
        }

        datasource.querySongsMetaData();
        int count = datasource.getCount(Datasource.TABLE_SONGS);
        System.out.println("Number of songs is : "+count);

        datasource.createViewForSongArtists();

        List<SongArtist> viewSongArtists = datasource.querySongInfoView("Go Your Own Way");
        if(viewSongArtists == null){
            System.out.println("Couldn't find artist");
            return;
        }
        for(SongArtist songArtist : viewSongArtists){
            System.out.println("Artist name : "+songArtist.getArtistName()+" "+
                    "Album name : "+songArtist.getAlbumName()+" "+
                    "Track : "+songArtist.getTrack());
        }
        datasource.close();
    }
}
