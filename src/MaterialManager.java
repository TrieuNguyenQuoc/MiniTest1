
import java.time.LocalDate;

public class MaterialManager {

    private Material[] materialList;
    private int n = 0;

    public MaterialManager()
    {
        materialList = new Material[100];
        materialList[0] = new CrispyFlour("1","Mì chính", LocalDate.of(2020,2,6),70000,10);
        materialList[1] = new CrispyFlour("2","Bột canh",LocalDate.of(2020,2,6),85000,8);
        materialList[2] = new CrispyFlour("3","Hạt nêm",LocalDate.of(2020,2,6),75000,9);
        materialList[3] = new CrispyFlour("4","Muối",LocalDate.of(2020,2,6),55000,7);
        materialList[4] = new CrispyFlour("5","Đường",LocalDate.of(2020,2,6),65000,7);
        materialList[5] = new Meat("6","Bò wagyu",LocalDate.of(2023,2,6),570000,50);
        materialList[6] = new Meat("7","Bò kobe",LocalDate.of(2023,2,6),2500000,56);
        materialList[7] = new Meat("8","Bò mẽo",LocalDate.of(2023,2,6),375000,94);
        materialList[8] = new Meat("9","Bò Việt Nam",LocalDate.of(2023,2,6),355000,67);
        materialList[9] = new Meat("10","Bò anh",LocalDate.of(2023,2,6),2065000,77);

        for (Material material : materialList)
        {
            if (material == null)
            {
                break;
            }
            this.n++;
        }
    }
    public void displayMaterial()
    {
        for (int i = 0; i < this.n; i++)
        {
            System.out.println(materialList[i].getId() + " " + materialList[i].getName() + " " + materialList[i].getAmount());
        }
    }
    public boolean addMaterial(Material value)
    {
        int i = 0;
        while (i < n && !materialList[i].getId().equalsIgnoreCase(value.getId()))
        {
           i++;
        }
        if (i >= n)
        {
            materialList[i] = value;
            this.n++;
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean removeMaterial(String id)
    {
        int i = 0;
        while (i < n && !materialList[i].getId().equalsIgnoreCase(id))
        {
            i++;
        }
        if (i >= n)
        {
            return false;
        }
        else
        {
            for (int j = i; j < n; j++)
            {
                materialList[j] = materialList[j+1];
            }
            this.n--;

           return true;
        }
    }
    public boolean updateMaterial(String id, String materialName)
    {
        int i = 0;
        while (i < n && !materialList[i].getId().equalsIgnoreCase(id))
        {
            i++;
        }
        if (i >= n)
        {
            return false;
        }
        else
        {
            Material materialUpdate = materialList[i];
            materialUpdate.setName(materialName);
            return true;
        }
    }
}