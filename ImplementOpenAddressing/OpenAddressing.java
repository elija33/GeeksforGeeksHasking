package ImplementOpenAddressing;

public class OpenAddressing {
    int number[];
    int cap;
    int size;

   public OpenAddressing(int c){
    cap = c;
    size = 0;
    number = new int[cap];

    for(int i = 0; i < cap; i++){
        number[i] = -1;
    }
   }

   public int hash(int key){
    return key % cap;
   }

   public boolean insert(int key){
    if(size == cap){
        return false;
    }
    int i = hash(key);
    while(number[i] != -1 && number[i] != -2 && number[i] != key){
        i = (i + 1) % cap;
        if(number[i] == key){
            return false;
        }
        else{
            number[i] = key;
            size++;
            
        }
    }
    return true;
   }

   public boolean search(int key){
    int h = hash(key);
    int i = h;
    while(number[i] != -1){
        if(number[i] == key){
            return true;
        }
        i = (i + 1) % cap;
        if(i == h){
            return false;
        }
    }
    return false;
   }

   public boolean erase(int key){
    int h = hash(key);
    int i = h;
    while(number[i] != -1){
        if(number[i] == key){
            number[i] = -2;
            return true;
        }
        i = (i + 1) % cap;
        if(i == h){
            return false;
        }
    }
    return false;
   }

   public static void main(String[] args) {
    OpenAddressing open = new OpenAddressing(7);
    open.insert(20);
    open.insert(22);
    open.insert(25);
    open.insert(30);
    open.insert(35);
    if(open.search(5) == true){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
        open.erase(20);
    }
    if(open.search(30) == true){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
   }
}
