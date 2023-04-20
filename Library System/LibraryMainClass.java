import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LibraryMainClass {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        Book book1 = new Book();
        book1.setName("After Dark");
        book1.setAuthor("Murakami");
        book1.setCopy(2);

        Book book2 = new Book();
        book2.setName("Meditations");
        book2.setAuthor("Aurelius");
        book2.setCopy(3);

        Book book3 = new Book();
        book3.setName("Tuesdays with Morrie");
        book3.setAuthor("Mitch Albom");
        book3.setCopy(4);
        



        books.add(book1);
        books.add(book2);
        books.add(book3);
        

        boolean end = false;
        while (end == false) {
            try {
                System.out.println("Electronic Book Rental System");
                System.out.println("=============================");
        
                // For array lists, .size rather than .length
                for (int x = 0; x < books.size(); x++) {
                    System.out.print(x);
                    // for array list, array.get(index).getterMethod
                    System.out.print(" " + books.get(x).getName() + ", " +  books.get(x).getAuthor());
                    System.out.println();
        
                }
                System.out.println("=============================");
        
                Scanner scan = new Scanner(System.in);

                System.out.print("Choose a number ");
                int choice = scan.nextInt();

                Book book = books.get(choice);
                int copy = book.getCopy();
                if (copy > 0){
                    System.out.println("You rented: " + books.get(choice).getName());
                    // decrement
                    book.setCopy(copy-=1);
                }
                else{
                    
                    System.out.println("No copies available");
                }


                System.out.println("Rent again? Y/N");
                // no idea why not next line but yes next only
                String again = scan.next();
                if (again.equals("N")) {
                    end = true;
                }
                else if (again.equals("Y")){
                    continue;
                }

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Index does not exist");
            } catch (InputMismatchException e) {
                System.out.println("Invalid Choice");
            }
        }
        System.out.println("Program end");
    }
}
