package aroundadvice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class HijackAroundMethod implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {

		System.out.println("Method name : "
				+ methodInvocation.getMethod().getName());
		System.out.println("Method arguments : "
				+ Arrays.toString(methodInvocation.getArguments()));

		// same with MethodBeforeAdvice
		System.out.println("DeclareAroundMethod : Before method declared!");

		try {
			// proceed to original method call
			Object result = methodInvocation.proceed();

			// same with AfterReturningAdvice
			System.out.println("DeclareAroundMethod : Before after declared!");

			return result;

		} catch (IllegalArgumentException e) {
			// same with ThrowsAdvice
			System.out.println("DeclareAroundMethod : Throw exception declared!");
			throw e;
		}
	}
}