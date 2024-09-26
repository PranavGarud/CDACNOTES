package day9;

public class MediaPlayer {

	public void playMedioa(List<? extends Media> playlist)
	{
		for(Media item : playlist)
		{
			item.play();
		}
	}
	public static void main(String[] args) {
		MediaPlayer player = new MediaPlayer();
		List<Media> mlist = new ArrayList<>();
		mlist.add(new Song(3254,"aaaaa"));
		mlist.add(new Video());
		
		player
	}
}
