package yy.image;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    public void display() {
        System.out.println("Displaying Real Image");
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
