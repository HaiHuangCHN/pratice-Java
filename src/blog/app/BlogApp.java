package blog.app;

import java.util.Scanner;

import blog.post.Post;
import blog.repository.PostRepositoryImplementsInterface;
import exception.BlogAppException;

public class BlogApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String command = scanner.nextLine();
			System.out.println(command);
			if (command.equals("exit")) {
				break;
			} else if (command.equals("create")) {
				System.out.println("Please enter that date you post in " + "'YYYY-MM-DD'" + " format");
				Post post = new Post();
				String date = scanner.nextLine();
				post.setDate(date);
				PostRepositoryImplementsInterface.processCreateCommand(post);
				try {
					PostRepositoryImplementsInterface.getInstance().saveData();
				} catch (BlogAppException e) {
					e.printStackTrace();
				}
			} else if (command.equals("list")) {
				try {
					PostRepositoryImplementsInterface.getInstance().loadData();
				} catch (BlogAppException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (command.equals("show")) {
				
			} else if (command.equals("delete")) {
			} else {
				continue;
			}
		}
	}
}