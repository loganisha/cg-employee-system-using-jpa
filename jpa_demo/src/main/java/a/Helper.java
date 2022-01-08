package a;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class Helper {

	public static Session getSession() {
		Session s = null;
		try {
			System.out.println("inside try....");
			Configuration cf = new Configuration();
			cf = cf.configure("hibernate.cfg.xml");
			SessionFactory sf = cf.buildSessionFactory();
			s = sf.openSession();
			System.out.println(s);
		} catch (Exception e) {
			System.out.println(" general other than hibernate error" + e);
		}
		return s;
	}
}
