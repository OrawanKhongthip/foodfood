
public class InfiniteCircularArrayQueue {
	// ----------------- data --------------
	private final int CAPACITY = 10;
	private int[] data; // array to store queue data
	private int front = 0; // pointer for first queue element
	private int size = 0; // size of queue (no. of elements)

	// ----------------- method --------------
	public InfiniteCircularArrayQueue() {
		data = new int[CAPACITY];
	}

	public InfiniteCircularArrayQueue(int capacity) {
		data = new int[capacity];
	}

	public void enqueue(int element) {
		
		int total_elem = this.size;
		
		if (total_elem >= data.length) {
			resize(2);
		}
		int rear_idx = (this.front + this.size) % this.data.length;
		//System.out.println("Rear: " + rear_idx);
		data[rear_idx] = element;
		size++;

	}

	public int dequeue() {
		int dq_elem = data[this.front];
		this.data[this.front] = 0;
		int new_front = (this.front + 1) % this.data.length;
		this.front = new_front;
		this.size--;
		return dq_elem;
	}

	public int peek() {

		return this.data[this.front];
	}

	// get current size (no. of elements)
	public int getSize() {
		return this.size;
	}

	// is queue empty?
	public boolean isEmpty() {
		if (this.size == 0) {
			return true;
		} else {
			return false;
		}

	}

	private void resize(int multiplier) {
		int newData[] = new int[this.data.length * multiplier];
		int total_elem = this.size;
		for (int i = 0; i < total_elem; i++) {
			newData[i] = data[(this.front + i) % this.data.length];
		}
		
		this.data = newData;
		this.front = 0;
		
	}

	// print all queue members
	public void printQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			// printArray();
			System.out.print("Queue: ");
			
			int curr_idx = this.front;
			int total_elem = this.size;
			for (int i = 1; i <= total_elem; i++) {
				System.out.print(this.data[curr_idx] + " ");
				curr_idx = (curr_idx + 1) % this.data.length;
			}

			System.out.println("");
		}
	}

	public void printArray() {
		System.out.print("Array: ");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println("");
	}

	public int sum() {
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}

}
