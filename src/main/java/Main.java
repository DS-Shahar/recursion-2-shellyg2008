import java.util.Random;

public class ric {

	public static void main(String[] args) {
		int [] arr= {1,3,4,5};
		int sum=sum(arr,2);
		System.out.println("the sum is "+sum);
		int [] arr2= {1,3,4,5,6,7};
		int found_idx=found(arr2,5,0);
		System.out.println("found in " + found_idx+" index");
		int [] arr3= {8,12,4,8,6,10};
		boolean order=order(arr3,0);
		System.out.println(order);
		boolean flag=rish(arr3,0,2);
		System.out.println(flag);
		int [] [] m_arr= {{3,2,4,5},{4,7,8,9},{3,4,6,8},{4,6,79,5}};
		int times=lines(m_arr,4,3,0);
		System.out.println(times);
		boolean f=palindrom1(arr3);
		System.out.println(f);
	}
	public static int sum(int [] arr,int i) {
		 if(i==0) {
			return 0;
		}
		else {
			return arr[i-1]+sum(arr,i-1);
		}
	}
	
	
	public static int positive(int [] arr,int i,int count) {
		if(i<arr.length) {
			if(arr[i]>0) {
				count++;
			}
			return positive(arr,i+1,count);
		}
		return count;
		
	}

	
	public static int found(int [] arr2,int num,int idx) {
		if(idx<arr2.length) {
		if(arr2[idx]==num) {
			return idx;
		}
		return found(arr2,num,idx+1);
		
	}

	return -1;
	}

public static boolean order (int [] arr3,int j) {
	if(j+1<arr3.length) {
	if(arr3[j]<arr3[j+1]) {
		return order(arr3,j+1);
	}
	return false;
	
}
	return true;
	
}

//שאלה 7+8 שניתן להעזר בהן:
public static boolean multy(int x,int y) {
	 if (x == 0) {
           return false;
       }

       if (x == y) {
           return true;
           
       }
       else if (x < y) {
           return false;
       } 
       else {
           return multy(x - y, y);
       }
   }



public static boolean first(int number,int count) {
   if (number == 0 || number == 1) {
       return false;
   }
   if (count > number -1) {
       return true;
   }

   boolean flag = multy(number, count);
   if (flag==true) {
       return false;  
   }
   return first(number, count + 1);
}

// השאלה
public static boolean rish(int [] arr3,int index,int start) {
    if (index >= arr3.length) {
    	return false;
    }
boolean first=first(arr3[index],start);
if(first==true) {
	return true;
}
return rish(arr3,index+1,start);
}


public static int lines(int[][] matrix, int num, int row, int col) {
    if (row < 0) {
        return 0;
    }

    if (matrix[row][col] == num) {
        return 1 + lines(matrix, num, row - 1, 0);
    }

    if (col == matrix[row].length - 1) {
        return lines(matrix, num, row - 1, 0);
    }

    return lines(matrix, num, row, col + 1);
}



public static boolean isPalindrome(int[] arr, int start, int end) {
    if (start >= end) {
        return true;
    }

    if (arr[start] != arr[end]) {
        return false;
    }

    return isPalindrome(arr, start + 1, end - 1);
}

public static boolean palindrom1(int[] arr) {
    Random random = new Random();
    int index1 = random.nextInt(arr.length);
    int index2 = random.nextInt(arr.length);
    int start = Math.min(index1, index2);
    int end = Math.max(index1, index2);
    System.out.println(start);
    System.out.println(end);
    for(int i=start;i<end;i++) {
    	System.out.print(arr[i]);
    }

    return isPalindrome(arr, start, end);
}
}







	
	

