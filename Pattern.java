
public class Pattern {

	public static void main(String[] args) {
		                                //DIAMOND STAR PATTERN
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i < 5; i++) {
			for (int j = 0; j <= i ; j++) {
				System.out.print(" ");
			}
			for (int j = 5-i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		                                //SQUARE OF STARS
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
									//PINTING NUMBERS changes row wise
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("4.-------------------------");
  
		int rows = 10;   // total rows (A to J)
        int cols = 10;   // total columns

        for (int i = 0; i < rows; i++) {
            char ch =  (char) ('A' + i);      // ASCII value of A + row number
            for (int j = 0; j < cols; j++) {
                System.out.print(ch + " ");
            }
            System.out.println(); // new line after each row
        }
		
		
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < cols; j++) {
            	char ch =  (char) ('A' + j); // ASCII value of A + column number
                System.out.print(ch + " ");
            }
            System.out.println(); // new line after each row
        }  
	
		 char ch = 'A'; // The character whose ASCII value you want to find

	        // Method 1: Implicit conversion (assigning char to int)
	        int asciiValue1 = ch; 
	        System.out.println("The ASCII value of '" + ch + "' (Method 1) is: " + asciiValue1);

	        // Method 2: Explicit casting
	        int asciiValue2 = (int) ch; 
	        System.out.println("The ASCII value of '" + ch + "' (Method 2) is: " + asciiValue2);
	   
	
	        System.out.println("------------------------------------------------");
	        char c = '@'; // ASCII value of 'A' is 65
	        int i1 = 10;

	        int sum = c + i1; // 'A' (65) + 10 = 75
	        
	        System.out.println("The character is: " + c);
	        System.out.println("The integer is: " + i1);
	        System.out.println("The sum is: " + sum); // Output: The sum is: 75
	       
