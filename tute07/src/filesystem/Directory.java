package filesystem;

import java.util.List;

public class Directory implements File {
    // chilren could be other directories
    // or they could be text files 
    private List<File> children;

    @Override
    public int getSize() {
        int size = 0;
        for (File file : children) {
            size += file.getSize();
        }
        return size;
    }
    @Override
    public String getType() {
        return "Directory";
    }

}
