package app.aaronsmith.cvgen.model;

public class ContactDetails {

    private String emailAddress;
    private String telephoneNumber;
    private String linkedinProfile;

    public ContactDetails() {
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getLinkedinProfile() {
        return linkedinProfile;
    }

    public void setLinkedinProfile(String linkedinProfile) {
        this.linkedinProfile = linkedinProfile;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[" + this.getClass().getSimpleName() + "]{");
        str.append("emailAddress=" + this.emailAddress + ", ");
        str.append("telephoneNumber=" + telephoneNumber + ", ");
        str.append("linkedinProfile=" + linkedinProfile);
        str.append("}");
        return str.toString();
    }
}
