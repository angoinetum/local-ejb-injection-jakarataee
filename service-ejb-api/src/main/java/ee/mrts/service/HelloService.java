package ee.mrts.service;

import jakarta.ejb.Local;

@Local
public interface HelloService {

    String sayHello();

}
