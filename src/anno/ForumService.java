package anno;

public class ForumService {
	@AnnotationPratice(value = true)
	public void deleteForum(int forumId) {
		System.out.println("Delete forum part：" + forumId);
	}

	/**
	 * 
	 * @param topicId
	 */
	@AnnotationPratice(value = false)
	public void deleteTopic(int topicId) {
		System.out.println("Delete topic part：" + topicId);
	}
}
