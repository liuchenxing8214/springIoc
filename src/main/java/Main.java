import com.zfx.student.StudentA;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

 /*       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book = applicationContext.getBean("book", Book.class);
        book.printBookInfo();*/
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context.getBean("a", StudentA.class));
    }
}

