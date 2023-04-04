import java.time.LocalDate;

public class CrispyFlour extends Material
{
    private int quantity;

    protected CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity)
    {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return this.getQuantity() * this.getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusYears(1L);
    }
}