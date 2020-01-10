/*iven a list lst and a number N, create a new list that contains each number of lst at most N times without reordering. For example if N = 2, and the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2 being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].
Example

EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]*/
import java.util.ArrayList;
import java.util.List;
class Main {
  public static void main(String[] args) {
    int n=2;
    List<Integer> list= new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(1);
    list.add(2);
    //list.add(3);
    list.add(1);
    list.add(2);
    list.add(3);
    System.out.println(list);
    int count=1;
    for(int i=0;i<list.size();i++){
      for(int j=i+1;j<list.size();j++){
        if(list.get(i)==list.get(j)){
          count+=1;
          if(count>n){
            list.remove(j);
          }
        }
      }
    count=1;
    }
    System.out.println(list);
    
  }
}