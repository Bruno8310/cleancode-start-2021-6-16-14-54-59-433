package com.tw.academy.basic.$5_data_clumps;

public class Parcel {
    private final ParcelUser receiverUser;
    private final ParcelUser senderUser;
    private String size;
    private Double weight;

    public Parcel(String size, Double weight,
                  ParcelUser receiverUser, ParcelUser senderUser) {
        this.size = size;
        this.weight = weight;
        this.receiverUser = receiverUser;
        this.senderUser = senderUser;
    }

    public String confirmReceiver(){
        return String.format("Please confirm receiver information: receiver name is %s, " +
                        "receiver phone number is %s and receiver address is %s.\n",
                this.receiverUser.getName(), this.receiverUser.getPhoneNumber(), this.receiverUser.getAddress());
    }

    public String confirmSender(){
        return String.format("Please confirm sender information: sender name is %s, " +
                        "sender phone number is %s and sender address is %s.\n",
                this.senderUser.getName(), this.senderUser.getPhoneNumber(), this.senderUser.getAddress());
    }
}
