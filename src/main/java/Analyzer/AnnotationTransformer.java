package Analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTransformer implements IAnnotationTransformer{

	
	public void transform(ITestAnnotation ita, Class na1, Constructor na2, Method na3) {
		// TODO Auto-generated method stub
		ita.setRetryAnalyzer(RetryAnalyzer.class);
	}
	

}
