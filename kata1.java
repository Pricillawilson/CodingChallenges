
// A digital root is the recursive sum of all the digits in a number. Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. This is only applicable to the natural numbers.

class Main {
  public static void main(String[] args) {
    int n=55;
    int sum=0;
    int rem=0;
    while(n>0 || sum >9){
      if(n==0)
      {
        n=sum;
        sum=0;

      }
     rem=n%10;
     sum=sum+rem;
     n=n/10;
    }
    System.out.println(sum);
  }
}