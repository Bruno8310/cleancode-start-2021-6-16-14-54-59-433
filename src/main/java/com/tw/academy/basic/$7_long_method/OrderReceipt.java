package com.tw.academy.basic.$7_long_method;


import sun.dc.pr.PRError;

public class OrderReceipt {
    private static final String SALES_TAX = "Sales Tax";
    private static final String TOTAL_AMOUNT = "Total Amount";
    private static final String PRINT_INFO_HEAD = "======Printing Orders======";
    private static final char NEW_LINE = '\n';
    private static final char TABS= '\t';
    private static final double DISCOUNT_NUMBER = .10;
    private final Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        StringBuilder receiptInfos = new StringBuilder();
        receiptInfos.append(PRINT_INFO_HEAD);
        receiptInfos.append(NEW_LINE);
        receiptInfos.append(order.getCustomerName());
        receiptInfos.append(order.getCustomerAddress());
        double totSalesTx = 0d;
        double tot = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            receiptInfos.append(lineItem.getDescription());
            receiptInfos.append(TABS);
            receiptInfos.append(lineItem.getPrice());
            receiptInfos.append(TABS);
            receiptInfos.append(lineItem.getQuantity());
            receiptInfos.append(TABS);
            receiptInfos.append(lineItem.totalAmount());
            receiptInfos.append(NEW_LINE);

            double salesTax = lineItem.totalAmount() * DISCOUNT_NUMBER;
            totSalesTx += salesTax;

            tot += lineItem.totalAmount() + salesTax;
        }

        receiptInfos.append(SALES_TAX).append(TABS).append(totSalesTx);

        receiptInfos.append(TOTAL_AMOUNT).append(TABS).append(tot);
        return receiptInfos.toString();
    }
}