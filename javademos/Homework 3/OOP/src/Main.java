public class Main {
    public static void main(String[] args) {

        CreditManager creditManager = new CreditManager();
        //creditManager.Calculate();
        //creditManager.Save();

        Customer customer = new Customer();
        customer.setId(1);


//        Company company = new Company();
//        company.setCompanyName("Arçelik");
//        company.setTaxNumber(12345);
//
//        Person person = new Person();
//        person.setFirstName("Meriç");
//        person.setLastName("Alkışla");
//        person.setNationalIdentity("123456");

        //IoC Container
        CustomerManager customerManager = new CustomerManager(customer,new TeacherCreditManager());
        customerManager.GiveCredit();
        //customerManager.Save();
        //customerManager.Delete();

        //CustomerManager customerManager2 = new CustomerManager(person,new MilitaryCreditManager() );
        //customerManager2.GiveCredit();
        //customerManager2.Save();
        //customerManager2.Delete();
    }
}