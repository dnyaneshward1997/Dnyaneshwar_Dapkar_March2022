class Two_Stacks{
	
	int [] a1;
	int size;
	int top1;
	int top2;
	
	// now we have to make constructor to assign values...
	
	Two_Stacks(int n){
		
		this.size = size;
		this.a1 = new int[n];
		this.top1 = -1;
		this.top2 = size;	
		
	}
	
	// now inserting elements for stack 1...
	
	void push1(int x){
		
		if(top1<top2-1){
			
			top1++;
			a1[top1] = x;
			
		}else{
			
			System.out.println(" The Stack is Overflow...");
			return;
			
		}
		
	}
	
	
	// now inserting elements for stack 2 ...
	
	void push2(int x){
		
		if(top1<top2-1){
			
			top2--;
			a1[top1] = x;
			
		}else{
			
			System.out.println(" The Stack is Overflow...");
			return;
			
		}
		
	}
	
	
	// now removing elements for stack 1 ...
	void pop1(){
		
		if(top1>=0){
			
			int x = a1[top1];
			top1--;
			return ;
			
			
		}else{
			
			System.out.println(" The Stack is underflow...");
			return;	
			
		}
		
		return;
		
	}

    
	// now removing elements for stack 2 ...
	void pop2(){
		
		if(top2<size){
			
			int x = a1[top2];
			top2++;
			return ;
			
			
		}else{
			
			System.out.println(" The Stack is underflow...");
			return;	
			
		}
		
		return ;
		
	}




  public static void main(String[] args){
	  
	  Two_Stacks s = new Two_Stacks(5);
	  
	    s.push1(5); 
        s.push2(10); 
        s.push2(15); 
        s.push1(11); 
        s.push2(7); 
        s.push2(40);
		
		System.out.println(" Popped element from" + " stack1 is " + s.pop1());
		
		System.out.println(" Popped element from stack2 is " + s.pop2());
		
		
		
		

  
  
  }

}