package com.agualis.refactoring.largeclass;

import org.junit.Test;
import org.mockito.InOrder;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.spy;

public class TestExtractMethod {

    private static final String A_NAME = "A-name";
    public static final int ORDER1_AMOUNT = 23;
    public static final int ORDER2_AMOUNT = 45;
    public static final int ORDER3_AMOUNT = 21;

    @Test public void
    test() {
        OwingPrinter owingPrinterSpy = spy(new OwingPrinter(A_NAME));

        owingPrinterSpy.printOwing(orders());

        InOrder inOrder = inOrder(owingPrinterSpy);
        inOrder.verify(owingPrinterSpy).printLine("**************************");
        inOrder.verify(owingPrinterSpy).printLine("***** Customer Owes ******");
        inOrder.verify(owingPrinterSpy).printLine("**************************");
        double totalAmount = ORDER1_AMOUNT + ORDER2_AMOUNT + ORDER3_AMOUNT;
        inOrder.verify(owingPrinterSpy).printLine("amount: " + totalAmount);
    }

    private List<Order> orders() {
        List<Order> result = new ArrayList<Order>();
        result.add(new Order(ORDER1_AMOUNT));
        result.add(new Order(ORDER2_AMOUNT));
        result.add(new Order(ORDER3_AMOUNT));
        return  result;
    }
}
