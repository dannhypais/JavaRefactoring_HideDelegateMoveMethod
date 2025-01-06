package pt.pa.refactoring.A_inappropriate_intimacy;

public class Main {

    public static void main(String[] args) {
	    MyContacts contacts = new MyContacts();

        contacts.addContact(new Person("Magee Garrett","260-929-568","est.Nunc@lectus.org"));
        contacts.addContact(new Person("Nerea Adams","227-520-290","nibh.vulputate@lorem.org"));
        contacts.addContact(new Person("Sydney Lara","249-448-640","mi.Aliquam@sollicitudin.edu"));
        contacts.addContact(new Person("Duncan House",null,"nec@feugiatplaceratvelit.edu"));
        contacts.addContact(new Person("Conan Mcfarland","214-866-672","enim@sempereratin.ca"));
        contacts.addContact(new Person("Philip Howell","284-576-609","at.pede@justofaucibus.edu"));
        contacts.addContact(new Person("Kiona Whitaker","297-723-280","at.pede@Nullamfeugiat.edu"));
        contacts.addContact(new Person("Quemby Green","203-675-275","cursus.et.magna@inconsequatenim.co.uk"));
        contacts.addContact(new Person("Hyacinth Reese",null,null));
        contacts.addContact(new Person("Sierra Shannon","212-829-582",null));
        contacts.addContact(new Person("Bevis Watson","251-167-074","quis@adipiscing.org Lilah Knight,247-359-792,eu@eutelluseu.ca"));
        contacts.addContact(new Person("Brent Keller","200-454-266","montes.nascetur.ridiculus@purusgravidasagittis.org"));
        contacts.addContact(new Person("Bruce Patterson","202-892-442",null));

        System.out.println(String.format("Contact list created at %s", contacts.getCreationDate().toString()));

        System.out.println(String.format("Contains %d contacts, of which %d don't have email address.", contacts.getNumberOfContacts(), contacts.countMissingEmailAddresses()));
    }
}
