import java.io.File;



public class DirectoryMethod {

    private static DirectoryPath fileDirectory = new DirectoryPath();
    
    public static void PrintFiles() {
    	
    	fileDirectory.fillFiles();

        for (File file : DirectoryMethod.getFileDirectory().getFiles())
        {
            System.out.println(file.getName());
        }
    }
    public static DirectoryPath getFileDirectory() {
        return fileDirectory;
    }

    public static void setFileDirectory(DirectoryPath fileDirectory) {
        DirectoryMethod.fileDirectory = fileDirectory;
    }


}
