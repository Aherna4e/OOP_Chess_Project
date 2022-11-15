import java.util.Objects;

public class Location {
    private final Enum column;
    private final int row;

    public Location(Enum column, int row) {
        this.column = column;
        this.row = row;
    }

    public Enum getColumn(){
        return this.column; //this or just column?
    }

    public int getRow(){
        return this.row; //with this or without???

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location location)) return false;
        return column == location.column &&
                Objects.equals(row, location.row);
    }

    @Override
    public int hashCode() {
        return Objects.hash(column, row);
    }
}
