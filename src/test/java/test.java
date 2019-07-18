import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test.IocDITest;
import test.OthersService;
import test.PersonService;
import test.UserService;

public class test {
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	@Test
	public void test() {
		//--------------------
		PersonService person3 = (PersonService)context.getBean("personService");
		String message =  person3.getMessage();
		System.out.println(message);
		
		//---------------------
		BeanFactory factory = new ClassPathXmlApplicationContext("beans.xml");
		//方法一
		PersonService person = factory.getBean(PersonService.class);
		UserService user = factory.getBean(UserService.class);
		//方法二
		PersonService person2 = (PersonService)factory.getBean("personService");
		UserService user2 = (UserService)factory.getBean("userService");
		person.sayHi();
		user.sayHi();
		System.out.println(person2.getMessage());
		System.out.println(user2.getMessage());
	}
	@Test
	public void test2() {
		IocDITest idt = context.getBean(IocDITest.class);
		Set set = idt.getCity();
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		Map<String, Object> map = idt.getName();
		Set<String> set2 = map.keySet();
		for (Iterator iterator = set2.iterator(); iterator.hasNext();) {
			String key = (String) iterator.next();
			Object obj = map.get(key);
			System.out.println(key+"="+obj);
		}
		
		List<String> list = idt.getPlayerName();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String content = (String) iterator.next();
			System.out.println(content);
		}
		
		System.out.println(idt.getUsername());
		System.out.println(idt.getIdcard());
	}
	@Test
	public void test3() {
		OthersService others = (OthersService)context.getBean("cons");
		others.getName();
	}
}
