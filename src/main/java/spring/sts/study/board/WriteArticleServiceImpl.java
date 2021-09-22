package spring.sts.study.board;

public class WriteArticleServiceImpl implements WriteArticleService{

	private ArticleDao articleDao;
	
	public WriteArticleServiceImpl(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
	
	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("WriteArticleServiceImpl.write() »£√‚µ ");
		Article article = new Article();
		articleDao.insert(article);
	}
}
