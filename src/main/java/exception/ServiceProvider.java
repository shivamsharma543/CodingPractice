package main.java.exception;

import main.java.exception.Service;

public class ServiceProvider {

    public boolean isValidService(String service){

        return Service.AUTO.equals(service) || Service.COMPUTER.equals(service) || Service.ELECTRIC.equals(service);

    }
}
