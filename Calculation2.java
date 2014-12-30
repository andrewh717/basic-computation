public class Calculation2
{
    public static void main(String[] args) 
    {
        int n1, n2, n3, n4;
        n1 = 89;
        n2 = 5;
        n3 = 5;
        n4 = 5;
        
        
        int result = n1%(n2+n3)%n4;
        System.out.println(result);      
    }
}
