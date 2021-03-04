import com.young.A;
import com.young.JavaConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Zongxu.Yang
 * create at 2021/1/29
 */
public class ApplicationContextTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(JavaConfig.class);
		A bean = app.getBean(A.class);
		System.out.println("test ------>"+bean.getClass());
		app.close();
	}
}
