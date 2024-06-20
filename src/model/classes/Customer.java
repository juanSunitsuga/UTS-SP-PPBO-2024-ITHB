package model.classes;

public class Customer {
    private int idCustomer;
    private String name;
    private String email;
    private String company;
    private boolean isMember;
    private Member member;

    public Customer(int idCustomer, String name, String email, String company, boolean isMember, Member member) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.email = email;
        this.company = company;
        this.isMember = isMember;
        this.member = member;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean member) {
        isMember = member;
    }

    public Member getMember() {
        if (isMember()) {
            return member;
        }
        return null;
    }

    public void setNewMember(Member member) {
        this.member = member;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
