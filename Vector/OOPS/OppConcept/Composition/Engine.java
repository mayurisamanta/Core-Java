public class Engine {

    private Integer horsePower;

    private String type;

    public Engine(Integer horsePower, String type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    public Engine() {
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
