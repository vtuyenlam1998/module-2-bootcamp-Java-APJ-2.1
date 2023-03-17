package Service;

import entity.Category;

import java.util.*;

public class CategoryService extends Category {
    private static List <Category> categoryList;
    static {
        categoryList = new ArrayList<>();
        addCategory("Thời trang nam");
        addCategory("Thời trang nữ");
        addCategory("Thời trang trẻ em");

    }
    public CategoryService(){
        super(id);
    }
    public static List<Category> getAllCategory(){
        categoryList.forEach(System.out::println);
        return categoryList;
    }
    public static void addCategory(String name){
        categoryList.add(new Category(name));
    }
    public static void removeCategory(int id) {
        for (Category category : categoryList ) {
            if(category.getId() == id) {
                categoryList.remove(category);
                break;
            }
        }
    }
}
