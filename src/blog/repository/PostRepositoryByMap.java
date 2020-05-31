package blog.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import blog.post.Post;


public class PostRepositoryByMap {
	
	private static Map<String, Post> postsMap = new HashMap<String, Post>();
	
	public static void add(Post post) {
		postsMap.put(post.getDate(), post);
	}
	
	public static void remove(String id) {
		postsMap.remove(id);
	}	
	
	public static Post getPostById(String id) {    
		return postsMap.get(id);
	}
	
	public static List<Post> getAll() {
		List<Post> posts = new ArrayList<>();      
		posts.addAll(postsMap.values());
		return posts;
	}
	
	
/*	for (Map.Entry<Long, Post> postEntry : postMap.entrySet()) {
	    Long id = postEntry.getKey();
	    Post post = postEntry.getValue();
	    //Operate all post in a for cycle
	    ...
	}*/
	
}



