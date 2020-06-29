package app;

import model.*;
import streamableInterface.*;
import info.*;

public class Startup
{
	public static void main(String args[])
    {
        File file = new File("Test",12,12);
        Music music = new Music("Some name","Cool",15,2222);
        Movie movie = new Movie("Star Wars", 2020, 12, 123);

        StreamProgressInfo stramFileInfo = new StreamProgressInfo(file);
        StreamProgressInfo stramMusicInfo = new StreamProgressInfo(music);
        StreamProgressInfo stramMovieInfo = new StreamProgressInfo(movie);

        System.out.println(stramFileInfo.CalculateCurrentPercent());
        System.out.println(stramMusicInfo.CalculateCurrentPercent());
        System.out.println(stramMovieInfo.CalculateCurrentPercent());
    }
}
