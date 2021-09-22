package spring.sts.study;

import org.springframework.context.support.GenericXmlApplicationContext;

import spring.sts.study.board.WriteArticleService;

public class MainQuickStart {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx=
				new GenericXmlApplicationContext("classpath:acQuickStart.xml");
		
		 WriteArticleService writeArticleService = ctx.getBean("writeArticleService",WriteArticleService.class);
		
		 writeArticleService.write();
		 ctx.close();
	}
}
