import java.util.Scanner;

class Book {
	

    public static void main(String[] args) {
        run();
    }

	static String[] bookTitle = {"System Analysis and Design", "Android Application", "Programming Conceps and Logic Formulation"};
	static String[] authorName = {"Gary B. Shelly", "Corinne Hoisington", "Rosauro E. Manuel"};

    static int book1Copy = 2;
    static int book2Copy = 3;
    static int book3Copy = 4;


    static void run(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Electronic Book Rental System");
        System.out.println("=========================");
        System.out.println("0 " + bookTitle[0] + ", " + authorName[0]);
        System.out.println("1 " + bookTitle[1] + ", " + authorName[1]);
        System.out.println("2 " + bookTitle[2] + ", " + authorName[2]);
        System.out.println("=========================");
        System.out.print("Choose a number to rent your favorite book:");
        int choice = scan.nextInt();
    
    
try{
    
    if (choice == 0) {
        System.out.println("You rented the book: " + bookTitle[choice] + ", " + authorName[choice]);
        book1Copy-=1;

    }
    else if (choice == 1) {
        System.out.println("You rented the book: " + bookTitle[choice] + ", " + authorName[choice]);
        book2Copy-=1;
    }
    else if (choice == 2){
        System.out.println("You rented the book: " + bookTitle[choice] + ", " + authorName[choice]);
        book3Copy-=1;
    }
    else {
        System.out.println("Index does not exist");
    }

}
catch(Exception e){
    System.out.println("Error has occured");
}
    
}
}
	



