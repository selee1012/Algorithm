import java.util.Scanner;

public class Main{

 //전위순회
	public static void pre(Node tar) {
		System.out.print(tar.getItem());
		if (tar.getLeft() != null)
			pre(tar.getLeft());
		if (tar.getRight() != null)
			pre(tar.getRight());
	}

  //중위순회
	public static void ino(Node tar) {
		if (tar.getLeft() != null)
			ino(tar.getLeft());
		System.out.print(tar.getItem());
		if (tar.getRight() != null)
			ino(tar.getRight());
	}

  //후위순회
	public static void post(Node tar) {
		if (tar.getLeft() != null)
			post(tar.getLeft());
		if (tar.getRight() != null)
			post(tar.getRight());
		System.out.print(tar.getItem());
	}

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	int N = scanner.nextInt();
    	scanner.nextLine();
    	
    	Node[] save = new Node[N];

     //각 노드를 담아 놓음
    	for (int i=0; i<N; i++) {
    		String target = Character.toString((char)('A' + i));
    		save[i] = new Node(target, null, null);
    	}

     //왼쪽, 오른쪽으로 연결
    	for (int j=0; j<N; j++) {
    		String a = scanner.next();
    		String b = scanner.next();
    		String c = scanner.next();
    		Node tag = save[a.charAt(0) - 'A'];
    		if (!b.equals("."))
    			tag.left = save[b.charAt(0) - 'A'];
    		if (!c.equals("."))
        		tag.right = save[c.charAt(0) - 'A'];
    	}
    	
    	pre(save[0]);
    	System.out.println();
    	ino(save[0]);
    	System.out.println();
    	post(save[0]);
    	
    	scanner.close();
    }
}

//노드 구현
class Node {
	String item;
	Node left;
	Node right;
	
	Node(String a, Node b, Node c) {
		item = a;
		left = b;
		right = c;
	}
	
	public String getItem() {return item;}
	public Node getLeft() {return left;} 
	public Node getRight() {return right;}
}
