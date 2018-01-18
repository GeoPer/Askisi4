
public class Song {

	private	String title;   
	private	Singer singer;  
	private	String url ;
	static Song songs[] = new Song [10];
	static int counter=0;
	
	public Song(String title, Singer singer, String url) {
		this.title = title;
		this.singer = singer;
		this.url = url;
		++counter;
		songs[counter]=this;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setSinger(Singer singer) {
		this.singer=singer;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Singer getSinger() {
		return singer;
	}
	
	public String getUrl() {
		return url;
	}
	
	public String toString() {
		return "Song [title=" + title +  ", url=" + url + "]";
	}
}
