package beforeadvice;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class DeclareBeforeMethod implements MethodBeforeAdvice
{
	@Override
	public void before(Method method, Object[] args, Object target)
		throws Throwable {
	        System.out.println("DeclareBeforeMethod : Before method printed!");
	}
}