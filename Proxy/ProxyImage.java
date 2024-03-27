package Proxy;

class ProxyImage implements Image {
    private final String filename;
    private RealImage image;

    /**
     * Constructor
     * @param filename
     */
    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void showData() {
        System.out.println("Filename: " + filename);

    }

    /**
     * Displays the image
     */
    public void displayImage() {
        if (image
        == null) {
            image = new RealImage(filename);
        }
        image.displayImage();
    }
}
// Compare this snippet from Image.java: