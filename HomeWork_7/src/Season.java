public enum Season{

    Лето("Зеленый"),
    Зима("Белый"),
    Осень("Желтый"),
    Весна("Серый");

    private final String color;

    Season (String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
