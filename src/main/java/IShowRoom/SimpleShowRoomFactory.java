package IShowRoom;

public class SimpleShowRoomFactory implements IShowRoomFactory {

    public IShowRoom getShowRoom(String showRoomName, String showRoomCity) {
        return new SimpleShowRoom(showRoomName, showRoomCity);
    }
}
