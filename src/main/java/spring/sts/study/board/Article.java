package spring.sts.study.board;

import java.util.Date;
 
public class Article {

	private Integer Id;
	private String writerName;
	private String title;
	private String content;
	private Date creationTime;
	
	
	public void setId(Integer id) {
		Id = id;
	}

	public Integer getId() {
		return Id;
	}

	public String getWriterName() {
		return writerName;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public Date getCreationTime() {
		return creationTime;
	}
}
