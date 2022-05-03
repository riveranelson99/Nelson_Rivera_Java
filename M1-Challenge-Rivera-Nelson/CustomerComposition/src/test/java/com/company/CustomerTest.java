package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    public Customer customer;
    public ContactInfo contactInfo;
    public ShippingInfo shippingInfo;
    public BillingInfo billingInfo;

    @Before
    public void setUp() throws Exception {
        customer = new Customer();
        contactInfo = new ContactInfo();
        shippingInfo = new ShippingInfo();
        billingInfo = new BillingInfo();
    }

    @Test
    public void shouldCreateANewCustomer() {
        customer.setFirstName("John");
        customer.setLastName("Doe");
        customer.setRewardsMember(true);

        assertEquals("John", customer.getFirstName());
        assertEquals("Doe", customer.getLastName());
        assertEquals(true, customer.isRewardsMember());

    }

    @Test
    public void shouldCreateContactInfo() {
        contactInfo.setEmail("johndoe99@gmail.com");
        contactInfo.setPhoneNumber("8675309");

        assertEquals("johndoe99@gmail.com", contactInfo.getEmail());
        assertEquals("8675309", contactInfo.getPhoneNumber());
    }

    @Test
    public void shouldCreateShippingInfo() {
        shippingInfo.setStreet1("4312 Ave");
        shippingInfo.setStreet2("N/A");
        shippingInfo.setCity("Chicago");
        shippingInfo.setState("IL");
        shippingInfo.setZip(60645);

        assertEquals("4312 Ave", shippingInfo.getStreet1());
        assertEquals("N/A", shippingInfo.getStreet2());
        assertEquals("Chicago", shippingInfo.getCity());
        assertEquals("IL", shippingInfo.getState());
        assertEquals(60645, shippingInfo.getZip());
    }

    @Test
    public void shouldCreateBillingInfo() {
        billingInfo.setStreet1("5497 W");
        billingInfo.setStreet2("N/A");
        billingInfo.setCity("New York");
        billingInfo.setState("NY");
        billingInfo.setZip(48920);

        assertEquals("5497 W", billingInfo.getStreet1());
        assertEquals("N/A", billingInfo.getStreet2());
        assertEquals("New York", billingInfo.getCity());
        assertEquals("NY", billingInfo.getState());
        assertEquals(48920, billingInfo.getZip());
    }
}