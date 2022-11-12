package test;
//import java.util.regex.*;

public class Submission_Atikah {

	public static void main(String[] args) {
		int[] arr = {5, 2, 4, 3, 10, 6};
		soal1(13);
		//soal2("");
		soal3("Sandiwar4");
		soal4(arr);
		soal5(9);
	}
	
	public static void soal1(int N) {
        int x = 1, i = 0;
        while(i < N){
            if(i < N-1) {
                if(x % 3 == 0 && x % 7 == 0){
                    System.out.print("Z, ");
                    i++;
                }
                else if(x % 3 == 0 || x % 7 == 0){
                    System.out.print(x + ", ");
                    i++;
                }
            }
            else {
                if(x % 3 == 0 && x % 7 == 0){
                    System.out.print("Z");
                    i++;
                }
                else if(x % 3 == 0 || x % 7 == 0){
                    System.out.print(x);
                    i++;
                }
            }
            x++;
        }
        System.out.println();
    }
    
    public static void soal2(String input){
        String[] sentences = {"sang gajah", "serigala", "harimau"};
        for(int i = 0; i < input.length(); i++){
            
        }
    }
    
    public static void soal3(String input){
        if(input.length() >=8){
            if(input.length()<=32){
                if(input.matches("^(\\D*\\w)")){// \D*\w
                    if(input.matches(".*[0-9]{1,}.*")){
                        if(input.matches(".*[a-z]*[A-Z]{1,}.*")){
                            System.out.println("Kata Sandi Valid");
                        }
                        else
                            System.out.println("Harus memiliki huruf kapital dan huruf kecil");
                    }
                    else
                        System.out.println("Harus memiliki angka");
                }
                else
                    System.out.println("Karakter awal tidak boleh angka");
            }
            else
                System.out.println("Kata sandi maksimal 32 karakter");
        }
        else
            System.out.println("Kata sandi minimal 8 karakter");
    }
    
    public static void soal4(int[] array){
        int tmp = 0;
        int len = array.length;
        // sorting
        for(int i = 0; i < len; i++){
            for(int j = 1; j < (len - i); j++){
                if(array[j-1] > array[j]){
                    tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        // checking
        tmp = array[0];
        for(int i = 0; i < len; i++){
        	if(tmp != array[i]){
        		System.out.println(tmp);
        		break;
        	}
        	tmp++;
        }
    }
    
    public static void soal5(int N){
    	if(N % 2 == 1){
	    	for(int i = N; i > 0; i--){
	    		for(int j = 0; j < N; j++){
	    			if(i == 1 || i == N || j == 0 || j == N-1 || j == i-1){
	    				System.out.print("X");
	    			}
	    			else
	    				System.out.print("O");
	    		}
	    		System.out.println();
	    	}
    	}
    	else
    		System.out.println("Harus bilangan ganjil");
    }

}
