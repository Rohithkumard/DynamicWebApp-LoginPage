import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Connection_File {

	static SessionFactory sf;
	static Transaction t;
	static Session s;
	
	String uname;
	int id;
	String pwd1;
	String emailId;
	String gen;
	
	NewAccount objq = new NewAccount();
	public boolean connect2db(String Uname, String pwd) {
		System.out.println(Uname+" "+ pwd);
		
		try {
			sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(NewAccount.class).buildSessionFactory();
			s = sf.openSession();
			}catch(Exception e) {
			System.err.println("Connection Problem");
	}
		t = s.beginTransaction();
		
		String query = "from NewAccount where Name=?1 and Password=?2";
		
		Query q = s.createQuery(query);
		q.setParameter(1, Uname);
		q.setParameter(2, pwd);
		List l = q.list();
		Iterator itr = l.iterator();
		
		while(itr.hasNext()) {
			NewAccount obj = (NewAccount)itr.next();
			id = obj.getLoginId();
			uname = obj.getName();
			pwd1 = obj.getPassword();
			emailId = obj.getEmailId();
			gen = obj.getGender();
			return true;
		}
		t.commit();
		s.close();
		
		return false;
	}
	
	public NewAccount connect2db_add(String unameN, String pwdN, String emailN, String genderN) {
		
		try {
			sf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(NewAccount.class).buildSessionFactory();
			s = sf.openSession();
			}catch(Exception e) {
			System.err.println("Connection Problem");
	}
		t = s.beginTransaction();
		objq.setName(unameN);
		objq.setPassword(pwdN);
		objq.setEmailId(emailN);
		objq.setGender(genderN);
		s.save(objq);
		t.commit();
		s.close();
		return objq;
		
	}
}
