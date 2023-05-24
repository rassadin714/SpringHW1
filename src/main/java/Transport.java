public class Transport {
    private String name;

    public Transport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void transportTest() {
        System.out.println(this.getClass() + "готов");
    }

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                '}';
    }
}
