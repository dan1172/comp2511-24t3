package youtube2.state;

import youtube2.Viewing;

public class ReadyState extends ViewingState {
    public ReadyState(Viewing viewing) {
        super(viewing);
        getViewing().setPlaying(false);
    }

    @Override
    public String onLock() {
        getViewing().changeState(new LockedState(getViewing()));
        return "Locked";
    }

    @Override
    public String onPlay() {
        getViewing().changeState(new PlayingState(getViewing()));
        return "Playing.";
    }

    @Override
    public String onNext() {
        return getViewing().getNextVideo();
    }
}
