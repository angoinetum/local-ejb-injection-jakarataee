package ee.mrts.service;

import ee.mrts.service.HelloService;

import jakarta.ejb.Stateless;

@Stateless
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "hello!";
    }
}
