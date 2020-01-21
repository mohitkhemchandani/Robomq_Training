package Assignment;

class Mediaitem extends Item{
	private int num;
	Mediaitem(int ID, String title, int No_ofCopies) {
		super(ID, title, No_ofCopies);
		// TODO Auto-generated constructor stub
	}
	
}

class Video extends Mediaitem{
	private String director;
	private String genre;
	private int year_published;
	
	
	Video(int ID, String title, int No_ofCopies) {
		super(ID, title, No_ofCopies);
		// TODO Auto-generated constructor stub
	}
	
	void setVideo(String director,String genre,int year_published) {
		this.director=director;
		this.genre=genre;
		this.year_published=year_published;
	}
	
	void getVideo() {
		System.out.println("Director "+this.director + " " + "Genre "+this.genre + "Year released " + this.year_published );
		
	}
	
}

class CD extends Mediaitem{
	private String artist;
	private int year;
	
	CD(int ID, String title, int No_ofCopies) {
		super(ID, title, No_ofCopies);
		// TODO Auto-generated constructor stub
	}
	
	void setCd(String artist,int year) {
		this.artist=artist;
		this.year=year;;
	}
	
	void getcd() {
		System.out.println("Cd-Artist "+this.artist+"Year published "+this.year);
		
	}
	
	
}
