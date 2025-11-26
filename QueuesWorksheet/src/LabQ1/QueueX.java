package LabQ1;

public class QueueX {
	 public int [] queueArr;
	 public int maxSize;
	 public int rear;
	 public int front ;
	 public int noItems;
 public QueueX(int s) {
	 maxSize = s;
	 queueArr= new int [maxSize];
	 rear = -1;
	 front = 0;
	 noItems = 0;
	 
 }
 public void insert(int j) {
	 if(rear==maxSize-1) {
		 System.out.println("Full !");
	 }
	 else 
	 {
		 queueArr[++rear]=j;
		 noItems++;
	 }
 }
 public int remove() {
	 if(noItems==0) {
		 System.out.println("Empty !");
		 return -1;
	 }
	 else 
	 {  
		noItems --;
		return  queueArr[front++];
		 
	 }
 }
 public boolean isEmpty() {
	 return (noItems==0);
 }
 public boolean isFull() {
	 return (rear==maxSize -1 );
 }
}
