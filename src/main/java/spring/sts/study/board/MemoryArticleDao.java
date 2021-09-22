package spring.sts.study.board;

public class MemoryArticleDao implements ArticleDao{
	@Override
	public void insert(Article article) {
		System.out.println("MemoryArticleDao.insert() »£√‚µ ");
	}
}

