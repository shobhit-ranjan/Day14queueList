
public class QueueMain {

	public static void main(String[] args) {
		System.out.println("Welcome To queue ");
		Queue<Integer> Queue = new Queue<Integer>();

		Queue.AppendData(56);
		Queue.AppendData(30);
		Queue.AppendData(70);
		Queue.showData();

	}

}
