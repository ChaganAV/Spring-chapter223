import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot1 = new Parrot();
        parrot1.setName("Miki");
        Parrot parrot2 = new Parrot();
        parrot2.setName("Koko");

        //Supplier<Parrot> parrotSupplier = (x->x);
        context.registerBean("Miki",Parrot.class,null);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
    }
}
