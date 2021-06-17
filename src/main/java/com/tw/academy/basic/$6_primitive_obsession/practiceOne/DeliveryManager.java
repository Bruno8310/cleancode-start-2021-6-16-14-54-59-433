package com.tw.academy.basic.$6_primitive_obsession.practiceOne;

public class DeliveryManager {

    private Address to;

    private Address from;

    public DeliveryManager(Address from, Address to) {
        this.to = to;
        this.from = from;
    }

    public DeliverCenter allocate() {
        if (isSameProvince() && isSameCity()) {
            return DeliverCenter.LOCAL;
        }
        if (isSameProvince()) {
            return DeliverCenter.PROVINCE;
        }
        return DeliverCenter.FOREIGN;
    }

    private boolean isSameProvince() {
        return getProvince(getToAddress()).equals(getProvince(getFromAddress()));
    }

    private boolean isSameCity() {
        return getCity(getToAddress()).equals(getCity(getFromAddress()));
    }

    private String getCity(String address) {
        return address.substring(address.indexOf("省") + 1, address.indexOf("市"));
    }

    private String getProvince(String address) {
        return address.substring(0, address.indexOf("省"));
    }

    public String getToAddress() {
        return to.getAddress();
    }

    public String getFromAddress() {
        return from.getAddress();
    }

}