	   System.out.println("-------------------------");
	   for (int i = 10; i > 0; i--) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	   
		for (int i = 0; i < 10 ; i++) {
			for (int j = 10; j > 0; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		} 
		System.out.println("-----------------------");
			//int rows = 10;   // total rows (A to J)
	        //int cols = 10;   // total columns

	        for (int i = rows-1; i >=0; i--) {
	            char a =  (char) ('A' + i); // ASCII value of A + row number
	            for (int j = 0; j < cols; j++) {
	                System.out.print(a + " ");
	            }
	            System.out.println(); // new line after each row
	        } 
	        System.out.println("\n");
	        
	        for (int i = 0; i < rows; i++) {
	            for (int j =cols-1; j >= 0; j--) {
	            	char b =  (char) ('A' + j); // ASCII value of A + row number
	                System.out.print(b + " ");
	            }
	            System.out.println(); // new line after each row
	        } 
		
	/*	int n=6;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		} */
		
	/*	int n=10;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		} */
		
	/*	int n = 8;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}  */
		
		int n = 10;
		for(int i = 0; i < n; i++) {
			char ca = (char) ('A'+i);
			for(int j = 0; j <= i; j++) {
				System.out.print(ca +" ");
			}
			System.out.println();
		}
		
		System.out.println("\n-------------------");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				char cr = (char) ('A'+j);
				System.out.print(cr+" ");
			}
			System.out.println();
		}  
		
		
		for(int i = 0; i < n; i++) {
			for (int j = n-i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("15------------"); 
		
	
		for(int i = 1; i <= n; i++) {
			for (int j = n-i; j >= 0; j--) {
				System.out.print(i +" ");
			}
			System.out.println();
		}
		System.out.println("16--------------");
		
	
		for(int i = n; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("17----------------");
		
		//int rows = 10;   // total rows (A to J)
        //int cols = 10;   // total columns

        for (int i = 0; i < rows; i++) {
            char ci =  (char) ('A' + i); // ASCII value of A + row number
            for (int j = 0; j < cols-i; j++) {
                System.out.print(ci + " ");
            }
            System.out.println(); // new line after each row
        } 
        System.out.println("18---------------------");
		
		//int rows = 10;   // total rows (A to J)
        //int cols = 10;   // total columns
        
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < cols-i; j++) {
            	char cp =  (char) ('A' + j);
                System.out.print(cp + " ");
         }
            System.out.println(); // new line after each row
        } 
        System.out.println("19--------\n-----------");
		
		
		for(int i = n; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(int i = 1; i <= n; i++) {
			for(int j = n; j >= i; j--) {
				System.out.print(j+" ");
			}
		System.out.println();
		}
		
		System.out.println("20---\n------------------");
	
		for (int i = n-1; i >= 0 ; i--) {
			char cp = (char) ('A'+i);
			for(int j = 0; j <= i; j++) {
				System.out.print(cp+" ");
			}
			System.out.println();
		} 
		
	
		for (int i = 0; i < n; i++) {
			
			for(int j = n-1; j >= i; j--) {
				char d = (char) ('A'+j);
				System.out.print(d +" ");
			}
			System.out.println();
		}
		System.out.println("23--------------------\n");
		
	/*	int n = 7;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	*/ System.out.println("24-----------");
		
		
		for(int i = 1; i <= n; i++) {
			for(int k = 1; k <= n-i; k++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("25---------------------");
		
	/*	int n=8;
		for(int i = 1; i <= n; i++) {
			for(int k = 1; k <= n-i; k++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println("\n");
		} 
	26*/
		/*
		int n=10;
		for(int i = 1; i <= n; i++) {
			for(int k = 1; k <= n-i; k++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	27*/
		
	/*	int n=8;
		for(int i = 0; i < n; i++) {
			char ch = (char) ('A'+i);
			for(int k = 0; k < n-i; k++) {
				System.out.print("  ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	28*/
	/*	int n=10;
		for(int i = 0; i < n; i++) {
			for(int k = 0; k < n-i; k++) {
				System.out.print("  ");
			}
			for(int j = 0; j <= i; j++) {
				char ch = (char) ('A'+j);
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	29*/
	/*	int n=5;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i * 2; j++) {
				System.out.print(" ");
			}
			for(int j = i; j < n ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		for(int i = n; i > 0; i--) {
			for (int j = 0; j < n-i ; j++) {
				System.out.print("--");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		

		for(int i = n; i > 0; i--) {
			for (int j = 0; j < n-i ; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------");

		for(int i = n-1; i >= 0; i--) {
			char ch = (char) ('A'+ i);
			for (int j = 0; j < n-i-1 ; j++) {
				System.out.print("--");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		
		for(int i = n-1; i >= 0; i--) {
			
			for (int j = 0; j < n-i-1 ; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				char ch = (char) ('A'+ j);
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		System.out.println("35-------------------------");
	

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("  "); 
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for (int i = 0; i < n; i++) {
        	char ch = (char) ('A'+ i );
			for (int j = 1; j < n-i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= (2 * i +1 - 1) ; j++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
       
        for (int i = 0; i < n; i++) {
        	char ch = (char) ('A'+ 2*i );
			for (int j = 1; j < n-i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= (2 * i +1 - 1) ; j++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
        System.out.println("-------------------------------");
        
        for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= (2 * i  - 1) ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
        
        
        for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print("  ");
			}
			for (int j = (2 * i  - 1); j > 0 ; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
        System.out.println("\n 40--------------------------");
        
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < (2 * i + 1); j++) {
				char ch = (char) ('A'+ j);
				System.out.print(ch+" ");
			}
			System.out.println();
		}
       
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print("  ");
			}
			for (int j = (2 * i ); j >= 0  ; j--) {
				char ch = (char) ('A'+ j);
				System.out.print(ch+" ");
			}
			System.out.println();
		}
        
        System.out.println("\n 42-------------------");
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < n-i; j++) {
				System.out.print("  ");
			}
        	for (int j = i; j > 0 ; j--) {
        		System.out.print(j+" ");
			}
			
			 for (int j = 0; j <= i; j++) {
				 System.out.print(j+" "); 
			}
			 
			System.out.println();
		}
    System.out.println("----------------");
    	
	    for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print("  ");
			}
			for (int j = i; j > 0; j--) {
				char ch = (char) ('A'+ j);
				System.out.print(ch+" ");
			}
			for (int j = 0; j <= i; j++) {
				char ch = (char) ('A'+j);
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	    
	    for (int i = 1; i <= n; i++) {
        	for (int j = 1; j <= n-i; j++) {
				System.out.print("  ");
			}
        	for (int j = 1; j < i ; j++) {
        		System.out.print(j+" ");
			}
			for (int j = i; j >= 1 ; j--) {
				System.out.print(j+" ");
			}
			 
			System.out.println();
		}
	    
	    for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				char ch = (char) ('A'+j);
				System.out.print(ch+" ");
			}
			for (int j = 0; j < i; j++) {
				
					char ch = (char) ('A'+j);
					System.out.print(ch+" ");
			}
			System.out.println();
		}
	    */
		
	    for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print("  ");
			}
			for (int j = n; j >= (n + 1 - i); j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	    System.out.println("-------------------");
	    
	    for (int i = 1; i <= 5; i++) {
			for (int j = 2; j <= i ; j++) {
				System.out.print("--");
			}
			for (int j = 5; j >= i; j--) {
				System.out.print("* ");
			}
			for (int j = 5; j >= (i + 1); j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	    System.out.println("--------------------");
	    for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	    
	    for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= (5 - i); j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print((i * 2 - 1)+" ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print((i * 2 - 1)+" ");
			}
			System.out.println();
		}
	   
	    System.out.println("--------------------------");
	    
	    for (int i = 7; i >= 1; i--) {
			for (int j = 1; j <= (7 - i); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			i -= 1;
			System.out.println();
		}
	    
	    System.out.println("-------------------------------");
	    
	    for (int i = 1; i <= 8; i++) {
	    	System.out.print("            ");
			for (int j = 1; j <= 8 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i ; j++) {
					System.out.print("* ");
			}
			System.out.println();
		}
	    for (int i = 3; i <= 10 ; i++) {
	    	System.out.print("          ");
	    	for (int j = 1; j <= 10 - i; j++) {
	    		if(i >= 3)
	    			System.out.print(" ");
			}
	    	for (int j = 1; j <= i ; j++) {
	    		if(i >= 3)
	    			System.out.print("* ");
			}
	    	System.out.println();
		}
	    for (int i = 5; i <= 12 ; i++) {
	    	System.out.print("        ");
	    	for (int j = 1; j <= 12 - i; j++) {
	    		if(i >= 5)
	    			System.out.print(" ");
			}
	    	for (int j = 1; j <= i ; j++) {
	    		if(i >= 5)
	    			System.out.print("* ");
			}
	    	System.out.println();
		}
	    for (int i = 7; i <= 14 ; i++) {
	    	System.out.print("      ");
	    	for (int j = 1; j <= 14 - i; j++) {
	    		if(i >= 7)
	    			System.out.print(" ");
			}
	    	for (int j = 1; j <= i ; j++) {
	    		if(i >= 7)
	    			System.out.print("* ");
			}
	    	System.out.println();
		}
	    
	    for (int i = 1; i <= 8; i++) {
	    	System.out.print("                 ");
	    	
			for (int j = 1; j <= 3 ; j++) {
					System.out.print("* ");
			}
			System.out.println();
		}
	    
	    System.out.println("--------Hallow Triangle-------");
	    for (int i = 1; i <= 5; i++)
	    {
	    	for (int j = 1; j <= i; j++) {
				if(j == 1 || i == 5 || j == i)
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
