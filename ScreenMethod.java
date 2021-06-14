





public class ScreenMethod {
	
    public static WelcomeScreen WelcomeScreen = new WelcomeScreen();
    public static FileOptions FileOptions = new FileOptions();
    
    

    public static HomeScreen CurrentScreen = WelcomeScreen;

    
    public static HomeScreen getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(HomeScreen currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}




