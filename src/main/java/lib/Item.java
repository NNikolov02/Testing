package lib;

public abstract class Item {

    String title;
    String creator;
    String status;

    public Item(String title, String creator, String status) {
        this.title = title;
        this.creator = creator;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
