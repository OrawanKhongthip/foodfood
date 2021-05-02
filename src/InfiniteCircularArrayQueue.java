
public class InfiniteCircularArrayQueue {
	// ----------------- data --------------
	private final int CAPACITY = 10;
	private Order[] data; // array to store queue data
	private int front = 0; // pointer for first queue element
	private int size = 0; // size of queue (no. of elements)

	// ----------------- method --------------
	public InfiniteCircularArrayQueue() {
		data = new Order[CAPACITY];
	}

	public InfiniteCircularArrayQueue(int capacity) {
		data = new Order[capacity];
	}

	public void enqueue(Order element) {
		
		int total_elem = this.size;
		if (total_elem >= data.length) {
			resize(2);
		}
		int rear_idx = (this.front + this.size) % this.data.length;
		//System.out.println("Rear: " + rear_idx);
		data[rear_idx] = element;
		size++;

	}

	public Order dequeue() {
		Order dq_elem = data[this.front];
		this.data[this.front] = null;
		int new_front = (this.front + 1) % this.data.length;
		this.front = new_front;
		this.size--;
		return dq_elem;
	}

	public Order peek() {
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
		Order newData[] = new Order[this.data.length * multiplier];
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
			System.out.print(" ===== Queues ===== ");
			
			int curr_idx = this.front;
			int total_elem = this.size;
			for (int i = 1; i <= total_elem; i++) {
				System.out.println("Queue Number: " + i);
				for (int j = 0; j < this.data[curr_idx].getFoodArrayList().size(); j++) {
					System.out.println("Order Name: " + this.data[curr_idx].getOrderName());
					System.out.println("Food Name: " + this.data[curr_idx].getFoodArrayList().get(j).getName());
					System.out.println("Food Price: " + this.data[curr_idx].getFoodArrayList().get(j).getPrice());
					System.out.println("=========================");
				}
				
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

}
