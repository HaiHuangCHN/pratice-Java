package blog.post;

public class Post {
	
	private static int count = 0;
	
	private String title;
	private String content;
	private String date;
	
	public Post(){
		count++;
	}

	public Post(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}

	/*
	 * We aim to get the accurate number of count, so this method should not be overwritten by sub-type
	 */
	public final static int getCount() {
		return count;
	}

	public void print() {
		System.out.println(title);
		System.out.println(content);	
	}
}