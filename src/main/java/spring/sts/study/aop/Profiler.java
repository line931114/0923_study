package spring.sts.study.aop;

import org.aspectj.lang.ProceedingJoinPoint; 

public class Profiler {

	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable{
		String signatureString = joinPoint.getSignature().toShortString();
		System.out.println(signatureString + " -�޼ҵ� ������");
		long start = System.currentTimeMillis();
		
		try {
				Object result = joinPoint.proceed();
				return result;
			
		}finally {
			long finish = System.currentTimeMillis();
			System.out.println(signatureString+ " -�޼ҵ� ������");
			System.out.println(signatureString+ "���� �ð� :" + (finish-start)+ "ms");
		}
	}
}
