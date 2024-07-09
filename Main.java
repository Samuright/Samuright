import DataTransferObject.Books;
import dao.BookManagement;
import dao.PublisherManagement;
import utils.Input;
import utils.Menu;

public class Main {
    public static void main(String[] args) {
        // S.O.L.I.D
        // Single Responsibility Principle
        float choice;
        boolean isContinue = false;

        PublisherManagement.readFromFile();
        BookManagement.readFromFile();

        do {
            Menu.printMenu();
            choice = Input.inputUserChoice();
            if (choice == 1.1f) {
                PublisherManagement.createNewPublisher();
                isContinue = Input.inputContinue();//Bạn có muốn tiếp tục không
              } else if (choice == 1.2f) {
                PublisherManagement.deletePublisher();
                isContinue = Input.inputContinue();
              } else if (choice == 1.3f) {
                PublisherManagement.saveToFile();
                isContinue = Input.inputContinue();
              } else if (choice == 1.4f) {
                    PublisherManagement.printAll();
                    isContinue = Input.inputContinue();



              } else if ( choice == 2.1f) {
                BookManagement.createNewBook();
                isContinue = Input.inputContinue();
              } else if ( choice ==2.2f){
                BookManagement.searchBook();
              } else if ( choice ==2.3f){
                BookManagement.updateBook();
              } else if (choice ==2.4) {
                BookManagement.deleteBook();
              } else if( choice ==2.5f){
                BookManagement.saveToFile();
              } else if (choice ==2.6) {
                BookManagement.printAll();


            }


        } while (isContinue) ;
    }
}

