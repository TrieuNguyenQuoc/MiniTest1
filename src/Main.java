import java.time.LocalDate;

public class Main {

    public static void main (String[] args) {
        Material material = new Meat("11", "Bò nhật", LocalDate.of(2023, 2, 6), 1500000, 50);
        MaterialManager materialManager = new MaterialManager();
        System.out.println("Danh sách sản phẩm ban đầu");
        materialManager.displayMaterial();
        boolean addResult = materialManager.addMaterial(material);
        if (addResult) {
            System.out.println("Id đã tồn tại !");
        } else {
            System.out.println("Sau khi thêm sản phẩm mới !");
            materialManager.displayMaterial();
        }

        boolean removeResult = materialManager.removeMaterial("5");
        if (removeResult) {
            System.out.println("Sau khi xóa sản phẩm !");
            materialManager.displayMaterial();
        } else {
            System.out.println(" Sản phẩm chưa tồn tại !");
        }


        boolean updateResult = materialManager.updateMaterial("2", "Bò");
        if (updateResult) {
            System.out.println("Sau khi cập nhật sản phẩm !");
            materialManager.displayMaterial();
        } else {
            System.out.println("Sản phẩm chưa tồn tại !");
        }
    }
}