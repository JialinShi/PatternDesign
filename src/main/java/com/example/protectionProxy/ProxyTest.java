package com.example.protectionProxy;

public class ProxyTest {

    public static void main(String[] args) {
        Person joe = new PersonImpl("Joe","Male");

        // ownerProxy
        Person ownerProxy = ProxyFactory.getOwnerProxy(joe);
        System.out.println("Name: "+ ownerProxy.getName());
        ownerProxy.setHobby("Dancing");
        System.out.println("Hobby: "+ ownerProxy.getHobby());
        try{
            ownerProxy.setRating(1.0);
        }catch(Exception e){
            System.out.println("Failed to rate Yourself.");
        }

        // Non-owner proxy
        Person nonOwnerProxy = ProxyFactory.getNonOwnerProxy(joe);
        System.out.println("Name: " + nonOwnerProxy.getName());
        nonOwnerProxy.setRating(5);
        System.out.println("Rating: " + nonOwnerProxy.getRating());

    }

}
