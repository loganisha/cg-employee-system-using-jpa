package a;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		System.out.println("Hello World!");
		System.out.println("Hai nisha");
		Session s = Helper.getSession();
		System.out.println(s);
//		Employee e = new Employee(100, "nishanth", "chennai");
//		Transaction tr = s.beginTransaction();
//		s.save(e);
//		tr.commit();
//		s.close();
		System.out.println("employee saved!!! Check MYSQL!!!");
		System.out.println("--------------fetch employee-------------");
		Employee e1 = (Employee) s.load(Employee.class, 100);
		System.out.println(e1.getEname() + "   " + e1.getAddress());
		System.out.println("--------------------Update employee---------------");
		e1.setAddress("Delhi");
		Transaction tr = s.beginTransaction();
		s.update(e1);
		tr.commit();
		s.close();
		System.out.println("data updated check mysql!!!!");
		// s.delete(e1);

	}
}
