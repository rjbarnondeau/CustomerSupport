package com.example.rjbarondeaucustomersupport;

public class Ticket {

    private String customerName;

    private String subject;

    private String body;

    public Ticket(){
        super();
    }


    public Ticket(String customerName, String subject, String body){
        this.customerName = customerName;
        this.subject = subject;
        this.body = body;
    }


    public String getCustomerName() {
        return customerName;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
