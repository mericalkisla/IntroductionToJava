public class CustomerManager {
    private Customer customer;
    private ICreditManager creditManager;
    public CustomerManager(Customer customer,ICreditManager creditManager) {
        this.customer = customer;
        this.creditManager = creditManager;
    }
    public void Save(){
        System.out.println("Kaydedildi Musteri :");
    }
    public void Delete(){
        System.out.println("Silindi Musteri :" );
    }
    public void GiveCredit(){
        creditManager.Calculate();
        System.out.println("Kredi verildi.");
    }
}
