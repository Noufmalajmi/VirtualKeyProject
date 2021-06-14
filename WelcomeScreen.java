

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class WelcomeScreen implements HomeScreen {

    private String welcomeText = "Welcome to LockedMe!";
    private String developerText = "Developer: Nouf Alajmi";
    private String developerEmail = "Developer E-mail: noufajmi98@gmail.com";
    private ArrayList<String> options = new ArrayList<>();

    
    public WelcomeScreen() {
        System.out.println(welcomeText);
        System.out.println(developerText);
        System.out.println(developerEmail);
        options.add("Please press the following to track your files: ");
        options.add("1. Show Files");
        options.add("2. Show File Options Menu");
        options.add("3. Quit");

    }
    
    @Override
    public void Show() {
    	System.out.println("Main Menu");
        for (String s : options)  {
            System.out.println(s);
        }

    }

    @Override
    public void GetUserInput() {
        int selectedOption  = 0;
        while ((selectedOption = this.getOption()) != 3) {
            this.NavigateOption(selectedOption);
        }
    }

    @Override
    public void NavigateOption(int option) {
        switch(option) {

            case 1: 
                this.ShowFiles();
                
                this.Show();
                
                break;
                
            case 2: 
            	ScreenMethod .setCurrentScreen(ScreenMethod.FileOptions);
                ScreenMethod .getCurrentScreen().Show();
                ScreenMethod .getCurrentScreen().GetUserInput();
                
                this.Show();
                
                break;
                
            default:
                System.out.println("Invalid Option");
                break;
        }
        
    }

    public void ShowFiles() {
        
        System.out.println("List of Files: ");
    	DirectoryMethod.PrintFiles();

    }
    
    private int getOption() {
        Scanner in = new Scanner(System.in);

        int returnOption = 0;
        try {
            returnOption = in.nextInt();
        }
        catch (InputMismatchException ex) {

        }
        return returnOption;

    }

    
}



