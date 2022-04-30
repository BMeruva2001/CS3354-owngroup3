public class AddToCart {
    private boolean login;
    private int cart;
    private boolean item;
    private int stock;

    public VendingMachine() {
        login = false;
        item = true;
        cart = 0;
        stock = 99;
    }

    private boolean instock(int amount){
        if (amount<stock){
            return true;
        }
        else{
        return false;
        }
    }

    private boolean loggedin(){
        return login;
    }

    private boolean setLogin(){
        login = true;
        return login;
    }

    private boolean setLogout(){
        login = false;
        return login;
    }

    private boolean itemAvailable(){
        return item;
    }

    public void userLogin(){
        login = setLogin();
    }

    public void userLogout(){
        login = setLogout();
    }

    public void addItem(int numOfItem) {
        if(instock(numOfItem) && itemAvailable() && loggedin()){
        cart += numOfItem;
        stock -= numOfItem;
        System.out.println(numOfItem + " were added to the cart");
        System.out.println(cart+ " items in cart");
        System.out.println(stock + " left in stock");
        }
        else if(!(instock(numOfItem))){
            System.out.println("Item no longer in stock");
        }
        else if(!(loggedin())){
            System.out.println("please login before adding items to your cart");
        }
        else{
            System.out.println("Error");
        }
    }
}
