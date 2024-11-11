import com.example.Circle;
import com.example.Rectangle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ClassPathXmlApplicationContext take the path starting from src folder
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationcontext.xml");

        Scanner in = new Scanner(System.in);
        System.out.println("If U want to get an area of a circle Enter 1 and to get the area of a rectangle enter 2");
        int choice = in.nextInt();
        switch (choice){
            case 1:
                Circle circle = container.getBean("circleBean", Circle.class);
                System.out.println(circle.getArea());
                break;
            case 2:
                Rectangle rectangle = container.getBean("rectangleBean", Rectangle.class);
                System.out.println(rectangle.getArea());
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
}