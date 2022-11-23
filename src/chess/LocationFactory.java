package chess;

public class LocationFactory {
    private static final Enum[] files = Enum.values();
    public static Location build(Location current, int fileOffset,int rankOffset ){
        int currFile = current.getColumn().ordinal();//.ordinal();
        return new Location(files[currFile+fileOffset], current.getRow()+ rankOffset);


    }


}

