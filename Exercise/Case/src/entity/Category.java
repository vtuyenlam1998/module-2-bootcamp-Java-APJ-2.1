package entity;

public class Category {
    private final long id;
    private String name;
    private static long count = 0;

    public Category(String name) {
        this.name=name;
        this.id= ++count;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Category(long id){
        this.id = id;
    };
    @Override
    public String toString() {
        return "Sản phẩm mang ID " + getId() + " có tên là " + getName();
    }

}
