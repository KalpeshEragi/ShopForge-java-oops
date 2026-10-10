class Product{
    private int productId ;
    private String name ;
    private int price ;
    private int stock ;

    Product(int productId, String name, int price, int stock){
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }

        if (stock < 0) {
            throw new IllegalArgumentException("Stock cannot be negative");
        }

        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getproductId(){
        return this.productId;
    }

    public void updatePrice(int price){
        if(price>=0){
            this.price=price;
        }else{
            System.out.println("Invalid Price");
        }
    }

    public void updateStock(int stock) {
        if(stock>=0){
            this.stock=stock;
        }else{
            System.out.println("Invalid stock count");
        }
    }

}


