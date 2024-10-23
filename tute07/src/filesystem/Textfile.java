package filesystem;

public class Textfile implements File {
    // the text file are our "leaf" nodes because 
    // they aren't composed of any files, they're standalone
    private int size; 

    public Textfile(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getType() {
        return "Textfile";        
    }
    
}
