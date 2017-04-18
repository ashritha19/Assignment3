package afterthrowing;

import org.springframework.aop.ThrowsAdvice;

public class DeclareThrowException implements ThrowsAdvice {
	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		System.out.println("DeclareThrowException : Throw exception declared!");
	}
}