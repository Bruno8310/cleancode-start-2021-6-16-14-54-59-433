package com.tw.academy.basic.$7_long_method;


import java.util.HashMap;
import java.util.Map;

public class OrderReceipt {
    private static final String SALES_TAX = "Sales Tax";
    private static final String TOTAL_AMOUNT = "Total Amount";
    private static final String PRINT_INFO_HEAD = "======Printing Orders======";
    private static final char NEW_LINE = '\n';
    private static final char TABS= '\t';
    private static final double DISCOUNT_NUMBER = .10;
    private final Order order;
    private static final String TOTAL_SALES_TAX = "totalSalesTax";
    private static final String ORDER_TOTAL_AMOUNT = "orderTotalAmount";

    public OrderReceipt(Order order) {
        this.order = order;
    }

    public String printReceipt() {
        StringBuilder receiptInfos = new StringBuilder();
        receiptInfos.append(PRINT_INFO_HEAD);
        receiptInfos.append(NEW_LINE);
        receiptInfos.append(order.getCustomerName());
        receiptInfos.append(order.getCustomerAddress());
        for (LineItem lineItem : order.getLineItems()) {
            receiptInfos.append(lineItem.getDescription());
            receiptInfos.append(TABS);
            receiptInfos.append(lineItem.getPrice());
            receiptInfos.append(TABS);
            receiptInfos.append(lineItem.getQuantity());
            receiptInfos.append(TABS);
            receiptInfos.append(lineItem.totalAmount());
            receiptInfos.append(NEW_LINE);
        }

        Map<String, Double> calculatedReceiptInfos = calcuTotalSalesTaxAndTotalAmount();
        receiptInfos.append(SALES_TAX).append(TABS).append(calculatedReceiptInfos.get(TOTAL_SALES_TAX));
        receiptInfos.append(TOTAL_AMOUNT).append(TABS).append(calculatedReceiptInfos.get(ORDER_TOTAL_AMOUNT));
        return receiptInfos.toString();
    }

    private Map<String, Double> calcuTotalSalesTaxAndTotalAmount() {
        Map<String, Double> calculatedReceiptInfos = new HashMap<>();
        double totalSalesTax = 0d;
        double orderTotalAmount = 0d;
        for (LineItem lineItem : order.getLineItems()) {
            double salesTax = lineItem.totalAmount() * DISCOUNT_NUMBER;
            totalSalesTax += salesTax;
            orderTotalAmount += lineItem.totalAmount() + salesTax;
        }
        calculatedReceiptInfos.put(TOTAL_SALES_TAX,  totalSalesTax);
        calculatedReceiptInfos.put(ORDER_TOTAL_AMOUNT, orderTotalAmount);
        return calculatedReceiptInfos;
    }
}