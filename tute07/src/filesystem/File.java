package filesystem;

public interface File {
    // have the operations we want to 
    // support as an interface 
    // so there is no discrimination between 
    // leaf and composite nodes

    public int getSize();
    public String getType();
} 