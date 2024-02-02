package exceptions;






public class a {
    public static void main(String[] args) {
        int i = 2;
        int j= 0;
        int arr[] = new int [4];
        try {
            int x  = i/j;
        }  catch( ArithmeticException e)
        {
            System.out.println("all  arithmatic exceptions are handle here ");
        }
        catch (Exception e) {
            System.out.println("all kinds of exceptions come here only .");
         }

    }
}





/*
 
errors vs excetiopns 

errors : which something you can't handle  it will completly stop the exection
exmample : thread error , i/o error , virtualmemoryerror (out of memroy)



exception : which can handle 
two types : unchecked : runtime exception 

checked exception :   sqlexcetpion , io exception  {which needs to be handeled you have to}





 */