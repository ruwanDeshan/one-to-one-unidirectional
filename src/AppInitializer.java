import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){

        }
    }
}
