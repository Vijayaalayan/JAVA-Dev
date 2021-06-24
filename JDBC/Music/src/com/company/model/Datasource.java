package com.company.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Datasource {
    public static final String DB_NAME = "music.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:D:\\JAVA-Dev\\JDBC\\Music\\"+DB_NAME;
    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ALBUM_ID = "_id";
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artist";
    public static final int INDEX_ALBUM_ID = 1;
    public static final int INDEX_ALBUM_NAME = 2;
    public static final int INDEX_ALBUM_ARTIST = 3;

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";
    public static final int INDEX_ARTIST_ID = 1;
    public static final int INDEX_ARTIST_NAME = 2;

    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONG_ID = "_id";
    public static final String COLUMN_SONG_TRACK = "track";
    public static final String COLUMN_SONG_TITLE = "title";
    public static final String COLUMN_SONG_ALBUM = "album";
    public static final int INDEX_SONG_ID = 1;
    public static final int INDEX_SONG_TRACK = 2;
    public static final int INDEX_SONG_TITLE = 3;
    public static final int INDEX_SONG_ALBUM = 4;

    public static final int ORDER_BY_NONE = 1;
    public static final int ORDER_BY_ASC = 2;
    public static final int ORDER_BY_DESC = 3;

//    SELECT albums.name from albums inner join artists on albums.artist = artists._id where artists.name = "Iron Maiden" ORDER BY albums.name COLLATE NOCASE ASC
    public static final String QUERY_ALBUMS_BY_ARTIST_START =
            "SELECT "+TABLE_ALBUMS+"."+COLUMN_ALBUM_NAME+" from "+TABLE_ALBUMS+" INNER JOIN "+TABLE_ARTISTS+" on "+
                    TABLE_ALBUMS+"."+COLUMN_ALBUM_ARTIST+" = "+TABLE_ARTISTS+"."+COLUMN_ARTIST_ID+
                    " where "+TABLE_ARTISTS+"."+COLUMN_ARTIST_NAME+" = \"";
    public static final String QUERY_ALBUMS_BY_ARTIST_SORT =
            " ORDER BY "+TABLE_ALBUMS+"."+COLUMN_ALBUM_NAME+" COLLATE NOCASE ";

    public static final String QUERY_ARTIST_FOR_SONG_START =
            "SELECT " + TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME + ", " +
                    TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME + ", " +
                    TABLE_SONGS + "." + COLUMN_SONG_TRACK + " FROM " + TABLE_SONGS +
                    " INNER JOIN " + TABLE_ALBUMS + " ON " +
                    TABLE_SONGS + "." + COLUMN_SONG_ALBUM + " = " + TABLE_ALBUMS + "." + COLUMN_ALBUM_ID +
                    " INNER JOIN " + TABLE_ARTISTS + " ON " +
                    TABLE_ALBUMS + "." + COLUMN_ALBUM_ARTIST + " = " + TABLE_ARTISTS + "." + COLUMN_ARTIST_ID +
                    " WHERE " + TABLE_SONGS + "." + COLUMN_SONG_TITLE + " = \"";

    public static final String QUERY_ARTIST_FOR_SONG_SORT =
            " ORDER BY " + TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME + ", " +
                    TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME + " COLLATE NOCASE ";


    private Connection conn;

    public boolean open(){
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        }catch (SQLException e){
            System.out.println("Couldn't connect to database : "+e.getMessage());
            return false;
        }
    }

    public void close(){
        try {
            if(conn!=null){
                conn.close();
            }
        }catch (SQLException e){
            System.out.println("Couldn't close connection : "+e.getMessage());
        }
    }

    public List<Artist> queryArtists(int sortOrder){
        StringBuilder sb = new StringBuilder("SELECT * FROM ");
        sb.append(TABLE_ARTISTS);
        if(sortOrder!=ORDER_BY_NONE){
            sb.append(" ORDER BY ");
            sb.append(COLUMN_ARTIST_NAME);
            sb.append(" COLLATE NOCASE ");
            if(sortOrder == ORDER_BY_ASC){
                sb.append("ASC");
            }else{
                sb.append("DESC");
            }
        }
        try(Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sb.toString())) {
            List<Artist> artists = new ArrayList<>();
            while (resultSet.next()){
                Artist artist = new Artist();
//                artist.setId(resultSet.getInt(COLUMN_ARTIST_ID));
//                artist.setName(resultSet.getString(COLUMN_ARTIST_NAME));
                artist.setId(resultSet.getInt(INDEX_ARTIST_ID));
                artist.setName(resultSet.getString(INDEX_ARTIST_NAME));
                artists.add(artist);
            }
            return artists;
        }catch (SQLException e){
            System.out.println("Query Failed "+e.getMessage());
            return null;
        }
    }

    public List<String> queryAlbumsFromArtist(String artistName,int sortOrder){
        StringBuilder sb = new StringBuilder(QUERY_ALBUMS_BY_ARTIST_START);
        sb.append(artistName);
        sb.append("\"");
        if(sortOrder!=ORDER_BY_NONE){
            sb.append(QUERY_ALBUMS_BY_ARTIST_SORT);
            if(sortOrder == ORDER_BY_DESC){
                sb.append("DESC");
            }else{
                sb.append("ASC");
            }
        }
        System.out.println("SQL STATEMENT : "+sb.toString());
        try(Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sb.toString())){
            List<String> albums = new ArrayList<>();
            while (resultSet.next()){
                albums.add(resultSet.getString(1));
            }
            return albums;
        }catch (SQLException e){
            System.out.println("Query Failed : "+e.getMessage());
            return null;
        }
    }

    public List<SongArtist> queryArtistsForSong(String songName,int sortOrder){
        StringBuilder sb = new StringBuilder(QUERY_ARTIST_FOR_SONG_START);
        sb.append(songName);
        sb.append("\"");
        if(sortOrder!=ORDER_BY_NONE){
            sb.append(QUERY_ALBUMS_BY_ARTIST_SORT);
            if(sortOrder == ORDER_BY_DESC){
                sb.append("DESC");
            }else{
                sb.append("ASC");
            }
        }
        System.out.println("SQL STATEMENT : "+sb.toString());
        try(Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sb.toString())){
            List<SongArtist> songArtists = new ArrayList<>();
            while(resultSet.next()){
                SongArtist songArtist = new SongArtist();
                songArtist.setArtistName(resultSet.getString(1));
                songArtist.setAlbumName(resultSet.getString(2));
                songArtist.setTrack(resultSet.getInt(3));
                songArtists.add(songArtist);
            }
            return songArtists;
        }catch (SQLException e){
            System.out.println("Query Failed : "+e.getMessage());
            return null;
        }
    }

    public void querySongsMetaData(){
        String sql = "SELECT * FROM "+TABLE_SONGS;
        try(Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)){
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int numColumns = resultSetMetaData.getColumnCount();
            for(int i=1;i<=numColumns;i++){
                System.out.format("Column %d in the songs table is named %s\n",i,resultSetMetaData.getColumnLabel(i));
            }
        }catch (SQLException e){
            System.out.println("Query Failed : "+e.getMessage());
        }
    }
}
