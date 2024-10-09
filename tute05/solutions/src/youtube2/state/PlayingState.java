package youtube2.state;

import youtube2.Viewing;

public class PlayingState extends ViewingState {
    public PlayingState(Viewing viewing) {
        super(viewing);
        getViewing().setPlaying(true);
    }

    @Override
    public String onLock() {
        getViewing().changeState(new LockedState(getViewing()));
        return "Locked.";
    }

    @Override
    public String onPlay() {
        getViewing().changeState(new ReadyState(getViewing()));
        return "Paused.";
    }

    @Override
    public String onNext() {
        return getViewing().getNextVideo();
    }
}
