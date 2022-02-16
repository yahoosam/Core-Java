package com.project.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, OrderDetails> ordermap = new HashMap<>();

        ordermap.put(101, new OrderDetails(101, 2413, "John", "TV Order", 2500.23f));
        ordermap.put(18, new OrderDetails(18, 1658, "Sam", "Table Order", 50.28f));
        ordermap.put(159, new OrderDetails(159, 1211, "Kyle", "Oven Order", 100.00f));
        ordermap.put(272, new OrderDetails(272, 2433, "Brandon", "Furniture Order", 870.87f));
        ordermap.put(362, new OrderDetails(362, 1211, "Kyle", "Vessels Order", 1247.58f));
        ordermap.put(652, new OrderDetails(652, 3003, "Rajath", "Clock Order", 560.10f));

        ordermap.put(410, new OrderDetails(410, 2413, "Raj", "TV Order", 1100.38f));
        ordermap.put(428, new OrderDetails(428, 1658, "Kumar", "Table Order", 8300.21f));
        ordermap.put(498, new OrderDetails(498, 1211, "Nurfield", "Oven Order", 2020.98f));
        ordermap.put(444, new OrderDetails(444, 2433, "Ranjith", "Furniture Order", 500.43f));
        ordermap.put(421, new OrderDetails(421, 3003, "Brem", "Clock Order", 200.76f));
        ordermap.put(1219, new OrderDetails(1219, 1211, "Kyle", "Mixer Order", 230.90f));

        // print the order list
        for (Integer orderNumber : ordermap.keySet()) {
            System.out.println(ordermap.get(orderNumber));
        }

        System.out.println("------------------filtered customer orders-----------------");
        // use case - get the orders from store# 1211, customer# Kyle
        List<OrderDetails> filteredcustorders = ordermap.entrySet().stream()
                .filter(mapstorefilter -> mapstorefilter.getValue().getStoreNumber() == 1211)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))
                .entrySet().stream().filter(mapcustfilter -> mapcustfilter.getValue().getCustomerName().equals("Kyle"))
                .map(Map.Entry::getValue).collect(Collectors.toList());

        for (OrderDetails orderDetails : filteredcustorders) {
            System.out.println(orderDetails);
        }

        System.out.println("------------------filtered to map-----------------");
        // use case - get the order numbers between 400 to 450 in map
        Map<Integer, OrderDetails> filteredordersmap = ordermap.entrySet().stream()
                .filter(ordermapfiltered -> (ordermapfiltered.getKey().intValue() >= 400
                        && ordermapfiltered.getKey().intValue() <= 450))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        for (Integer orderNumber : filteredordersmap.keySet()) {
            System.out.println(filteredordersmap.get(orderNumber));
        }

        System.out.println("------------------filtered to list-----------------");
        // use case - get the order numbers between 400 to 450 in list
        List<OrderDetails> filteredorderlist = ordermap.entrySet().stream()
                .filter(ordermapfiltered -> (ordermapfiltered.getKey().intValue() >= 400
                        && ordermapfiltered.getKey().intValue() <= 450))
                .map(Map.Entry::getValue).collect(Collectors.toList());

        for (OrderDetails orderDetails : filteredorderlist) {
            System.out.println(orderDetails);
        }

        System.out.println("------------------print filtered list directly-----------------");
        // use case - get the order numbers between 400 to 450 in list
        ordermap.entrySet().stream()
                .filter(ordermapfiltered -> (ordermapfiltered.getKey().intValue() >= 400
                        && ordermapfiltered.getKey().intValue() <= 450))
                .map(Map.Entry::getValue).collect(Collectors.toList()).forEach(order -> System.out.println(order));
    }

}
