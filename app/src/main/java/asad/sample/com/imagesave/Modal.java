package asad.sample.com.imagesave;

public class Modal {
    private int id;
    private byte[] image;

    public Modal( byte[] image, int id) {
        this.image = image;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
