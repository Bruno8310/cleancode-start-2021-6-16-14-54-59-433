##Code Smell
####1.Line3-9: OrderReceipt Class definition annotation information, operating: Delete the comment information defined by the OrderReceipt class
####2.Line5: Bad smell of variable naming, operating: o change to order
####3.Line5: Set member variables that will not be modified to final, operating: private final Order order
####4.Line11-15: Delete unused methods, operating: delete printCustomerName()
####5.Line15-19: Delete all annotation information in the method, operating: eg:print headers...
####6.Line22-29: Rename output into receiptInfos
####7.Line11: Delete todo
####8.Line4-12: Extract all constant strings and characters
####9.Line23-24: Rename totSalesTx and tot into totalSalesTax and orderTotalAmount
####10. Line44-57: Add a calcuTotalSalesTaxAndTotalAmount method and final String filed
  
