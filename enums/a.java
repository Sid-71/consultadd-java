package enums;



public class a {
    enum Uchiha{
        Madara,Itachi,Obito,Sasuke;
    }
    // Uchiha is a class ,
    // madara , itachi and others are its objects..

    // why didn't it run when it was outside of it 

    enum laptop{
        mac(2000) ,samsum(1000);
        private int price;
        laptop(int price)
        {
            this.price = price;
        }
        public int getPrice() {
            return price;
        }

    }

  



    public static void main(String[] args) {
    
      
        System.err.println(1213);
    Uchiha power = Uchiha.Madara;
    System.err.println(power.ordinal());


    Uchiha []sharingan = power.values();
    //.values() will always give the array 
    for(Uchiha x : sharingan)
    {
      System.err.println(x+" "+x.ordinal());
    }

    



     // customised enums , where we set the values 

    laptop s = laptop.mac;
    for(laptop x : s.values())
    {
        System.out.println(x.ordinal() + " " + x);
    }

}
}