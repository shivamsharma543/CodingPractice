package main.java.exception;

public enum Service {
    COMPUTER("laptop"),
    AUTO("car"),
    ELECTRIC("ac");

    private String service;

    Service(String service) {
        this.service=service;
    }

    public String getService() {
        return service;
    }
}
