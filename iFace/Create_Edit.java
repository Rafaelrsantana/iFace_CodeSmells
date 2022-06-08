public class Create_Edit extends Create {

    private int age;
    private int attributes = 0;
    private String gender;
    private String address;
    private String phone_number;
    private String[] new_attribute = new String[3];
    private String[] attribute_name = new String[3];

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender() {
        System.out.println("Digite o novo genero: ");
        String gender = input.nextLine();
        this.gender = gender;
    }

    public void setAddress() {
        System.out.println("Digite o novo endereco: ");
        String address = input.nextLine();
        this.address = address;
    }

    public void setPhone() {
        System.out.println("Digite o novo telefone(somente números!): ");
        String phone = input.nextLine();
        this.phone_number = phone;
    }

    public void Create() {
        System.out.println("Digite o nome do atributo que voce deseja criar: ");
        String attribute_name = input.nextLine();
        System.out.println("Digite o atributo que voce deseja criar: ");
        String attribute = input.nextLine();
        this.attribute_name[attributes] = attribute_name;
        this.new_attribute[attributes] = attribute;
        System.out.println("Atributo criado com sucesso!");
        attributes++;
    }

    public void getAge() {
        if (age == 0) {
            System.out.println(
                    "Idade nao cadastrada! Voce pode cadastrar indo em Editar perfil no menu iFace.");
        } else {
            System.out.println("Idade: " + age);
        }
        
    }

    public void getGender() {
        if (gender == null) {
            System.out.println(
                    "Genero nao cadastrado! Voce pode cadastrar indo em Editar perfil no menu iFace.");
        } else {
            System.out.println("Genero: " + gender);
        }
    }

    public void getAddress() {
        if (address == null) {
            System.out.println(
                    "Endereco nao cadastrado! Voce pode cadastrar indo em Editar perfil no menu iFace.");
        } else {
            System.out.println("Endereco: " + address);
        }
    }

    public void getPhone() {
        if (phone_number == null) {
            System.out.println(
                    "Telefone nao cadastrado! Voce pode cadastrar indo em Editar perfil no menu iFace.");
        } else {
            System.out.println("Telefone: " + phone_number);
        }
    }

    public void getAttribute() {
        for (int i = 0; i < new_attribute.length; i++) {
            if (new_attribute[i] != null) {
                System.out.println(attribute_name[i] + ": " + new_attribute[i]);
            }
        }
    }

    @Override
    public void delete() {
        this.address = null;
        this.age = 0;
        this.phone_number = null;
        this.gender = null;
        this.new_attribute = null;
        this.attribute_name = null;

    }
}