package trail;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("trail")
public class NoXmlConfig {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(NoXmlConfig.class);
		
		SupportingNoxml objNoxml=context.getBean("supportingNoxml",SupportingNoxml.class);
		
		objNoxml.hello();
		
		
	}

}
