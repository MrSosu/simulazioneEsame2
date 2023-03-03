public class Employee {

    // attributi
    private static int counter = 0;
    private int id;
    private String name;
    private float efficiencyIndex;
    private int weeklyWorkingHours;

    // costruttore
    public Employee(String name, float efficiencyIndex, int weeklyWorkingHours) {
        this.id = ++counter;
        this.name = name;
        this.efficiencyIndex = efficiencyIndex;
        this.weeklyWorkingHours = weeklyWorkingHours;
    }

    // getters e setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getEfficiencyIndex() {
        return efficiencyIndex;
    }

    public int getWeeklyWorkingHours() {
        return weeklyWorkingHours;
    }

    public void setEfficiencyIndex(float efficiencyIndex) {
        this.efficiencyIndex = efficiencyIndex;
    }

    // metodi
    public boolean canApplyForPromotion() {
        return weeklyWorkingHours > 35 && efficiencyIndex > 0.65;
    }

    public boolean canBeDemoted() {
        return weeklyWorkingHours < 10 && efficiencyIndex < 0.5;
    }


}
