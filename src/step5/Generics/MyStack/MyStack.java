package step5.Generics.MyStack;

import java.util.ArrayList;

public class MyStack <T>{
    private ArrayList a;
    public MyStack(){
        a = new ArrayList();
    }

    public void push(T element){
        a.add(element);
    }
    public T pop(){
        T r = (T) a.getLast();
        a.removeLast();
        return r;

    }
    public T peek(){
        return (T) a.getLast();
    }
    public boolean isEmpty(){
        if(a.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

}
