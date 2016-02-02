package annotation;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class AnnotationRunner {

	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(JunitAnnotation.class);
		for(Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println("Annotation execution: " + result.wasSuccessful());
	}

}
