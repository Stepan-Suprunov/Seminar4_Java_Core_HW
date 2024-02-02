public class Main {
    public static void main(String[] args) {
        Customer james = new Customer("James", Customer.Gender.MALE);
        Customer effie = new Customer("Effie", Customer.Gender.FEMALE);
        Customer mark = new Customer("Mark", Customer.Gender.MALE);
        Customer claire = new Customer("Claire", Customer.Gender.FEMALE);

        Product pen = new Product(Product.ProductName.PEN, 50.85);
        Product pencil = new Product(Product.ProductName.PENCIL, 12.50);
        Product noteBook = new Product(Product.ProductName.NOTE_BOOK, 205);
        Product paper = new Product(Product.ProductName.PAPER, 215.45);
        Product lastic = new Product(Product.ProductName.LASTIC, 15.05);

        Order.newPurchase("James", "NOTE_BOOK", 3);
        Order.newPurchase("Effie", "PENCIL", 5);
        Order.newPurchase("Claire", "PEN", 1);
        Order.newPurchase("Mark", "LASTIC", 1);
        Order.newPurchase("Mark", "PAPER", 2);

        try {
            Order.newPurchase("Adam", "PAPER", 1);
            Order.newPurchase("Claire", "BEER", 3);
            Order.newPurchase("Effie", "PENCIL", 0);
        } catch (RuntimeException e) {
            System.out.println("При совершении заказа введены неверные данные");
        }

        System.out.println(Customer.customersList);
        System.out.println("----------------------");
        System.out.println(Product.productsLis);
        System.out.println("----------------------");
        System.out.println(Order.ordersList);
        System.out.println("----------------------");
        System.out.println("Итоговое колличество совершённых покупок = " + Order.ordersList.size());
        Utils.writeToFile(Order.ordersList);
    }
}