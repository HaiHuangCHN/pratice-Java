package stream;

import lombok.Data;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StreamTest {


    @Data
    private static class Total {

        /**
         * 总费用
         */
        private BigDecimal totalAmount = new BigDecimal(0);

        /**
         * 币种
         */
        private String currencyCode;

    }

    @Test
    public void test1() {
        StreamTest.Total total1 = new StreamTest.Total();
        total1.setTotalAmount(new BigDecimal("10"));
        StreamTest.Total total2 = new StreamTest.Total();
        total2.setTotalAmount(new BigDecimal("20"));

        List<Total> totalList = new ArrayList<>();
        totalList.add(total1);
        totalList.add(total2);
        BigDecimal total = totalList.stream()
                .map(StreamTest.Total::getTotalAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(total);
    }


}
