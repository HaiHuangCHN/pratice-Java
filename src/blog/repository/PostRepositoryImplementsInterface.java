package blog.repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

import blog.post.Post;
import exception.BlogAppException;

public class PostRepositoryImplementsInterface implements PostRepositoryInterface{
	
	private static final String DEFAULT_CONTENT = "He/She is so lasy, nothing to show here...";
	private static final String END_OF_POST = "End";
	private static final String FOLDER = "C:\\Users\\h.a.huang\\Documents\\Blog";//folder name
	private static final String SEPARATOR = "---";//separator of id & title
	
	private PostRepositoryImplementsInterface() {}
	
	private static final PostRepositoryImplementsInterface postRepositoryImplementsInterface = new PostRepositoryImplementsInterface();
	
	public static PostRepositoryImplementsInterface getInstance() {
		return postRepositoryImplementsInterface;
	}

	private static ArrayList<Post> posts = new ArrayList<Post>();
	
	public static void processCreateCommand(Post post) {
		System.out.println("Please input blog title");
		Scanner scanner = new Scanner(System.in);
		String title = scanner.nextLine();
		System.out.println("Please input blog content ended with 'End'");
		StringBuffer content = new StringBuffer();
		while (true) {
			String word = scanner.nextLine();
			if (word.equals(END_OF_POST)) {
				break;
			}
			content.append(word);
			content.append("\n");
		}
		post.setTitle(title);
		String contentString = content.toString();
		post.setContent(contentString);
		postRepositoryImplementsInterface.add(post);
	}
	
	@Override
	public void add(Post post) {
		posts.add(post);
	}
	
	@Override
	public void remove(String date) {
		for (Post post: posts) {
			if (post.getDate().equals(date)) {
				posts.remove(post); 
				return;
			}
		}
	}
	
	@Override
	public Post getPostByDate(String date) {
		for (Post post : posts) {
			if (post.getDate().equals(date)) {
				return post;
			}
		}
		return null;
	}
	
	@Override
	public ArrayList<Post> getAll() {
		return posts;
	}
	
	@Override
	public void loadData() throws BlogAppException {
		File dir = new File(FOLDER);
		List<File> files = (List<File>) FileUtils.listFiles(dir, null, true);
		posts.clear();
		for (File file : files) {			
			try {
				String fileName[] = file.getName().split(SEPARATOR);
				String content = FileUtils.readFileToString(file, "utf-8");
				
				Post post = new Post(fileName[1], content);
				post.setDate(fileName[0]);
				
				System.out.println(post.getDate());				
				System.out.println(post.getTitle());
				System.out.println(post.getContent());
				
			} catch (IOException ex) {
				ex.printStackTrace();
				BlogAppException be = new BlogAppException("load");
				be.initCause(ex);
				throw be;
			} catch (NumberFormatException ex) {
				ex.printStackTrace();
				BlogAppException be = new BlogAppException("load");
				be.initCause(ex);
				throw be;
			}
		}

	}
	

	@Override
	public void saveData() throws BlogAppException {
		for (Post post : PostRepositoryImplementsInterface.getInstance().getAll()) {
			String fileName = post.getDate() + SEPARATOR + post.getTitle();
			try {
				FileUtils.write(new File(FOLDER + File.separator + fileName), post.getContent());
			} catch (IOException IOex) {
				IOex.printStackTrace();
				BlogAppException bex = new BlogAppException("saveData");
				bex.initCause(IOex);
				throw bex;
			}
		}        
	}
	

}
