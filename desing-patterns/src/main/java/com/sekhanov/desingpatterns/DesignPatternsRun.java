package com.sekhanov.desingpatterns;

import com.sekhanov.desingpatterns.behavioralpatterns.chainofresponsibility.CheckCorrectPasswordMiddleWare;
import com.sekhanov.desingpatterns.behavioralpatterns.chainofresponsibility.CheckLoginExistMiddleWare;
import com.sekhanov.desingpatterns.behavioralpatterns.chainofresponsibility.MiddleWare;
import com.sekhanov.desingpatterns.behavioralpatterns.chainofresponsibility.Server;
import com.sekhanov.desingpatterns.behavioralpatterns.mediator.ConcreteMediator;
import com.sekhanov.desingpatterns.behavioralpatterns.mediator.ConcreteSender;
import com.sekhanov.desingpatterns.behavioralpatterns.observer.ConcreteSubscriber;
import com.sekhanov.desingpatterns.behavioralpatterns.observer.Publisher;
import com.sekhanov.desingpatterns.behavioralpatterns.observer.Subscriber;
import com.sekhanov.desingpatterns.behavioralpatterns.strategy.Context;
import com.sekhanov.desingpatterns.behavioralpatterns.strategy.StrategyOne;
import com.sekhanov.desingpatterns.behavioralpatterns.strategy.StrategyTwo;
import com.sekhanov.desingpatterns.behavioralpatterns.visitor.ConcreteVisitor;
import com.sekhanov.desingpatterns.behavioralpatterns.visitor.Dot;
import com.sekhanov.desingpatterns.behavioralpatterns.visitor.Visitor;
import com.sekhanov.desingpatterns.creationalpatterns.builder.Message;
import com.sekhanov.desingpatterns.creationalpatterns.prototipe.Command;
import com.sekhanov.desingpatterns.creationalpatterns.singleton.Singleton;
import com.sekhanov.desingpatterns.structuralpatterns.Composite.CircleComponent;
import com.sekhanov.desingpatterns.structuralpatterns.Composite.CompositeGraphics;
import com.sekhanov.desingpatterns.structuralpatterns.decorator.ConcreteComponent;
import com.sekhanov.desingpatterns.structuralpatterns.decorator.ConcreteDecorator;
import com.sekhanov.desingpatterns.structuralpatterns.facade.PcFacade;
import com.sekhanov.desingpatterns.structuralpatterns.proxy.Producer;
import com.sekhanov.desingpatterns.structuralpatterns.proxy.ProxyPhoneProducer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsRun implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsRun.class, args);
    }

    @Override
    public void run(String... args) {
        observer();

//       builder();
//        prototype();
//         demoChainOfResponsibility();
//         demoSingleton();
//         demoFacade();
//         demoObserver();
//         composite();
//         decorator();
//         visitor();
//         mediator();
//         strategy();
//        proxy();

    }

    private void observer() {
        Publisher publisher = new Publisher();
        Subscriber subscriber1 = new ConcreteSubscriber("Ivan");
        Subscriber subscriber2 = new ConcreteSubscriber("Sergey");
        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);
        publisher.businessLogic("Busines is working");
    }

    private void prototype() {
        Command command = new Command();
        command.setName("hello");
        command.setScript("System.out.print('Hello World')");
        command.setSize(10);
        System.out.println(command.clone());
    }

    private void builder() {
        Message message = new Message
                .Builder("sekhanov@gmail.com", "sekahnov@akvelon.com")
                .setTheme("new theme")
                .setBody("email body")
                .build();
        message.sendMessage();
    }

    private void proxy() {
        Producer producer = new ProxyPhoneProducer();
        System.out.println(producer.produceProduct());
        System.out.println(producer.destroyProduct());
    }

    private void strategy() {
        Context context = new Context();
        context.setStrategy(new StrategyOne());
        context.executeStrategy();
        context.setStrategy(new StrategyTwo());
        context.executeStrategy();
    }

    private void mediator() {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        ConcreteSender concreteSender = new ConcreteSender(concreteMediator, "one");
        ConcreteSender concreteSender2 = new ConcreteSender(concreteMediator, "two");
        ConcreteSender concreteSender3 = new ConcreteSender(concreteMediator, "three");
        concreteMediator.addSender(concreteSender);
        concreteMediator.addSender(concreteSender2);
        concreteMediator.addSender(concreteSender3);
        concreteSender.send("hello!");
    }

    private void visitor() {
        com.sekhanov.desingpatterns.behavioralpatterns.visitor.Circle circle = new com.sekhanov.desingpatterns.behavioralpatterns.visitor.Circle(2, 4
        );
        circle.setRadius(10);
        Dot dot = new Dot(20, 10);
        Visitor visitor = new ConcreteVisitor();
        visitor.visitDot(dot);
        visitor.visitCircle(circle);
    }

    private void decorator() {
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(new ConcreteComponent());
        concreteDecorator.show();
    }

    private void composite() {
        CompositeGraphics compositeGraphics = new CompositeGraphics();
        compositeGraphics.addComponent(new CircleComponent(5));
        compositeGraphics.addComponent(new CircleComponent(4));
        compositeGraphics.addComponent(new CircleComponent(3));
        compositeGraphics.paint();
    }

    private void demoFacade() {
        new PcFacade().copyFromDvdRomToHdd();
    }

    private void demoSingleton() {
        Singleton singleton1 = Singleton.getInstance(1);
        Singleton singleton2 = Singleton.getInstance(2);
        System.out.println("singleton2 value = " + singleton2.getValue());
    }

    private void demoChainOfResponsibility() {
        Server server = new Server();
        server.addUser("admin", "admin_pass");
        server.addUser("user", "user_pass");
        MiddleWare middleWare = new CheckLoginExistMiddleWare(server);
        middleWare.linkWith(new CheckCorrectPasswordMiddleWare(server));
        server.setMiddleWare(middleWare);
        loginAndPassInputFromCommandLine(new BufferedReader(new InputStreamReader(System.in)), server);

    }

    private void loginAndPassInputFromCommandLine(BufferedReader bufferedReader, Server server) {
        boolean success = false;
        String login = null;
        String password = null;
        do {
            try {
                System.out.println("enter login");
                login = bufferedReader.readLine();
                System.out.println("enter password");
                password = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            success = server.logIn(login, password);
        } while (!success);
    }

}
