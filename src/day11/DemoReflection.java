package day11;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedArrayType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;


public class DemoReflection {

	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException,IllegalAccessException, InvocationTargetException, InstantiationException{
		Student S = new Student();
		Class c = S.getClass();
		
		c = Class.forName("day11.Student");
		
		Field[] fields = c.getDeclaredFields();
		
		for(Field f : fields)
		{
			Type type = f.getGenericType();
			System.out.println(type.getTypeName());
			System.out.println(f.getName());
			//f.setAccessible(true);
			//f.setInt(S,20);
		}
		for(Field f : fields)
		{
			f.setAccessible(true);
			if(f.getName().equals("rollno"))
				f.setInt(S, 10);
			if(f.getName().equals("name"))
				f.set(S, "abc");
		}
		System.out.println(S);
		System.out.println("---------------------------------------------------------");
		Method [] methods = c.getDeclaredMethods();
		for(Method method : methods)
		{
			System.out.println(method.getName());
			if(method.getName().equals("simpleMethod"))
			{
				method.invoke(S);
			}
			if(method.getName().equals("methodWithParam"))
			{
				Type [] types = method.getGenericParameterTypes();
				System.out.println(Arrays.toString(types));
				method.invoke(S,23,"kkk");
			}
			if(method.getName().equals("privateMethod"))
			{
				method.setAccessible(true);
				method.invoke(S);
			}
			if(method.getName().equals("StaticMethod"))
			{
				method.setAccessible(true);
				method.invoke(null);
			}
			//Constructor<Student> ss = c.getDeclaredConstructor(Student.class);
			Constructor<Student> [] cons = c.getDeclaredConstructors();
			for(Constructor<Student> con : cons)
			{
				if(con.getParameterCount() == 2)
				{
					Student ss = con.newInstance(12,"SSS");
					System.out.println(ss);
				}
			}
			for(Method method1 : methods)
			{
				if(method1.getDeclaredAnnotation(CreatedBy.class)!=null)
				{
					CreatedBy myanno = method1.getAnnotation(CreatedBy.class);
					System.out.println(myanno.name());
					System.out.println(myanno.priority());
					if(myanno.priority()==1)
						method1.invoke(S, 34,"ppp");
				}
			}
		}
	}
}
