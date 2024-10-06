package _07_oopdemo;

class ShoppingCart {

    private CartItem[] items;
    private int itemCount;

    public ShoppingCart() {
        items = new CartItem[5];
        itemCount = 0;
    }
    
    // Add product to cart
    public void addProductToCart(Product product, int quantity) {
        if (itemCount < items.length) {
            CartItem newItem = new CartItem(product, quantity);
            items[itemCount] = newItem;
            itemCount++;
            product.reduceStock(quantity);
        } else {
            throw new IllegalArgumentException("Cart full!"); 
        }
    }

    public CartItem[] getItems() {
        CartItem[] currentItems = new CartItem[itemCount]; 
        for (int i = 0; i < itemCount; i++) {
            currentItems[i] = items[i]; 
        }
        return currentItems;
    }

    
    public CartItem[] showProductInCart() {
        return getItems(); // Returns current items
    }
}
