package afterreturning;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

public class DeclareAfterMethod implements AfterReturningAdvice
{
	@Override
	public void afterReturning(Object returnValue, Method method,
		Object[] args, Object target) throws Throwable {
	        System.out.println("DelareAfterMethod : After method declared!");
	}
}