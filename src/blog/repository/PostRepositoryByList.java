package blog.repository;

import java.util.ArrayList;
import java.util.Iterator;

import blog.post.Post;

public class PostRepositoryByList {
	
	private static ArrayList<Post> posts = new ArrayList<Post>();
		
	public static void add(Post post) {
		posts.add(post);
	}
	
	public void remove(String date) {
		for (Post post: posts) {
			if (post.getDate().equals(date)) {
				posts.remove(post); 
				return;
			}
		}
	}
	
	public Post getPostById(String date) {
		for (Post post : posts) {
			if (post.getDate().equals(date)) {
				return post;
			}
		}
		return null;
	}
	

/*	Another way to realize the same function of "remove"
	public static void remove(long id) {
		Iterator<Post> iterator = posts.iterator();
		while (iterator.hasNext()) {
			Post post = iterator.next();
			if (post.getId() == id) {
				posts.remove(post);
				return;
			}
		}
	}	
*/
	public static ArrayList<Post> getAll() {
		return posts;
	}
}