package practice.reactive.model;

import practice.reactive.model.accessor.Service;

public class ServiceProvider {

    public boolean isValidService(String service){

        return Service.AUTO.equals(service) || Service.COMPUTER.equals(service) || Service.ELECTRIC.equals(service);

    }
}
