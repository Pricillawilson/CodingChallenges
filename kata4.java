//Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.

//Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case


class Main {
  public static void main(String[] args) {
    int n=8;
    int i=0,c=0;
    int[] bin=new int[1000];
    while(n>0)
    {
      bin[i]=n%2;
      n=n/2;
      i++;
    }
    for(int j=i-1;j>=0;j--)
    {
    //if((char)bin[j]=='1')
    //{
      //c+=1;
    c+=bin[j];
    //}
    System.out.println(bin[j]);
    }
    System.out.println(c);
  }
}