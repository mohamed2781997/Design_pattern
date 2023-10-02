package singletonepattern;

public class Counter {

    public int count = 0;
    private static Counter instance = null;
    
    private Counter() {

    }

    public static Counter getinstance() {
        if(instance==null){
        instance=new Counter();
        }
        return instance;
    }

    public void addcount() {
        count++;

    }

}
