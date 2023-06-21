package OnlineStore;

import java.util.ArrayList;

public class Store {

    ArrayList<User> users;
    ArrayList<Product> products;

    public Store(){
        users = new ArrayList<>();
        products = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }

    public ArrayList<User> searchByName(String name){
        ArrayList<User> result = new ArrayList<>();
        for(User user:users){
           // if(user.getUsername().equalsIgnoreCase(name)){
                result.add(user);
            }
        //}
        return  result;
    }
    }
