package question1;

public class Dish {
    private int dishID;
    private String dishName;
    private String creationTime;

    public Dish(int dishID, String dishName, String creationTime) {
        this.dishID = dishID;
        this.dishName = dishName;
        this.creationTime = creationTime;
    }

    public int getDishID() {
        return dishID;
    }

    public String getDishName() {
        return dishName;
    }

    public String getCreationTime() {
        return creationTime;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishID=" + dishID +
                ", dishName='" + dishName + '\'' +
                ", creationTime='" + creationTime + '\'' +
                '}';
    }
}

