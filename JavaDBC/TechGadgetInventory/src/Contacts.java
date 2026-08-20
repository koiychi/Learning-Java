public class Contacts {
    private int id;
    private String name;
    private String email;
    private String phone;

    public Contacts (String name, String email, String phone) {
        setName(name);
        setEmail(email);
        setPhone(phone);
    }


    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank. Enter a valid name.");
        }
        this.name = name;
    }

    public void setEmail(String email) { 
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be null or blank. Enter a valid email.");
        } else if (!email.contains("@")) {
            throw new IllegalArgumentException("Email must be complete and valid. Please check your email.");
        }

        this.email = email;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.isBlank()) {
            throw new IllegalArgumentException("Phone number cannot be null or blank. Please enter a valid phone number.");
        }
        if (phone.length() != 11) {
            throw new IllegalArgumentException("Phone number must be 11 digits long.");
        }
        this.phone = phone;
    }

    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getPhone() {return phone;}

    @Override
    public String toString() {
        return name + " <" + email + "> " + phone;
    }
}
