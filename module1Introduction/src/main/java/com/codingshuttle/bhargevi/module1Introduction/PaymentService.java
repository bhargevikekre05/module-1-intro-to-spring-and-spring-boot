package com.codingshuttle.bhargevi.module1Introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    public void pay() {
        System.out.println("Paying...");
    }

    @PostConstruct
    public void afterInitialization () {
        System.out.println("Before Paying... this method will run as it have postconstruct annotation");
    }

    @PreDestroy
    public void beforeDestroy () {
        System.out.println("After payment is done and the application is shutdown/stop the springboot application stop tomcat server");

    }

}

/*
@Component is a Spring annotation used to tell the Spring Framework:
   *“Make an object of this class and manage its lifecycle automatically.”
   *Any class annotated with @Component becomes a Spring Bean.
Use @Component when your class:
 *does NOT fit into a special category like service/repository/controller but still needs to be a Spring-managed bean
  and needs DI (dependency injection)
  Examples:
  Utility classes
  Custom validators
  Custom mappers
  Helper classes
  Event handlers
  Background job classes
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

@PostConstruct is used on a method inside a Spring bean.
 Spring calls this method automatically right after the bean is created and all dependencies are injected
 "Do something after the object is ready but before it is used.”
  Why is it imp? -> Some beans need extra setup after all dependencies are available.
  Examples: warm up caches, open a DB connection, validate injected config, start a background scheduler, initialize third‑party clients

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
@PreDestroy is called right before the Spring bean is destroyed.
    “Do cleanup before the app shuts down.”
    Why is it important? -> Some resources must be closed properly to avoid memory leaks.
    Examples: closing database connections, shutting down ExecutorService, stopping schedulers,
    flushing logs, closing message brokers

 */