package 자바_예제문제실습;

public class Movie {
	private String 영화제목;
	private String 영화장르;
	
	//Getter Setter
	public void set영화장르(String 영화장르) {
		this.영화장르 = 영화장르;
	}
	public void set영화제목(String 영화제목) {
		this.영화제목 = 영화제목;
	}
	public String get영화장르() {
		return 영화장르;
	}
	public String get영화제목() {
		return 영화제목;
	}

  public Movie() {
	// TODO Auto-generated constructor stub
   }
 
  public Movie(String 영화제목, String 영화장르) {
	super();
	this.영화제목 = 영화제목;
	this.영화장르 = 영화장르;
}



}
