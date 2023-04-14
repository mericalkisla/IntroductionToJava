public class Company extends Customer {
    private String CompanyName;
    private int TaxNumber;

    public int getTaxNumber() {
        return TaxNumber;
    }

    public void setTaxNumber(int taxNumber) {
        TaxNumber = taxNumber;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }
}
