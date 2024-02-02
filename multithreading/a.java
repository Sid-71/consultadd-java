package multithreading;



class AA  extends Thread{
    public void  run(){
    
     for(int i=0; i<100; i++)
     {
        System.out.println("Naruto");
     }
    }
};

class BV extends Thread{
 public void  run(){
    for(int i=0; i<100; i++)
    {
       System.out.println("Itachi");
    }
    }
};
   

public class a {

    static{
        System.out.println("sdf");
    }
    public static void main(String[] args) {
        AA ob1 = new AA();
        BV ob2 = new BV();
        ob1.start();
        ob2.start();
      
    }
}
