
public class QueueImplementation {
	static int front=0;
	static int rear = -1;
	
	public static void main(String[] args) {
		int queueArr[] = new int[10];
		enqueue(queueArr,5);
		enqueue(queueArr,2);
		enqueue(queueArr,10);
		enqueue(queueArr,7);
		enqueue(queueArr,1);
		dequeue(queueArr);
		dequeue(queueArr);
		dequeue(queueArr);
		dequeue(queueArr);
		dequeue(queueArr);
		dequeue(queueArr);
		enqueue(queueArr,20);

	}

	private static void dequeue(int [] queueArr) {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}else {
			int num=queueArr[front];
			front+=1;
			System.out.println("Element removed :"+num);
		}
		
	}

	private static boolean isEmpty() {
		if(front==rear) 
			return true;
		else
			return false;
	}

	private static void enqueue(int[] queueArr, int num) {
		if(isFull(queueArr)) {
			System.out.println("Queue is full");
		}else {
			rear+=1;
			queueArr[rear]=num;
			System.out.println("Element inserted :" + num);
		}	
	}

	private static boolean isFull(int [] queueArr) {
		if(queueArr.length-1 == rear)
			return true;
		else
		return false;
	}

}
