package com.tw.academy.basic.$7_long_method;


public class OrderReceipt {
    private final Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        StringBuilder receiptInfos = new StringBuilder();

        receiptInfos.append("======Printing Orders======\n");

        receiptInfos.append(order.getCustomerName());
        receiptInfos.append(order.getCustomerAddress());

        double totSalesTx = 0d;
        double tot = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            receiptInfos.append(lineItem.getDescription());
            receiptInfos.append('\t');
            receiptInfos.append(lineItem.getPrice());
            receiptInfos.append('\t');
            receiptInfos.append(lineItem.getQuantity());
            receiptInfos.append('\t');
            receiptInfos.append(lineItem.totalAmount());
            receiptInfos.append('\n');

            double salesTax = lineItem.totalAmount() * .10;
            totSalesTx += salesTax;

            tot += lineItem.totalAmount() + salesTax;
        }

        receiptInfos.append("Sales Tax").append('\t').append(totSalesTx);

        receiptInfos.append("Total Amount").append('\t').append(tot);
        return receiptInfos.toString();
    }
}