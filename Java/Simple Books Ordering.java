import java.util.*;
class Books{
	Scanner s = new Scanner(System.in);
	void types(){
		System.out.println("\nBooks Available are:\n1. Comics         - Rs.300\tAuthor - Stan Lee"+
			"\n2. Non-fiction    - Rs.280\tAuthor - Malcolm Gladwell\n3. Fiction        - Rs.270\tAuthor - Jane Austen"+
			"\n4. Graphic Novels - Rs.400\tAuthor - Richard Kyle\n5. Everybody      - Rs.150\tAuthor - Eric Carle\n\n");

	}
	void comics(){
		System.out.println("\nComic Books contains healthy comedy and mostly preferred by students of minor age.");
		System.out.println("Enter number of books you want: ");
		int num = s.nextInt();
		int res = num*300;
		System.out.println("\n\nBook Selected : Comics\nNumber of books : "+num+"\nTotal Cost : "+res+"\n");
	}
	void non_fic(){
		System.out.println("\nBooks that tell are about real things - animals, countries, space,etc.");
		System.out.println("Enter number of books you want: ");
		int num = s.nextInt();
		int res = num*280;
		System.out.println("\n\nBook Selected : Non-fiction\nNumber of books : "+num+"\nTotal Cost : "+res+"\n");
	}
	void fic(){
		System.out.println("\nBooks which are made up by the author");
		System.out.println("Enter number of books you want: ");
		int num = s.nextInt();
		int res = num*270;
		System.out.println("\n\nBook Selected : Fiction\nNumber of books : "+num+"\nTotal Cost : "+res+"\n");
	}
	void graph(){
		System.out.println("\nStories told using text and illustrations in a comic-strip format.");
		System.out.println("Enter number of books you want: ");
		int num = s.nextInt();
		int res = num*400;
		System.out.println("\n\nBook Selected : Graph\nNumber of books : "+num+"\nTotal Cost : "+res+"\n");
	}
	void everybody(){
		System.out.println("\nBooks that everyone can enjoy");
		System.out.println("Enter number of books you want: ");
		int num = s.nextInt();
		int res = num*150;
		System.out.println("\n\nBook Selected : Everybody\nNumber of books : "+num+"\nTotal Cost : "+res+"\n");
	}
}
class Sell extends Books{
	void type(){
		System.out.println("\nEnter the number of books: ");
		int sel_num = s.nextInt();
		System.out.println("Price of each book: ");
		int price = s.nextInt();
		double res = sel_num*price;
		System.out.println("\n-------------------------------\nTotal Books : "+sel_num+"\nPrice of single book : "+price
			+"\nTotal cost of books : "+res+"\n-------------------------------");
	}
}

class External_1{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Sell obj = new Sell();
		System.out.println("----------Book Sales System----------\n");
		System.out.println("\n1. Books purchase\n2. Books selling\nSelect your choice: ");
		int choice = sc.nextInt();
		if(choice == 1)
		{
		obj.types();
		System.out.println("Enter Your Choice: ");
		int ch = sc.nextInt();
		switch(ch){
			case 1: obj.comics();break;
			case 2: obj.non_fic();break;
			case 3: obj.fic();break;
			case 4: obj.graph();break;
			case 5: obj.everybody();break;
			default: System.out.println("Choose the correct choice...!");
		}
		}
		else if (choice == 2){
			obj.type();
		}
		else{
			System.out.println("Choice entered is wrong, Please check once...!");
		}
	}
}