class DadaJi{

    String name = "Saryug";

      String surname = "Sharma";

    String Property = "20 lakhs";

    String bloodGroup = "O +ve";

    public String getSurname() {
        return surname;
    }

    public String getProperty() {
        return Property;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

  
}

class PapaJi extends DadaJi{

    String name = "Rajdev";
    
}

class Myself extends PapaJi{

    String name = "Prins";

    public static void main(String[] args) {
        
        PapaJi pa = new PapaJi();
        String property = pa.Property;
        String bgroup = pa.bloodGroup;
        String surname = pa.surname;

        Myself me = new Myself();
        System.out.println(me.name);
        System.out.println(surname);
        System.out.println(bgroup);
        System.out.println(property);
    }
}
