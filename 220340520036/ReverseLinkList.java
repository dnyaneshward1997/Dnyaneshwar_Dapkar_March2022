import java.util.*;

class ReverseLinkList{
	
	static Node head;
	
	static class Node{
		
		int data;
		Node next;
		
	
	
	  Node(int d){
        
		data = d;
		next = null;
		
	   }
	
	}
	
	void Add_Node(int data){
		
		Node new_node = new Node(data);
		if(head==null){
			
			head = new_node;
			
		}else{
			
			Node n = head;
			while(n.next!=null){
				
				n = n.next;
				
				
			}
			
			n.next = new_node;
		}
	}
	
	Node reverse(Node node){
		
		Node prev = null;
		Node current = node;
		Node next = null;
		
		while(current!=null){
			
			next = current.next;
			current.next= prev;
			prev = current;
			current = next;
			
		}
		
		node = prev;
		return node;
		
		
	}
	
	void display(Node node){
		
		System.out.print(node.data + " ");
		node = node.next;
		
		
	}
	
	
	

  public static void main(String[] args){
	  
	 ReverseLinkList rl = new ReverseLinkList();
	 
	 Scanner sc = new Scanner(System.in);
	 //System.out.println("Enter the numbers...");
	 int tc = sc.nextInt();
	 
	 for(int a=0; a<tc; a++){
		 int n = sc.nextInt();
		 
		 for(int b=0;b<n; b++){
			 
			int x = sc.nextInt();
			rl.Add_Node(x);
			 
		 }
		 
		 head = rl.reverse(head);
		 
		 rl.display(head);
		 
		 
	 }
  
  
  }

}