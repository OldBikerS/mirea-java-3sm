package practice17.task1;

public class CurrentWorkingDirectory{
    String cwd;
    public static void main(String args[]){

        String _cwd=System.getProperty("user.dir");
        System.out.println("Current working directory : "+_cwd + "\\src\\practice17\\task1");

    }
    public CurrentWorkingDirectory(){
        cwd=System.getProperty("user.dir") + "\\src\\practice17\\task1";
    }
    public String getPath(){
        cwd=System.getProperty("user.dir") + "\\src\\practice17\\task1";
        System.out.println("Current working directory : "+cwd);
        return cwd;
    }
    public String getPathFile(String file_name){
        String PathFile = cwd + "\\" + file_name;
        System.out.println("Current working directory : "+PathFile);
        return PathFile;
    }
}