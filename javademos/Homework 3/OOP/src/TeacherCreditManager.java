public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{
    @Override
    public void Calculate() {
        System.out.println("Öğretmen kredisi hesaplandı.");
    }

    public void Save() {
        System.out.println("Öğretmen kredisi verildi.");
    }
}
