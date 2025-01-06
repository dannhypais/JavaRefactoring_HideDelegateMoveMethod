package pt.pa.refactoring.A_inappropriate_intimacy;

public class Exercicio {
   /* public class Main {

        public static void main(String[] args) {
            MyContacts contacts = new MyContacts();

            contacts.list.add(new Person("Magee Garrett","260-929-568","est.Nunc@lectus.org"));
            contacts.list.add(new Person("Nerea Adams","227-520-290","nibh.vulputate@lorem.org"));
            contacts.list.add(new Person("Sydney Lara","249-448-640","mi.Aliquam@sollicitudin.edu"));
            contacts.list.add(new Person("Duncan House",null,"nec@feugiatplaceratvelit.edu"));
            contacts.list.add(new Person("Conan Mcfarland","214-866-672","enim@sempereratin.ca"));
            contacts.list.add(new Person("Philip Howell","284-576-609","at.pede@justofaucibus.edu"));
            contacts.list.add(new Person("Kiona Whitaker","297-723-280","at.pede@Nullamfeugiat.edu"));
            contacts.list.add(new Person("Quemby Green","203-675-275","cursus.et.magna@inconsequatenim.co.uk"));
            contacts.list.add(new Person("Hyacinth Reese",null,null));
            contacts.list.add(new Person("Sierra Shannon","212-829-582",null));
            contacts.list.add(new Person("Bevis Watson","251-167-074","quis@adipiscing.org Lilah Knight,247-359-792,eu@eutelluseu.ca"));
            contacts.list.add(new Person("Brent Keller","200-454-266","montes.nascetur.ridiculus@purusgravidasagittis.org"));
            contacts.list.add(new Person("Bruce Patterson","202-892-442",null));

            System.out.println(String.format("Contact list created at %s", contacts.creationDate.toString()));

            int missingEmail = 0;
            for(Person p : contacts.list) {
                if(p.emailAddress == null) missingEmail++;
            }

            System.out.println(String.format("Contains %d contacts, of which %d don't have email address.", contacts.list.size(), missingEmail));
        }
    }
    public class MyContacts {
    Set<Person> list;
    Date creationDate;

    public MyContacts() {
        list = new HashSet<>();
        creationDate = new Date();
    }

    public String show() {
        StringBuilder sb = new StringBuilder();

        sb.append( String.format("%40s | %20s | %40s", "Name", "Phone", "Email"));
        for(Person p : list) {
            // Check if person has phone number or email; if not say "None".
            sb.append(String.format("%40s | %20s | %40s",
    p.fullName, (p.phoneNumber != null ? p.phoneNumber : "None"),
            (p.emailAddress != null ? p.emailAddress : "None")));
            sb.append("\n");
}

        return sb.toString();
                }
                }
                public class Person {
    final String fullName;
    final String phoneNumber;
    final String emailAddress;

    public Person(String fullName, String phoneNumber, String emailAddress) {
        if(fullName == null || fullName.indexOf(" ") == -1)
            throw new IllegalArgumentException("Must have full name.");
        if(phoneNumber != null && phoneNumber.length() < 9)
            throw new IllegalArgumentException("Phone number too short.");
        if(emailAddress != null && emailAddress.indexOf("@") == -1)
            throw new IllegalArgumentException("Must have valid email.");

        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return fullName.split(" ", 2)[0];
    }

    public String getEmailDomain() {
        return emailAddress.substring(emailAddress.lastIndexOf("@") + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return fullName.equals(person.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName);
    }

}
    */
}
