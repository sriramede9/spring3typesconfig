package trail;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Hello hello = context.getBean("hello", Hello.class);// a hello world program// along with init and
															// destroy-method

		System.out.println(hello.getMessage());// getting things from bean obj and yes succesfully connected

		Parent objA = context.getBean("par", Parent.class);// exploring the beaty of bean inheritance
		objA.getMessage1();// hello world
		objA.getMessage2();// hello second world

		Child objB = context.getBean("chil", Child.class);// now I have made Parent as abstract and child referencing to
															// it in config file
		objB.getMessage1();// hello india now it should be hello world
		objB.getMessage2();// should be null according to me//why second world? // cause it is inheriting
							// in the bean container not in the class
		objB.getMessage3();// namaste india // now it is one more shot

		ConstInjection objC = context.getBean("cos", ConstInjection.class);// constructor injection with 0,1,2
																			// paramaeters and values can be objects or
																			// values

		System.out.println(objC.getName() + objC.getAge() + "reporting from cinj constructor");// testing contructor
																								// injection with 2
																								// params

		SettermethInjection objd = context.getBean("smi", SettermethInjection.class);// understanding setter method
																						// injection

		// testing it.

		System.out.println(objd.getStyle());

		// reference is for obj references and values for values, indexes to define
		// positions if have may params not working right now have to explore

		// injecting inner beans

		// now I am inserting an object of hello to setmethod injection ussing inner
		// bean

		SettermethInjection obje = context.getBean("smi", SettermethInjection.class);// <propery> inside <bean>

		System.out.println(obje.getHllo().getMessage()+"\t from inner bean");

		context.close();
	}

}
