package spring.sts.study.aop;

import org.aspectj.lang.ProceedingJoinPoint; 

public class Profiler {

	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		String signatureString = joinPoint.getSignature().toShortString();
		System.out.println(signatureString + " -메소드 시작전");
		long start = System.currentTimeMillis();
		
		try {
				Object result = joinPoint.proceed();
				return result;
			
		}finally {
			long finish = System.currentTimeMillis();
			System.out.println(signatureString+ " -메소드 종료후");
			System.out.println(signatureString+ "실행 시간 :" + (finish-start)+ "ms");
		}
	}
}
