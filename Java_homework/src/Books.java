
public class Books {
	//private 
	private String title;
	private String author;
	private String publisher;
	private int copyrightdate;
	
	
	public Books(String title, String author, String publisher, int crdate) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.copyrightdate = crdate;
	}
	
	public String getTitle() {
		return title;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}

	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getCrdate() {
		return copyrightdate;
	}
	
	public void setCrdate(int crdate) {
		this.copyrightdate = crdate;
	}
	
	public String toString() {
		String description = "";
		description += "Title: \t" + title + "\n";
		description += "Author: \t" + author + "\n";
		description += "Publisher: \t" + publisher + "\n";
		description += "Copyright Date: \t" + copyrightdate + "\n";
		return description;
	}
}