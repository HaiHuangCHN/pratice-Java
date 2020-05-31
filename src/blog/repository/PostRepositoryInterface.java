package blog.repository;

import java.util.List;

import blog.post.Post;
import exception.BlogAppException;

public interface PostRepositoryInterface {
	
	public void add(Post post);
	
	public void remove(String date);
	
	public Post getPostByDate(String date);
	
	public List<Post> getAll();
	
	public void loadData() throws BlogAppException;
	
	public void saveData() throws BlogAppException;  
}